import Algoritm.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-20.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String algotirhmName = args[0];
        for (String o : args) {
            System.out.println(o);

            AlgoritmFabric factory = new AlgoritmFabric();
            AbstractAlgoritm algorithm =
                    factory.getAlgoritm(algotirhmName);

            algorithm.runAlgotitm(args);
        }

    }
}
