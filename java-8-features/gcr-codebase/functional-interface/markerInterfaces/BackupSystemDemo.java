package java_8_features.functionalInterface.markerInterfaces;


interface BackupSerializable {
}
class CustomerData implements BackupSerializable {
    String name;
    int id;

    CustomerData(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class TempSessionData {
    String sessionId;

    TempSessionData(String sessionId) {
        this.sessionId = sessionId;
    }
}
class BackupSystem {
	public static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Skipping backup (Not Serializable): " + obj.getClass().getSimpleName());
        }
    }
}
public class BackupSystemDemo {
    public static void main(String[] args) {
        CustomerData customer = new CustomerData("Aditya", 101);
        TempSessionData session = new TempSessionData("ABC123");

        BackupSystem.processBackup(customer);
        BackupSystem.processBackup(session);
    }
}
