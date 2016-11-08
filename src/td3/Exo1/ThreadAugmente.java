package td3.Exo1;

/**
 * Created by galax on 08/11/2016.
 */
public class ThreadAugmente extends Thread{
    private Nombre nombre;
    public ThreadAugmente(Nombre nombre){
        super();
        this.nombre=nombre;
    }

    public void run(){
        try{
            while(!this.isInterrupted()){
                sleep(100);
                nombre.incrementNombre();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       /*while(!this.isInterrupted()){
           try{
               sleep(100);
               nombre.incrementNombre();
           }catch (Exception e){
               e.printStackTrace();
               break;
           }
       }*/
    }
}
