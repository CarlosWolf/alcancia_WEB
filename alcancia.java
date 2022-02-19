import java.lang.reflect.Array;
import java.util.*;
public class alcancia{
    public ArrayList<Integer> li = new ArrayList<>();
    public int dinero = 0;
    public int tamArreglo = 0;

    public int getDinero(){
        return dinero;
    } 
    public void setDinero(){
        this.dinero = dinero;
    }
    public void agregardinero(int _dinero, int _tamArreglo){
         dinero = _dinero;
         for(int w=0; w<=tamArreglo; w++){
            li.add(dinero);
         }
        System.out.println("soy el dinero de alcancia:" + li);
    }
    public void mostrarDinero(int _dinero){
        
    }
    public void calcularDinero(int _dinero){

    }
    public void vaciarAlcancia(int _dinero){

    }
}