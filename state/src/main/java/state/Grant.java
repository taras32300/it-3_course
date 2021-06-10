package state;

import state.grantStates.CreatedState;
import state.grantStates.GrantState;

public class Grant {
    public static String status;
    private GrantState state = new CreatedState();

    public void setState(GrantState state) {
        this.state = state;
    }

    public GrantState getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}