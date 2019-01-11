package behaviors;

import constants.AgentReceivers;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;
import utils.MyEntry;

import java.io.IOException;

public class GeneratingBehavior extends TickerBehaviour {

    private int halfHour = 1800;
    private int hour = 3600;

    public GeneratingBehavior(Agent a, long period) {
        super(a, period);
    }

    @Override
    public void onTick() {
        //send the message
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID(AgentReceivers.firstSeller, AID.ISLOCALNAME));
        msg.addReceiver(new AID(AgentReceivers.secondSeller, AID.ISLOCALNAME));
        msg.setLanguage("English");
        try {
            msg.setContentObject(generateData());
        } catch(IOException e) {
            e.printStackTrace();
        }
        super.myAgent.send(msg);
    }

    private MyEntry<Long, Integer> generateData() {
        MyEntry<Long, Integer> generatedData =
                new MyEntry<>(
                        System.currentTimeMillis() + randomTime() * 1000,
                        randomPopulation());
        return generatedData;
    }

    private int randomTime() { return (int) ((Math.random() * halfHour) + hour); }

    private int randomPopulation() { return (int) ((Math.random() * 10000) + 1000); }


}
