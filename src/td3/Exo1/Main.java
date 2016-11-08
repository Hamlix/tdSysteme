package td3.Exo1;

/**
 * Created by galax on 08/11/2016.
 */
public class Main extends Thread {

    public static void Main(String[] args){
        Nombre n = new Nombre(1);
        ThreadAffiche threadA  = new ThreadAffiche(n);
        ThreadAugmente threadB = new ThreadAugmente(n);

        threadA.start();
        threadB.start();

    }
}
