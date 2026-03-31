package oops_practice.scanrio_based.addressbook;

import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AddressBookDao {

    private List<Contacts> contactsList = new ArrayList<>();

    // Use Case 2 - Add Contact
    public boolean addContact(Contacts contact) {
    	if (isDuplicate(contact.getFirstName(), contact.getLastName())) {
            return false;
        }
        contactsList.add(contact);
        return true;
    }

    // Use Case 3 - Find Contact 
    public Contacts findByName(String firstName, String lastName) {
        for (Contacts c : contactsList) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null;
    }

    // Use Case 3 - Update Contact 
    public void updateContact(Contacts contact,
                              String address, String city, String state,
                              String zip, String phone, String email) {

        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phone);
        contact.setEmail(email);
    }

    // Use Case 4 - Delete Contact
    public boolean deleteContactByName(String firstName, String lastName) {
        for (int i = 0; i < contactsList.size(); i++) {
            Contacts c = contactsList.get(i);
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                contactsList.remove(i);
                return true;
            }
        }
        return false;
    }

    // Use Case 5 - Add Multiple Contacts
    public void addMultipleContacts(List<Contacts> contacts) {
        contactsList.addAll(contacts);
    }

    // Get all contacts
    public List<Contacts> getAllContacts() {
        return contactsList;
    }
    
    // Use Case - 7
    public boolean isDuplicate(String firstName, String lastName) {
        for (Contacts c : contactsList) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }
    
    
    // Use Case - 11
    // Sort contacts alphabetically by First Name, then Last Name
    public void sortByName() {
        contactsList.sort(
            Comparator.comparing(Contacts::getFirstName, String.CASE_INSENSITIVE_ORDER)
                      .thenComparing(Contacts::getLastName, String.CASE_INSENSITIVE_ORDER)
        );
    }
    
    // Use Case - 12
    // Sort by City
    public void sortByCity() {
        contactsList.sort(Comparator.comparing(Contacts::getCity, String.CASE_INSENSITIVE_ORDER));
    }

    // Sort by State
    public void sortByState() {
        contactsList.sort(Comparator.comparing(Contacts::getState, String.CASE_INSENSITIVE_ORDER));
    }

    // Sort by Zip
    public void sortByZip() {
        contactsList.sort(Comparator.comparing(Contacts::getZip));
    }
    
    
    // use Case - 13
    public void saveToFile(String fileName){
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter("source.txt"))) {
    		for (Contacts c : contactsList) {
                writer.write(
                        c.getFirstName() + "," +
                        c.getLastName() + "," +
                        c.getAddress() + "," +
                        c.getCity() + "," +
                        c.getState() + "," +
                        c.getZip() + "," +
                        c.getPhoneNumber() + "," +
                        c.getEmail()
                );
                writer.newLine();
            }
    		System.out.println("Contacts saved successfully to file: " + fileName);
    	}
    	catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
    
    public void loadFromFile(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 8) {
                    contactsList.add(new Contacts(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]));

                }
            }

            System.out.println("Contacts loaded successfully from file: " + fileName);

        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }
    
    
 // UC-14 
    public void saveToCSV(String fileName) {

        try (CSVWriter writer = new CSVWriter(new FileWriter(fileName))) {

            String[] header = {
                    "FirstName","LastName","Address",
                    "City","State","Zip","Phone","Email"
            };
            writer.writeNext(header);

            // Data
            for (Contacts c : contactsList) {

                String[] data = {
                        c.getFirstName(),
                        c.getLastName(),
                        c.getAddress(),
                        c.getCity(),
                        c.getState(),
                        c.getZip(),
                        c.getPhoneNumber(),
                        c.getEmail()
                };

                writer.writeNext(data);
            }

            System.out.println("Contacts saved to CSV successfully");

        } catch (Exception e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }
    
    
    // UC-14 Read Contacts From CSV Using OpenCSV
    public void loadFromCSV(String fileName) {

        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {

            contactsList.clear();

            String[] line;
            boolean isHeader = true;

            while ((line = reader.readNext()) != null) {

                // Skip Header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                Contacts contact = new Contacts(
                        line[0],
                        line[1],
                        line[2],
                        line[3],
                        line[4],
                        line[5],
                        line[6],
                        line[7]
                );

                contactsList.add(contact);
            }

            System.out.println("Contacts loaded from CSV successfully");

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
    
 // UC-15 Save Contacts To JSON Using GSON
    public void saveToJSON(String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(contactsList, writer);

            System.out.println("Contacts saved to JSON successfully");

        } catch (Exception e) {
            System.out.println("Error saving JSON: " + e.getMessage());
        }
    }
    
 // UC-15 Load Contacts From JSON Using GSON
    public void loadFromJSON(String fileName) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            Type listType = new TypeToken<List<Contacts>>() {}.getType();
            List<Contacts> loadedContacts = gson.fromJson(reader, listType);
            if (loadedContacts != null) {
                contactsList.clear();
                contactsList.addAll(loadedContacts);
            }

            System.out.println("Contacts loaded from JSON successfully");

        } catch (Exception e) {
            System.out.println("Error loading JSON: " + e.getMessage());
        }
    }


}
