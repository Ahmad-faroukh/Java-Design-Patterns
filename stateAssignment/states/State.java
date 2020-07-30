package stateAssignment.states;

/**
 *
 * @author ACER E15
 */
public interface State {

    public void fullHealth();
    public void lowHealth();
    public void noHealth();
    public void playerApproaches();
    public void playerRuns();
    public void fullAmmo();
    public void lowAmmo();
}
