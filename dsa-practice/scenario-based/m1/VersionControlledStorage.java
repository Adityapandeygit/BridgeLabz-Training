package m1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Version {
    String version;
    int size;

    Version(String version, int size) {
        this.version = version;
        this.size = size;
    }
}
public class VersionControlledStorage {
	static Map<String, List<Version>> storage = new HashMap<>();
	public static void upload(String file, String version, int size) {

        storage.putIfAbsent(file, new ArrayList<>());

        List<Version> versions = storage.get(file);

        // check duplicate version
        for (Version v : versions) {
            if (v.version.equals(version)) {
                return;
            }
        }

        versions.add(new Version(version, size));
    }
	public static void fetch(String file) {

        if (!storage.containsKey(file)) {
            System.out.println("File Not Found");
            return;
        }

        List<Version> versions = new ArrayList<>(storage.get(file));

        versions.sort((a, b) -> {
            if (a.size != b.size)
                return a.size - b.size;
            return a.version.compareTo(b.version);
        });

        for (Version v : versions) {
            System.out.println(file + " " + v.version + " " + v.size);
        }
    }
	public static void latest(String file) {

        if (!storage.containsKey(file) || storage.get(file).isEmpty()) {
            System.out.println("File Not Found");
            return;
        }

        List<Version> versions = storage.get(file);
        Version v = versions.get(versions.size() - 1);

        System.out.println(file + " " + v.version + " " + v.size);
    }
	public static void totalStorage(String file) {

        if (!storage.containsKey(file)) {
            System.out.println("File Not Found");
            return;
        }

        int sum = 0;

        for (Version v : storage.get(file)) {
            sum += v.size;
        }

        System.out.println(file + " " + sum);
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String op = parts[0];

            if (op.equals("UPLOAD")) {
                upload(parts[1], parts[2], Integer.parseInt(parts[3]));
            }

            else if (op.equals("FETCH")) {
                fetch(parts[1]);
            }

            else if (op.equals("LATEST")) {
                latest(parts[1]);
            }

            else if (op.equals("TOTAL_STORAGE")) {
                totalStorage(parts[1]);
            }
        }
    }

}
