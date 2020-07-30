package DesignPattrens.memntoAssignment;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import DesignPattrens.memntoAssignment.ControlPanel.ControlPanelListener;

public class FreeDrawApp extends JFrame {

    DrawCommandManager manager;

    public FreeDrawApp() {
        this.setTitle("draw app");
        manager = new DrawCommandManager();

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        final DrawingPanel drawPanel = new DrawingPanel(manager);
        this.getContentPane().add(drawPanel, BorderLayout.CENTER);
        String[] btns = {"Undo", "Redo"};
        ControlPanel cp = new ControlPanel(btns);
        cp.addControlPanelListener(new ControlPanelListener() {

            @Override
            public void buttonPressed(String btnName) {
                //The try and catch is for an exception because you cant edit saved Drawings
                if (btnName.equals("Undo")) {
                    try{
                        manager.undo();
                    }catch (NullPointerException e){
                    }
                } else if (btnName.equals("Redo")) {
                    try{
                        manager.redo();
                    }catch (NullPointerException e){
                    }
                }
            }

        });
        this.getContentPane().add(cp, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //Reads The Saved Commands From a File
        try {

            FileInputStream fis = new FileInputStream("commands.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<DrawingCommand> savedCommands = (List<DrawingCommand>) ois.readObject();
            manager.setCommands(savedCommands);
            manager.setIndex(savedCommands.size());
            for(DrawingCommand c :savedCommands){
                c.execute(this.getGraphics());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot find Save File");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Saves The Command List to a file
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                List<DrawingCommand> commands = manager.getCommands();

                try {
                    FileOutputStream fos = new FileOutputStream("commands.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(commands);
                    oos.close();
                    
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FreeDrawApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FreeDrawApp.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

    public static void main(String args[]) {
        new FreeDrawApp();
    }

}
