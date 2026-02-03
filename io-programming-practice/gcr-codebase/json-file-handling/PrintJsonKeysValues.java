package data_handling.json_handler;

import java.util.HashMap;
import java.util.Map;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintJsonKeysValues {
	public static void main(String[] args) {
		try {
            ObjectMapper mapper = new ObjectMapper();

            // JSON → HashMap
            HashMap<String, Object> map =
                    mapper.readValue(new File("users.json"), HashMap.class);

            // Print keys and values
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
