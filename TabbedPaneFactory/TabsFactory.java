package TabbedPaneFactory;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class TabsFactory {

    public static Map<Integer, Class<? extends javax.swing.JPanel>> map = new HashMap<>();

    static {
        File file = new File("E:\\Java\\Draft\\src\\TabbedPaneFactory\\Tabs");
        File[] folderFiles = file.listFiles();

        int i = 0;
        for (File f : folderFiles) {
            if (f.getName().contains(".java")) {

                String className = f.getName().split("\\.")[0];
                try {
                    Class<? extends javax.swing.JPanel> panel = Class.forName("TabbedPaneFactory.Tabs." + className).asSubclass(javax.swing.JPanel.class);

                    map.put(i, panel);
                    i++;

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TabsFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }

    }

    public static javax.swing.JPanel getPanel(int num) {
        Class<? extends javax.swing.JPanel> p = map.get(num);
        try {
            JPanel tab = (JPanel) p.getConstructor().newInstance();
            return tab;

        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(TabsFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
