package agents;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AdBuyer extends Agent {

    public AdBuyer() {}

    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                //receive other's agent message
                ACLMessage msg = receive();
                if (msg != null) {
                    // przetwarzanie wiadomości
                    System.out.println("Processing");
                }
                else {
                   block();
                }
            }
        });
    }

    protected void takeDown() { //opcjonalnie
        System.out.println("Advertisor down" +  getAID());
    }
}

