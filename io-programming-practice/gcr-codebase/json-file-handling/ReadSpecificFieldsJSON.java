package data_handling.json_handler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadSpecificFieldsJSON {
	public static void main(String[] args) {
		try {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(new File("user.json"));
		for (JsonNode user : root) {

            String name = user.get("name").asText();
            String email = user.get("email").asText();

            System.out.println("Name: " + name + ", Email: " + email);
        }
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
}
