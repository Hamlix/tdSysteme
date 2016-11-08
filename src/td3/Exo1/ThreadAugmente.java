package td3.Exo1;

/**
 * Created by galax on 08/11/2016.
 */
public class ThreadAugmente extends Thread{
    private Nombre nombre;
    public ThreadAugmente(Nombre nombre){
        this.nombre=nombre;
    }

    public void run(){
        try{
            sleep(50);
            nombre.incrementNombre();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
