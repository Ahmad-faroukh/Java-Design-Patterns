package stateAssignment.states;

import stateAssignment.Robot;

/**
 *
 * @author ACER E15
 */
public class Attack extends AbstractState {

    public Attack(Robot robot) {
        super(robot);
    }

    @Override
    public void fullHealth() {
    }

    @Override
    public void lowHealth() {
        System.out.println("Health is low . taking cover");
        myRobot.setState(new TakeCover(myRobot));
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
        System.out.println("Enemy Ran away . Robot is back patroling");
        myRobot.setState(new Patrol(myRobot));
    }

    @Override
    public void fullAmmo() {
    }

    @Override
    public void lowAmmo() {
        System.out.println("Ammo is low . going to reload");
        myRobot.setState(new Reload(myRobot));

    }

}
