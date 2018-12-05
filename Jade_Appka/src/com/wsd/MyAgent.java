package com.wsd;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;

import javax.swing.*;

public class MyAgent extends Agent {

    @Override
    protected void setup () {
        System.out.println("Czy ta metoda sie w ogole wywoluje?");
        doDelete();
    }
}