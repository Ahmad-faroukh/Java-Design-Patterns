package SearchFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ACER E15
 */


public class CriteriaFacotry {
     public static Map<Integer, String> map = new HashMap<>();

    static {
        File file = new File("E:\\Java\\Draft\\src\\SearchFactory\\SearchCriterias");
        File[] folderFiles = file.listFiles();

        int i = 0;
        for (File f : folderFiles) {
            if (f.getName().contains(".java")) {

                String className = f.getName().split("\\.")[0];
                map.put(i, className);
                
                i++;
            }
        }
    }

    public static String getCriterias(int num) {
        return map.get(num);
    }
}
