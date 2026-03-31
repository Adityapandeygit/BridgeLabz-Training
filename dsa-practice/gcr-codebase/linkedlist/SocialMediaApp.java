package dsa_practice.gcr_codebase.linkedlist;
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
class SocialMediaSystem {
    private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add Friend Connection (Bidirectional)
    public void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriend(u1, id2);
        addFriend(u2, id1);

        System.out.println("Friend connection added");
    }
    private void addFriend(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;
        while (temp != null) {
            if (temp.friendId == friendId)
                return; // already friend
            temp = temp.next;
        }
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove Friend Connection
    public void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }
        removeFriend(u1, id2);
        removeFriend(u2, id1);
        System.out.println("Friend connection removed");
    }

    private void removeFriend(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;
        if (temp != null && temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }
        while (temp != null && temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    // Mutual Friends
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friendHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("No mutual friends");
    }

    // Search User by Name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Search User by ID
    public void searchById(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            displayUser(user);
        else
            System.out.println("User not found");
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
    private void displayUser(UserNode u) {
        System.out.println(
            "ID: " + u.userId +
            ", Name: " + u.name +
            ", Age: " + u.age
        );
    }
}

public class SocialMediaApp {
	public static void main(String[] args) {
        SocialMediaSystem sm = new SocialMediaSystem();
        sm.addUser(1, "Aman", 21);
        sm.addUser(2, "Riya", 22);
        sm.addUser(3, "Neha", 20);
        sm.addUser(4, "Rahul", 23);
        
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);
        
        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);

        sm.searchByName("Riya");
        sm.countFriends();
    }
}
