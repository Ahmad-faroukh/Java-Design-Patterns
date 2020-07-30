package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */


public class Patrol extends AbstractState{

    public Patrol(Robot robot) {
        super(robot);
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
        System.out.println("Player is approaching .. attacking now");
        myRobot.setState(new Attack(myRobot));
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
