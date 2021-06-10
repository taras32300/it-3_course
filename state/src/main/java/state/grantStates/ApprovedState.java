package state.grantStates;

import state.Grant;

public class ApprovedState implements GrantState {
    @Override
    public void next(Grant grant) {
        System.out.println("Grant is approved! Our Congratulations!");
    }

    @Override
    public void prev(Grant grant) {
        grant.setState(new ReviewingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Grant is on approved status!");
    }
}