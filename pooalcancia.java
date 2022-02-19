import java.util.*;
public class pooalcancia {
    public static void main(String args[]) {
        int dineroL = 0;
        int valor = 0;
        do {
        alcancia objAlcancia = new alcancia();
        Scanner lecturaNumero = new Scanner (System.in);
        System.out.println("Ingrese cuantas monedas quiere meter (ESPACIO)");
        int tamañoA = lecturaNumero.nextInt();
        System.out.println("Precione 1 para ingresar 1 peso  ---- Precione 2 para ingresar 2 pesos");
        System.out.println( "Precione 3 para ingresar 5 pesos  ---- Precione 4 para ingresar 10 pesos "); 
        System.out.println("Precione 5 para ingresar 20 peso  ---- Precione 6 para ingresar 50 pesos" );
        System.out.println("Precione 7 para ingresar 100 peso  ---- Precione 8 para ingresar 200 pesos" );
        System.out.println( "Precione 9 para ingresar 500 peso  ---- Precione 10 para ingresar 1000 pesos"); 
        System.out.println("ingrese 11 para mostrar el dinero ---- ingrese 12 para calcular" );
        System.out.println("ingrese 13 para vaciar");
        dineroL = lecturaNumero.nextInt();
        if(dineroL == 1){
            dineroL = 1;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if (dineroL == 2) {
            dineroL = 2;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 3){
            dineroL = 5;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if (dineroL == 4) {
            dineroL = 10;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 5){
            dineroL = 20;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 6){
            dineroL = 50;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 7){
            dineroL = 100;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 8){
            dineroL = 200;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 9){
            dineroL = 500;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 10){
            dineroL = 1000;
            objAlcancia.agregardinero(dineroL, tamañoA);
        }if(dineroL == 11){
            objAlcancia.mostrarDinero(valor);
        }if (dineroL == 12) {
            objAlcancia.calcularDinero(valor);
        }if (dineroL == 13) {
            valor = 13;
        }
        System.out.println(dineroL);
       } while (dineroL != 13);
        
        
    }
}
