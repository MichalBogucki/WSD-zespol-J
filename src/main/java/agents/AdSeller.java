package agents;

import behaviors.PrintingBehaviour;
import behaviors.SellingBehavior;
import jade.core.Agent;

import java.util.HashMap;

public class AdSeller extends Agent {

    private HashMap<Long, Integer> timeWithPopulation = new HashMap<Long, Integer>();
    @Override
    protected void setup() {
        super.setup();
        System.out.println("Jestem agent " + getAID());
        addBehaviour(new SellingBehavior(this));
        addBehaviour(new PrintingBehaviour(this, 6000));
    }

    public HashMap<Long, Integer> getTimeWithPopulation() {
        return timeWithPopulation;
    }

    public void setTimeWithPopulation(HashMap<Long, Integer> timeWithPopulation) {
        this.timeWithPopulation = timeWithPopulation;
    }
}
