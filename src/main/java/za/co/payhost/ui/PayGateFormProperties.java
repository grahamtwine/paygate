package za.co.payhost.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Helper to manipulate dynamic creation of fields
 *
 * @author App Inlet (Pty) Ltd
 * @version 1.0
 * @since 1.0
 */
public class PayGateFormProperties {

    /**
     * Main data attribute
     */
    private Map<String, String> properties = new HashMap<>();

    /**
     * Init for PayGateFormProperties with a ready made properties (Clone an existing one)
     *
     * @param properties HashMap {@literal <}String, Object{@literal>} attribute
     */
    public PayGateFormProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * Init for PayGateFormProperties from scratch with empty properties attribute
     *
     */
    public PayGateFormProperties() {
    }

    /**
     * Set a value for the key in HashMap
     *
     * @param key String
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
        String body = "";
        Set<String> keys = getKeys();
        
        for (String curKey : keys) {
            body += curKey + " = " +  getProperty(curKey) + "\n";
        }
        
        return body;
    }
}
