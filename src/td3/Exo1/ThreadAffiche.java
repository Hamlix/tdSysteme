package td3.Exo1;

/**
 * Created by galax on 08/11/2016.
 */
public class ThreadAffiche extends Thread {
    private Nombre nombre;
    public ThreadAffiche(Nombre nombre){
        this.nombre=nombre;
    }

    public void run(){
        try{
            sleep(100);
            nombre.afficheNombre();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
