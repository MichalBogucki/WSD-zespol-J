package behaviors;

import agents.AdSeller;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import utils.MyEntry;

// on przyjmuje wiadomosc i na niej dopiero operuje
public class SellingBehavior extends CyclicBehaviour {

    public SellingBehavior(AdSeller a) {
        super(a);
    }

    public void action() {
        //receive other's agent message
        AdSeller adseller = (AdSeller) super.myAgent;
        ACLMessage msg = adseller.receive();
        if (msg != null) {
            try {
                MyEntry<Long, Integer> timePopulationPair = (MyEntry) msg.getContentObject();
                adseller.getTimeWithPopulation()
                        .put(timePopulationPair.getKey(), timePopulationPair.getValue());
            } catch (UnreadableException ue) {
                ue.printStackTrace();
            }
        } else {
            block();
        }
    }
}
