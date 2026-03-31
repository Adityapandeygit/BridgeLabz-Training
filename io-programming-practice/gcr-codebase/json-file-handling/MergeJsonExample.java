package data_handling.json_handler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonExample {
	public static void main(String[] args) {
		try {
            ObjectMapper mapper = new ObjectMapper();

            // JSON Object 1
            String json1 = "{ \"name\":\"Aditya\", \"email\":\"aditya@gmail.com\" }";

            // JSON Object 2
            String json2 = "{ \"city\":\"Mathura\", \"age\":22 }";

            JsonNode node1 = mapper.readTree(json1);
            JsonNode node2 = mapper.readTree(json2);

            // Convert first JSON to ObjectNode
            ObjectNode mergedNode = (ObjectNode) node1;

            // Merge node2 into node1
            mergedNode.setAll((ObjectNode) node2);

            // Print Merged JSON
            String result = mapper.writerWithDefaultPrettyPrinter()
                                  .writeValueAsString(mergedNode);

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
