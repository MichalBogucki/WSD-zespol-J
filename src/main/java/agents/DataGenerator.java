package agents;

import behaviors.GeneratingBehavior;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class DataGenerator extends Agent {

    public DataGenerator() {
        System.out.println(getAID() + " agent created.");
    }

    @Override
    protected void setup() {
        addBehaviour(new GeneratingBehavior(this, 5000));
    }


    @Override
    protected void takeDown() { //opcjonalnie
        System.out.println("MyAgent: Oooh, am I getting rid of? :( " +  getAID());
    }
}
