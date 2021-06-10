package state.grantStates;

import state.Grant;

public interface GrantState {
    void next(Grant grant);
    void prev(Grant grant);
    void printStatus();
}