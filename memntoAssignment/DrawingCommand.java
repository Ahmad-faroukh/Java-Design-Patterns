package DesignPattrens.memntoAssignment;

import java.awt.*;

public interface DrawingCommand {

	public void execute();
	public void execute(Graphics g);
	public void unexecute();
	public void unexecute(Graphics g);
}
