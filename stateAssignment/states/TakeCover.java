package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */
public class TakeCover extends AbstractState {

    public TakeCover(Robot robot) {
        super(robot);
    }

    @Override
    public void fullHealth() {
        System.out.println("Health is full . Attacking");
        myRobot.setState(new Attack(myRobot));
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
        System.out.println("Ammo is full . Attacking");
        myRobot.setState(new Attack(myRobot));
    }

    @Override
    public void lowAmmo() {
        System.out.println("Low ammo . going to Reload");
        myRobot.setState(new Reload(myRobot));
    }

}
