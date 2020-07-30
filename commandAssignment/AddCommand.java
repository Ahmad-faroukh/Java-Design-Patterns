package commandAssignment;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author ACER E15
 */
public class AddCommand implements UndoableCommand {

    JTextField textField;
    DefaultListModel listModel;
    ArrayList<String> myList;
    int index;

    public AddCommand(ArrayList<String> myList, DefaultListModel list, int index, JTextField textField) {
        this.textField = textField;
        this.listModel = list;
        this.index = index;
        this.myList = myList;
    }

    @Override
    public void execute() {
        try {
            index++;
            listModel.addElement(myList.get(index + 1));
            textField.setText(myList.get(index + 2));
        } catch (IndexOutOfBoundsException e) {
            textField.setText("");
        }

    }

    @Override
    public void undo() {

        textField.setText(listModel.getElementAt(listModel.size() - 1).toString());
        listModel.remove(listModel.size() - 1);
        index--;

    }

}
