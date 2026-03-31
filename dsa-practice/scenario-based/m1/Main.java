package m1;

import java.util.*;

class PlaylistManager {

    LinkedList<String> playlist = new LinkedList<>();

    public int addSong(String songId) {
        if (!playlist.contains(songId)) {
            playlist.add(songId);
            return 1;
        }
        return 0;
    }

    public int removeSong(String songId) {
        if (playlist.contains(songId)) {
            playlist.remove(songId);
            return 1;
        }
        return 0;
    }

    public int moveToTop(String songId) {
        if (playlist.contains(songId)) {
            playlist.remove(songId);
            playlist.addFirst(songId);
            return 1;
        }
        return 0;
    }

    public String display() {
        String result = "";
        for (String song : playlist) {
            result += song + " ";
        }
        return result.trim();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlaylistManager pm = new PlaylistManager();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();
            String[] parts = s.split(" ");
            String command = parts[0];

            switch (command) {

                case "ADD":
                    pm.addSong(parts[1]);
                    break;

                case "REMOVE":
                    pm.removeSong(parts[1]);
                    break;

                case "TOP":
                    pm.moveToTop(parts[1]);
                    break;

                case "PRINT":
                    System.out.println(pm.display());
                    break;
            }
        }

        sc.close();
    }
}