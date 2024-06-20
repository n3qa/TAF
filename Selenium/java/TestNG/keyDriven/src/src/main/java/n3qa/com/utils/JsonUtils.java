package n3qa.com.utils;

import n3qa.com.constants.FrameworkConstants;
import n3qa.com.helpers.Helpers;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * To construct the map by the reading the config values from JSON. Not used in this framework but can be leveraged
 * instead of property file based on the requirements
 */
public class JsonUtils {

    private static Map<String, String> CONFIGMAP;

    private JsonUtils() {
    }

    //Used to initialize static data members. (CONFIGMAP)
    //It is executed before main method at class load time.
    static {
        try {
            CONFIGMAP = new ObjectMapper().readValue(new File(Helpers.getCurrentDir() + FrameworkConstants.JSON_DATA_FILE_PATH),
                    new TypeReference<HashMap<String, String>>() {
                    });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.toLowerCase()))) {
            try {
                throw new Exception("Key name " + key + " is not found. Please check config.json");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return CONFIGMAP.get(key.toLowerCase());
    }

}
