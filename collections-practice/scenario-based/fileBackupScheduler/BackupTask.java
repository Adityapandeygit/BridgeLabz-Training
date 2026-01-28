package collections_practice.scenario_based.fileBackupScheduler;

public class BackupTask implements Comparable<BackupTask>{
	String path;
    int priority;

    BackupTask(String path, int priority) throws InvalidBackupPathException {
        if (path == null || path.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        this.path = path;
        this.priority = priority;
    }


	@Override
    public int compareTo(BackupTask b) {
        return b.priority - this.priority; // higher priority first
    }
}
