package behaviors;

import agents.AdSeller;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class PrintingBehaviour extends TickerBehaviour {

    public PrintingBehaviour(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        AdSeller adSeller = (AdSeller) super.myAgent;
        adSeller.getTimeWithPopulation().entrySet().forEach(e -> {
            LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(e.getKey()), ZoneId.systemDefault());
            int ppl = e.getValue();
            System.out.println("Predicted time: " + date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            System.out.println("    Predicted ammount of people: " + ppl);
        });
    }
}
