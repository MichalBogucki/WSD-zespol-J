import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class MyAgent extends Agent {


    public MyAgent() {
        System.out.println("I'm here bitches! MyAgent agent. It's name is " + getAID());
    }

    @Override
    protected void setup() {
        System.out.println("MyAgent agent setup() method invoked.");
        // doDelete();
        addBehaviour(new TickerBehaviour(this, 5000) {
            @Override
            public void action() {
                //send the message
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new AID("Advertisor1", AID.ISLOCALNAME));
                msg.setLanguage("Polish");
                msg.setContent("Witaj");
                send(msg);
                System.out.println("Wyslalem Ci wiadomosc, lap!");
//                try{
//                    MyAgent.this.wait(5000);
//                }
//                catch(Exception e) {
//                    e.printStackTrace();
//                }
            }
        });
    }

    protected void takeDown() { //opcjonalnie
        System.out.println("MyAgent: Oooh, am I getting rid of? :( " +  getAID());
    }
    public void gownoMetoda() {
        System.out.println("Jestem gównoMetoda");
    }
}
