package controllers;

import constants.AgentConstants;
import constants.AgentReceivers;
import jade.core.Agent;

public class CreatorAgent extends Agent {
    protected void setup() {
        CityContainer.getInstance()
                .addAgent(AgentReceivers.generatorNickname, AgentConstants.GENERATOR)
                .addAgent(AgentReceivers.buyerNickname, AgentConstants.BUYER)
                .addAgent(AgentReceivers.sellerNickname, AgentConstants.SELLER);
        System.out.println("Agents created");
    }
}
