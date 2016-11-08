package td3.Exo1;

/**
 * Created by galax on 08/11/2016.
 */
public class Nombre {
    private double n;
    private double carre;

    public Nombre(double n) {
        this.n = n;
        this.carre=n*n;
    }

    public synchronized void afficheNombre(){
        System.out.println("Nombre : "+n+" et le carre : "+carre);
    }

    public synchronized void incrementNombre(){
        this.n+=1;
        this.carre=n*n;
    }
}
