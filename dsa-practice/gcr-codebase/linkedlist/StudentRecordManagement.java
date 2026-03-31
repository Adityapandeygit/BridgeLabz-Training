package dsa_practice.gcr_codebase.linkedlist;


class StudentNode{
	int roll;
	String name;
	int age;
	char grade;
	StudentNode next;
	
	StudentNode(int roll,String name,int age,char grade){
		this.age = age;
		this.grade = grade;
		this.name = name;
		this.roll = roll;
	}
}
class StudentManager {
    StudentNode head = null;

    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("No records");
            return;
        }

        if (head.roll == roll) {
            head = head.next;
            System.out.println("Record deleted");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            if (temp.next.roll == roll) {
                temp.next = temp.next.next;
                System.out.println("Record deleted");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Record not found");
    }

    public void searchByRoll(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public void upgradeGrade(int roll, char grade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = grade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public void display() {
        if (head == null) {
            System.out.println("No records");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Name : " + temp.name);
            System.out.println("Roll : " + temp.roll);
            System.out.println("Age : " + temp.age);
            System.out.println("Grade : " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		 sm.addAtBeginning(101, "Aditya", 21, 'A');
	        sm.addAtEnd(102, "Rahul", 22, 'B');
	        sm.addAtEnd(103, "Neha", 20, 'A');

	        // Display all students
	        System.out.println("All Student Records:");
	        sm.display();

	        // Search student
	        sm.searchByRoll(102);

	        // Upgrade grade
	        sm.upgradeGrade(103, 'A');

	        // Delete a student
	        sm.deleteByRoll(101);

	        // Display after deletion
	        System.out.println("After Deletion:");
	        sm.display();
	}
	
}
