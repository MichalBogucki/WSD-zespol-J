package behaviors;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class SellingBehavior extends CyclicBehaviour {

    public void action() {
        //receive other's agent message
        ACLMessage msg = super.myAgent.receive();
        if (msg != null) {
            // przetwarzanie wiadomości
            System.out.println("Dostalem te wiadomosc, dzieki!");
        }
        else {
            block();
        }
    }
}
