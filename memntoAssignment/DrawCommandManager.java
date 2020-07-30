package DesignPattrens.memntoAssignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DrawCommandManager implements Serializable{

    List<DrawingCommand> commands = new ArrayList<>();
    int index = 0;

    public void addCommand(DrawingCommand c) {
        commands.add(c);
        index++;
    }

    public void undo() {
        if (index > 0) {
            index--;
            DrawingCommand c = commands.get(index);
            c.unexecute();
        }
    }

    public void redo() {
        if (index < commands.size()) {
            DrawingCommand c = commands.get(index);
            c.execute();
            index++;
        }
    }

    public List<DrawingCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<DrawingCommand> commands) {
        this.commands = commands;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
