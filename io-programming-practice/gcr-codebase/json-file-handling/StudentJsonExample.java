package data_handling.json_handler;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonExample {
	public static void main(String[] args) {
		JSONArray subjects = new JSONArray();
		subjects.put("Mathematics");
        subjects.put("Computer Science");
        subjects.put("Data Structures");
        
        JSONObject student = new JSONObject();
        student.put("name", "Aditya");
        student.put("age", 21);
        student.put("subjects", subjects);
        System.out.println(student.toString());
	}
}
