package controllers;

import controllers.AgentMainController;
import jade.core.Agent;

public class CreatorAgent extends Agent {
    protected void setup() {
        System.out.println("Tworze " + getLocalName());
        AgentMainController.getInstance()
                .addAgent("s", "agents.SenderAgent")
                .addAgent("a", "agents.HelloAgent")
                .addAgent("d", "agents.Advertisor");
        System.out.println("stworzylem");
    }
}
