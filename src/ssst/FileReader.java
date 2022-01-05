package ssst;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public String path;

    public FileReader(String path) {
        this.path = path;
    }

    public ArrayList<YouTube> readLines() {
        ArrayList<YouTube> youTubeItems = new ArrayList<YouTube>();
        try {
            Scanner sc = new Scanner(new File(this.path));
            sc.nextLine();
            while (sc.hasNextLine()) {
                //YouTube youtubeItem = new YouTube(sc.next(), )
                String line = sc.nextLine();
                String[] items = line.split(",");
                items[2].replace("[,.]", "");
                if (items[2].contains("\""))
                    continue;
                youTubeItems.add(new YouTube(items[0], items[1], Integer.parseInt(items[2])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return youTubeItems;
    }
}
