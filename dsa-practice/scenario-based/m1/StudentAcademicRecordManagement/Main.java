package m1.StudentAcademicRecordManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Map<String, Integer>> records = new HashMap<>();
		while(true) {
			 String input = sc.nextLine();
	            if (input.equals("EXIT")) {
	                break;
	            }
	            String[] parts = input.split(" ");
	            String command = parts[0];
	            switch(command) {
	            case "ADD":
                    String student = parts[1];
                    String subject = parts[2];
                    int marks = Integer.parseInt(parts[3]);
                    records.putIfAbsent(student, new HashMap<>());
                    Map<String, Integer> subjectMap = records.get(student);
                    if(!subjectMap.containsKey(subject)) {
                    	subjectMap.put(subject, marks);
                    }
                    else {
                    	if(marks > subjectMap.get(subject)) {
                    		subjectMap.put(subject, marks);
                    	}
                    }
                    break;
                    
	            case "Remove" :
	            	student = parts[1];
                    subject = parts[2];
                    if(!records.containsKey(student)|| !records.get(student).containsKey(subject)) {
                    	System.out.println("INVALID REQUEST");
                    }
                    else {
                    	records.get(student).remove(subject);
                    	if(records.get(student).isEmpty()) {
                    		records.remove(student);
                    	}
                    }

	            break;
	            
	            case "Top" :
	            	subject = parts[1];
	            	int max = -1;
	            	for(String s: records.keySet()) {
	            		Map<String, Integer> m = records.get(s);
	            		for(String str : m.keySet()) {
	            			if(str.equals(subject)) {
	            				if(m.get(str)>max) {
	            					max = m.get(str);
	            				}
	            			}
	            		}
	            	}
	            	if (max == -1) {
                        System.out.println("SUBJECT NOT FOUND");
                    } else {
                        System.out.println(max);
                    }
	            break;
	            
	            case "STUDENT_TOP":
	            	student = parts[1];
	            	if(!records.containsKey(student)) {
	            		System.out.println("STUDENT NOT FOUND");
	            	}
	            	else {
	            		Map<String, Integer> map = records.get(student);
	            		int highest = -1;
	            		for(String m : map.keySet()) {
	            			highest = Math.max(map.get(m), highest);
	            		}
	            		for(String m : map.keySet()) {
	            			if(map.get(m)==highest) {
	            				System.out.println(m + " "+ highest);
	            			}
	            		}
	            	}
	            break;
	            
	            case "AVERAGE":
	            	subject = parts[1];
	            	int sum = 0;
                    int count = 0;
                    for(String s : records.keySet()) {
                    	Map<String,Integer> map = records.get(s);
                    	for(String s1 : map.keySet()) {
                    		if(s1.equals(subject)) {
                    			sum+=map.get(s1);
                    			count++;
                    		}
                    	}
                    }
                    if (count == 0) {
                        System.out.println("SUBJECT NOT FOUND");
                    } else {
                        System.out.println(sum / count); 
                    }
               break;
               
	            case "DISPLAY":
                    for (Map.Entry<String, Map<String, Integer>> entry : records.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                default:
                    System.out.println("INVALID COMMAND");
		}
	}
	}
}
