package state.grantStates;

import state.Grant;

public class CreatedState implements GrantState{
    @Override
    public void next(Grant grant) {
        grant.setState(new ReviewingState());
    }

    @Override
    public void prev(Grant grant) {
        System.out.println("The grant is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Grant is created!");
    }
}