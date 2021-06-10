package state.grantStates;

import state.Grant;

public class RefusedState implements GrantState{
    @Override
    public void next(Grant grant) {
        System.out.println("Grant is refused, our regrets!");
    }

    @Override
    public void prev(Grant grant) {
        grant.setState(new ReviewingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Grant is on refused state!");
    }
}