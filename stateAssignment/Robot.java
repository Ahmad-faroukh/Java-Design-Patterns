package stateAssignment;

import stateAssignment.states.Patrol;
import stateAssignment.states.State;

/**
 *
 * @author ACER E15
 */
public class Robot implements RobotInterface {

    State state = null;

    public Robot() {
        this.setState(new Patrol(this));
    }


    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void fullHealth() {
        this.state.fullHealth();
    }

    @Override
    public void lowHealth() {
        this.state.lowHealth();
    }

    @Override
    public void noHealth() {
        this.state.noHealth();
    }

    @Override
    public void playerApproaches() {
        this.state.playerApproaches();
    }

    @Override
    public void playerRuns() {
        this.state.playerRuns();
    }

    @Override
    public void fullAmmo() {
        this.state.fullAmmo();
    }

    @Override
    public void lowAmmo() {
        this.state.lowAmmo();
    }

}
