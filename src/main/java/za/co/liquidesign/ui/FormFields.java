package za.co.liquidesign.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Graham.Twine@liquidesign.co.za
 */
public class FormFields {

	/**
	 * Main data attribute
	 */
	private Map<String, String> properties = new HashMap<>();

	/**
	 * Init for FormFields with a ready made properties (Clone an existing one)
	 *
	 * @param properties HashMap {@literal <}String, Object{@literal>} attribute
	 */
	public FormFields(Map<String, String> properties) {
		this.properties = properties;
	}

	/**
	 * Init for FormFields from scratch with empty properties attribute
	 *
	 */
	public FormFields() {
	}

	/**
	 * Set a value for the key in HashMap
	 *
	 * @param key   String
	 * @param value String
	 * @return Object
	 */
	public String setProperty(String key, String value) {
		return this.properties.put(key, value);
	}

	/**
	 * Get Object by key in HashMap
	 *
	 * @param key String
	 * @return Object
	 */
	public String getProperty(String key) {
		return this.properties.get(key);
	}

	/**
	 * Return properties as JSON Array String
	 *
	 * @return Set of properties
	 */
	public Set<String> getKeys() {
		return this.properties.keySet();
	}

	public String toString() {
		StringBuilder body = new StringBuilder();
		Set<String> keys = getKeys();

		for (String curKey : keys) {
			body.append(curKey).append(" = ").append(getProperty(curKey)).append("\n");
		}

		return body.toString();
	}
}
