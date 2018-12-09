package behaviors;

import constants.AgentReceivers;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class GeneratingBehavior extends TickerBehaviour {
    public GeneratingBehavior(Agent a, long period) {
        super(a, period);
    }

    @Override
    public void onTick() {
        //send the message
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID(AgentReceivers.buyerNickname, AID.ISLOCALNAME));
        msg.setLanguage("Polish");
        msg.setContent("Witaj");
        super.myAgent.send(msg);
        System.out.println("jestemssssssssssssssssssssss");
    }
}
