package dsa_practice.gcr_codebase.linkedlist;

class ItemNode {
	int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;
    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryManage{
	ItemNode head;
	public void addAtBeginning(int id, String name, int qty, double price) {
		ItemNode newNode = new ItemNode(id, name, qty, price);
		if (head == null) {
            head = newNode;
            return;
        }
		newNode.next = head;
		head = newNode;
	}
	public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
	public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1;i<pos - 1;i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }
	public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }
	public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
	public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
	public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found");
    }
	public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }
	
	private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
	
	public void displayAll() {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }
	public void displayItem(ItemNode i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: ₹" + i.price
        );
    }
	public void sortByName() {
        if (head == null) return;
        ItemNode i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.itemName.compareToIgnoreCase(j.itemName) > 0) {
                    swapData(i, j);
                }
            }
        }
    }

    public void sortByPrice() {
        if (head == null) return;
        ItemNode i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.price > j.price) {
                    swapData(i, j);
                }
            }
        }
    }

    private void swapData(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }
}
public class InventoryManagementSystem {
	 public static void main(String[] args) {
		 InventoryManage inv = new InventoryManage();

	        inv.addAtBeginning(101, "Laptop", 5, 50000);
	        inv.addAtEnd(102, "Mouse", 50, 500);
	        inv.addAtEnd(103, "Keyboard", 20, 1500);

	        inv.displayAll();
	        inv.calculateTotalValue();

	        inv.displayAll();

	        inv.searchById(102);
	        inv.updateQuantity(102, 60);

	        inv.displayAll();
	}
}
