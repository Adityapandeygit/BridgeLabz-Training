package data_handling.json_handler;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonSimple {
	public static void main(String[] args) {
		String json = "{ \"name\":\"Aditya\", \"email\":\"aditya@gmail.com\" }";
		ObjectMapper mapper = new ObjectMapper();
		try {
            mapper.readTree(json);   
            System.out.println("Valid JSON");

        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
	}
}
