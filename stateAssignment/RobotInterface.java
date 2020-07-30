package stateAssignment;

import stateAssignment.states.State;

/**
 *
 * @author ACER E15
 */
public interface RobotInterface {

    public void fullHealth();
    public void lowHealth();
    public void noHealth();
    public void playerApproaches();
    public void playerRuns();
    public void fullAmmo();
    public void lowAmmo();
    
    public void setState(State state);
    
}
