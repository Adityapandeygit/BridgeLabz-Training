package dsa_practice.gcr_codebase.linkedlist;

class TaskNode{
	int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class TaskScheduleManager{
	 TaskNode head = null;
	 TaskNode current = null;
	 public void addAtBeginning(int id, String name, int priority, String date) {
		 TaskNode newNode = new TaskNode(id, name, priority, date);
		 if(head==null) {
			 head = newNode;
	         newNode.next = head;
		 }
		 else {
			 TaskNode temp = head;
			 while(temp.next!=head) {
				 temp = temp.next;
			 }
			 newNode.next = head;
	         temp.next = newNode;
	         head = newNode;
		 }
	 }
	 public void addAtEnd(int id, String name, int priority, String date) {
		 TaskNode newNode = new TaskNode(id, name, priority, date);
		 if(head==null) {
			 head = newNode;
	         newNode.next = head;
		 }
		 else {
			 TaskNode temp = head;
			 while(temp.next!=head) {
				 temp = temp.next;
			 }
			 
	         temp.next = newNode;
	         newNode.next = head;
		 }
	 }
	 public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
	        if (pos==1) {
	            addAtBeginning(id, name, priority, dueDate);
	            return;
	        }
	        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
	        TaskNode temp = head;
	        for(int i=1; i<pos-1 && temp.next != head; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	  }
	 public void removeTask(int taskId) {
		    if (head == null) {
		        System.out.println("Task list is empty");
		        return;
		    }
		    TaskNode current = head;
		    TaskNode previous = null;
		    while (true) {
		        if (current.taskId == taskId) {
		            // Case 1: only one node in list
		            if (current == head && current.next == head) {
		                head = null;
		            }
		            // Case 2: deleting head node
		            else if (current == head) {
		                TaskNode last = head;
		                while (last.next != head) {
		                    last = last.next;
		                }
		                head = head.next;
		                last.next = head;
		            }
		            // Case 3: deleting middle or last node
		            else {
		                previous.next = current.next;
		            }
		            System.out.println("Task removed: " + taskId);
		            return;
		        }
		        previous = current;
		        current = current.next;
		        if (current == head) {
		            break;
		        }
		    }

		    System.out.println("Task not found");
		}
	    public void viewNextTask() {
	        if (head == null) {
	            System.out.println("No tasks available");
	            return;
	        }
	        if (current == null) current = head;
	        System.out.println("Current Task:");
	        displayTask(current);
	        current = current.next;
	    }

	    public void displayTasks() {
	        if (head == null) {
	            System.out.println("Task list is empty");
	            return;
	        }
	        TaskNode temp = head;
	        do {
	            displayTask(temp);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    public void searchByPriority(int priority) {
	        if (head == null) {
	            System.out.println("Task list is empty");
	            return;
	        }
	        TaskNode temp = head;
	        boolean found = false;
	        while (true) {
	            if (temp.priority == priority) {
	                displayTask(temp);
	                found = true;
	            }
	            temp = temp.next;
	            if (temp == head) {
	                break;
	            }
	        }
	        if (found == false) {
	            System.out.println("No task found with priority " + priority);
	        }
	    }
	    public void displayTask(TaskNode t) {
	        System.out.println("ID: " + t.taskId);
	        System.out.println("Name: " + t.taskName);
	        System.out.println("Priority: " + t.priority);
	        System.out.println("Due Date: " + t.dueDate);
	    }
}
public class TaskScheduler {
	public static void main(String[] args) {
		TaskScheduleManager scheduler = new TaskScheduleManager();
        scheduler.addAtEnd(1, "Design Module", 2, "10-Jan");
        scheduler.addAtEnd(2, "Code Feature", 1, "12-Jan");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "08-Jan");
        scheduler.addAtPosition(2, 4, "Testing", 3, "15-Jan");

        System.out.println("All Tasks:");
        scheduler.displayTasks();

        System.out.println("View Next Task:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("Search Priority = 1");
        scheduler.searchByPriority(1);

        System.out.println("Remove Task ID 2");
        scheduler.removeTask(2);

        System.out.println("Updated Task List:");
        scheduler.displayTasks();
	}

}
