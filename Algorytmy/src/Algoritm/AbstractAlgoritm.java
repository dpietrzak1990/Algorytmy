package Algoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public abstract class AbstractAlgoritm {

    public AbstractAlgoritm(){
        System.out.printf("Konstruktor Abstract Algotirhm");
    }
    public abstract String getName();
    public abstract void runAlgotitm(String[] input );

}
