package data_handling.json_handler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonByAge {
	public static void main(String[] args) {
		try {
            ObjectMapper mapper = new ObjectMapper();
            String json = "["
                    + "{\"name\":\"Aditya\",\"age\":22},"
                    + "{\"name\":\"Rahul\",\"age\":28},"
                    + "{\"name\":\"Neha\",\"age\":30}"
                    + "]";

            JsonNode root = mapper.readTree(json);

            for (JsonNode user : root) {

                int age = user.path("age").asInt();

                if (age > 25) {
                    System.out.println(user.path("name").asText());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
