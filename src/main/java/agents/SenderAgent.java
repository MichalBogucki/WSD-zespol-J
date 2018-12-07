package agents;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class SenderAgent extends Agent {

    public SenderAgent() {
        System.out.println("I'm here bitches! MyAgent agent. It's name is " + getAID());
    }

    @Override
    protected void setup() {
        System.out.println("MyAgent agent setup() method invoked.");
        // doDelete();
        addBehaviour(new TickerBehaviour(this, 5000) {
            @Override
            public void onTick() {
                //send the message
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new AID("d", AID.ISLOCALNAME));
                msg.setLanguage("Polish");
                msg.setContent("Witaj");
                send(msg);
                System.out.println("NAPIERDALAM CO PIEC SEKUND!");
            }
        });
    }

    @Override
    protected void takeDown() { //opcjonalnie
        System.out.println("MyAgent: Oooh, am I getting rid of? :( " +  getAID());
    }
}
