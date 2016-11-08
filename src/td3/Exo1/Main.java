package td3.Exo1;

import java.util.Scanner;

/**
 * Created by galax on 08/11/2016.
 */
public class Main extends Thread {

    public static void main(String[] args){
        Nombre n = new Nombre(1);
        ThreadAffiche threadA  = new ThreadAffiche(n);
        ThreadAugmente threadB = new ThreadAugmente(n);
        /*permet d'attendre le clavier*/
        Scanner scanner = new Scanner(System.in);

        threadA.start();
        threadB.start();
        System.out.println("Lancement");
        scanner.next();
        System.out.println("interruption");
        threadA.interrupt();
        threadB.interrupt();
        try{
            threadA.join();
            threadB.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
