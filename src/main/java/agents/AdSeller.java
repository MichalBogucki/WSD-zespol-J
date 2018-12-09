package agents;

import behaviors.SellingBehavior;
import jade.core.Agent;

public class AdSeller extends Agent {
    @Override
    protected void setup() {
        super.setup();
        addBehaviour(new SellingBehavior());
    }
}
