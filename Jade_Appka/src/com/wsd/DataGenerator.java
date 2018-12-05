package com.wsd;
import jade.core.Agent;

public class DataGenerator extends Agent {

    @Override
    protected void setup () {
        System.out.println("Czy ta metoda sie w ogole wywoluje?");
        doDelete();
    }

    @Override
    protected void takeDown() { //opcjonalnie
        // operacje wykonywane bezpośrednio przed usunięciem agenta
    }

}

