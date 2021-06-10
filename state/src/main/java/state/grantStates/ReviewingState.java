package state.grantStates;

import state.Grant;

public class ReviewingState implements GrantState{

    @Override
    public void next(Grant grant) {
        if ("APPROVE".equals(Grant.status.toUpperCase())) {
            grant.setState(new ApprovedState());
        } else if ("REFUSE".equals(Grant.status.toUpperCase())) {
            grant.setState(new RefusedState());
        } else {
            try {
                throw new NoSuchFieldException("No such variant");
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void prev(Grant grant) {
        grant.setState(new CreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Grant is on review status!");
    }
}