package controllers;

import constants.AgentConstants;
import constants.AgentReceivers;
import jade.core.Agent;

public class CreatorAgent extends Agent {
    protected void setup() {
        CityContainer.getInstance()
                .addAgent(AgentReceivers.generatorNickname, AgentConstants.GENERATOR)
                .addAgent(AgentReceivers.firstBuyer, AgentConstants.BUYER)
                .addAgent(AgentReceivers.secondBuyer, AgentConstants.BUYER)
                .addAgent(AgentReceivers.firstSeller, AgentConstants.SELLER)
                .addAgent(AgentReceivers.secondSeller, AgentConstants.SELLER);
        System.out.println("Agents created");
    }
}
