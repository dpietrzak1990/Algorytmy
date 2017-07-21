package Algoritm;

import Algoritm.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public class Test extends AbstractAlgoritm {
    public Test(){
        System.out.println("Konstruktor test");
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public void runAlgotitm(String[] input) {
        System.out.println("To jest algorytm testowy!");

    }
}
