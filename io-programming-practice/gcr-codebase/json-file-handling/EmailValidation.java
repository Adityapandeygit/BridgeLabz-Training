package data_handling.json_handler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmailValidation {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            String json = "{ \"name\":\"Aditya\", \"email\":\"aditya@gmail.com\" }";

            JsonNode node = mapper.readTree(json);

            String email = node.path("email").asText();

            // Simple Email Check
            if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                System.out.println("Valid Email");
            } else {
                System.out.println("Invalid Email");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
