package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */
public class Deceased extends AbstractState {

    public Deceased(Robot robot) {
        super(robot);
        System.err.println("Robot Died");
        System.exit(0);
    }

    @Override
    public void fullHealth() {
    }

    @Override
    public void lowHealth() {
    }

    @Override
    public void noHealth() {
    }

    @Override
    public void playerApproaches() {
    }

    @Override
    public void playerRuns() {
    }

    @Override
    public void fullAmmo() {
    }

    @Override
    public void lowAmmo() {
    }

}
