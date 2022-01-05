package ssst;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        FileReader fr_1 = new FileReader("D:\\Projekti\\Java assignment 1\\data\\youtube_1.csv");
        FileReader fr_2 = new FileReader("D:\\Projekti\\Java assignment 1\\data\\youtube_2.csv");
        var youtubeList_1 = fr_1.readLines();
        var youtubeList_2 = fr_2.readLines();

        Comparator comparator = new Comparator();
        var emailsNotInFilesList = comparator.Compare(youtubeList_1, youtubeList_2);
        for (HashMap.Entry<String,Boolean> entry : emailsNotInFilesList.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}
