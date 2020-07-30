
package commandAssignment;

/**
 *
 * @author ACER E15
 */


public interface UndoableCommand {
    public void execute();
    public void undo();
}
