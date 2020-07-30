package commandAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER E15
 */
public class CommandManager {

    List<UndoableCommand> commands = new ArrayList<>();
    int index = 0;
    

    public void addCommand(UndoableCommand c) {
        commands.add(c);
        index++;
    }

    public void undo() {
        if (index > 0) {
            index--;
            UndoableCommand c = commands.get(index);
            c.undo();
        }
    }

    public void redo() {
        if (index < commands.size()) {
            UndoableCommand c = commands.get(index);
            c.execute();
            index++;
        }
    }
}
