package ssst;

import java.util.ArrayList;
import java.util.HashMap;

public class Comparator {
    public HashMap<String, Boolean> Compare(ArrayList<YouTube>... items) {
        HashMap<String, Boolean> emailsNotInFilesList = new HashMap<String, Boolean>();
        for (var item :
                items) {
            for (var instance :
                    item) {
                if (!emailsNotInFilesList.containsKey(instance.accountEmail)) {
                    emailsNotInFilesList.put(instance.accountEmail, true);
                } else {
                    continue;
                }
            }
        }
        return emailsNotInFilesList;
    }
}
