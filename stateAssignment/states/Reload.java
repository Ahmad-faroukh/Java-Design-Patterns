package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */
public class Reload extends AbstractState {

    public Reload(Robot robot) {
        super(robot);
        System.out.println("Reloading ...");
        myRobot.fullAmmo();
    }

    @Override
    public void fullHealth() {
    }

    @Override
    public void lowHealth() {
    }

    @Override
    public void noHealth() {
        myRobot.setState(new Deceased(myRobot));
    }

    @Override
    public void playerApproaches() {
    }

    @Override
    public void playerRuns() {
    }

    @Override
    public void fullAmmo() {
        System.out.println("Ammo is full going back to cover");
        myRobot.setState(new TakeCover(myRobot));
    }

    @Override
    public void lowAmmo() {
    }

}
