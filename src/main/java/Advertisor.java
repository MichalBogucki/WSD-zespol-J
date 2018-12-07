import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;


public class Advertisor extends Agent {

    public Advertisor() {
        System.out.println("I'm here bitches! Advertisor agent" + getAID());
    }

    @Override
    protected void setup () {
        System.out.println("Advertisor agent setup() method invoked.");
       // doDelete();
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                //receive other's agent message
                ACLMessage msg=receive();
                if (msg != null) {
                    // przetwarzanie wiadomości
                    System.out.println("Dostalem te wiadomosc, dzieki!");
                }
                else {
                   block();
                }
            }
        });
    }

    protected void takeDown() { //opcjonalnie
        System.out.println("Advertisor: Oooh, am I getting rid of? :( " +  getAID());
    }
    public void gownoMetoda() {
        System.out.println("Jestem gównoMetoda");
    }
}

