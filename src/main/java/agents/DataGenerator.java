package agents;

import behaviors.GeneratingBehavior;
import jade.core.Agent;

public class DataGenerator extends Agent {

    public DataGenerator() {
        System.out.println(getAID() + " agent created.");
    }

    @Override
    protected void setup() {
        addBehaviour(new GeneratingBehavior(this, 2000));
    }


    @Override
    protected void takeDown() { //opcjonalnie
        System.out.println("MyAgent: Oooh, am I getting rid of? :( " +  getAID());
    }
}
