package collections_practice.scenario_based.fileBackupScheduler;

import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {

        PriorityQueue<BackupTask> pq = new PriorityQueue<>();

        try {
            pq.add(new BackupTask("/system", 3));
            pq.add(new BackupTask("/documents", 1));
            pq.add(new BackupTask("/database", 5));
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Executing backups:");

        while (!pq.isEmpty()) {
            BackupTask task = pq.poll();
            System.out.println("Backing up: " + task.path);
        }
    }
}
