package za.co.payhost.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import za.co.payhost.ui.FormFields;

/**
 * PayWeb3 primary Object
 *
 * @author App Inlet (Pty) Ltd
 * @see <a href="https://qa.paygate.co.za/api/?java">PayWeb3</a>
 * @version 1.0
 * @since 1.0
 */
public class PayWeb3 {

	private String url;

	private static final List<Header> headers = new ArrayList<>();
	MultipartEntityBuilder builder = MultipartEntityBuilder.create();

	private static final String REQ_FIELD = "------WebKitFormBoundary7MA4YWxkTrZu0gW\nContent-Disposition: form-data; name=\"%s\"\n\n%s\n";

	/**
	 * Init with url for PayWeb3 Class
	 *
	 * @param url SOAP Message Endpoint URL
	 */
	public PayWeb3(String url) {
		this.url = url;
		createHeaders();
		builder.setMode(HttpMultipartMode.STRICT);
	}

	private void createHeaders() {
		headers.add(new BasicHeader(// application/x-www-form-urlencoded
				HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW"));
		headers.add(new BasicHeader(HttpHeaders.CACHE_CONTROL, "no-cache"));
	}

	/**
	 * Post Request
	 *
	 * @param formFields String created from body function
	 * @return String response of the request
	 * @throws java.io.IOException java.io.IOException
	 */
	public String request(FormFields formFields) throws IOException {
		HttpClient client = HttpClientBuilder.create().setDefaultHeaders(headers).build();

		builder.addTextBody("text", body(formFields), ContentType.TEXT_PLAIN);

		HttpEntity entity = builder.build();
		HttpUriRequest request = RequestBuilder.post(this.url).setEntity(entity).build();

		HttpResponse response = client.execute(request);

		StringBuilder responseData = new StringBuilder();
		try (Reader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(),
				Charset.forName(StandardCharsets.UTF_8.name())))) {
			int c = 0;
			while ((c = reader.read()) != -1) {
				responseData.append((char) c);
			}
		}

		return responseData.toString();
	}

	/**
	 * Build Request Body from params
	 *
	 * @param object params of the body
	 * @return String body of the form post request
	 */
	private static String body(FormFields fields) {
		StringBuilder body = new StringBuilder();
		Set<String> keys = fields.getKeys();

		for (String curKey : keys) {
			body.append(field(curKey, fields.getProperty(curKey)));
		}

		body.append("------WebKitFormBoundary7MA4YWxkTrZu0gW--");

		return body.toString();
	}

	/**
	 * Build Request Body Field from key/value
	 *
	 * @param name  the name of the field
	 * @param value the value of the field
	 * @return String Request Body Field
	 */
	private static String field(String name, String value) {
		return String.format(REQ_FIELD, name.toUpperCase(), value);
	}

	/**
	 * https://docs.paygate.co.za/#query
	 * 
	 * This field contains a calculated MD5 hash based on the values of the
	 * PAYGATE_ID, PAY_REQUEST_ID, REFERENCE fields and a key. Refer to the section
	 * on Security below for more detail regarding the MD5 hash.
	 * 
	 * @param md5 String to hash
	 * @return String
	 */
	public static final String md5Hash(String data) {
		try {
			byte[] array = MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(data.getBytes());

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
		}
		return null;
	}
}
