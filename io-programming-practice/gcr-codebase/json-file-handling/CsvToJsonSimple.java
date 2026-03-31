package data_handling.json_handler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CsvToJsonSimple {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new FileReader("users.csv"));
            String headerLine = br.readLine(); 
            String[] headers = headerLine.split(",");
            List<Map<String, String>> list = new ArrayList<>();

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Map<String, String> map = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    map.put(headers[i], values[i]);
                }

                list.add(map);
            }

            br.close();

            // Convert List → JSON
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter()
                                .writeValueAsString(list);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
