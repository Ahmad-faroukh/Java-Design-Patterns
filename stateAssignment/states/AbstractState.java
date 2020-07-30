package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */
public abstract class AbstractState implements State {

    Robot myRobot = null;

    public AbstractState(Robot robot) {
        this.myRobot = robot;
    }

}
