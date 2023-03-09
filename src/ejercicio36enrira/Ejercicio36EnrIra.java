/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36enrira;

/**
 *
 * @author enriq
 */
public class Ejercicio36EnrIra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico electrodomesticos [] = new Electrodomestico [10];
        electrodomesticos [0] = new Electrodomestico ();
        electrodomesticos [1] = new Lavadora ();
        electrodomesticos [2] = new Television ();
        electrodomesticos [3] = new Electrodomestico (20,40);
        electrodomesticos [4] = new Lavadora (80,100);
        electrodomesticos [5] = new Television (20,200);
        electrodomesticos [6] = new Electrodomestico (40,50,"verde",'F');
        electrodomesticos [7] = new Lavadora (62,40,"BLANCO",'A',20);
        electrodomesticos [8] = new Television (80,800,"Negro",'C',44,false);
        electrodomesticos [9] = new Television (80,800,"Negro",'C',44,true);
        int precioele=0,preciolava=0,preciotele=0;        
        for (Electrodomestico elec : electrodomesticos){
            if (elec instanceof Electrodomestico)
                precioele += elec.precioFinal();
             if (elec instanceof Lavadora)
                 preciolava += ((Lavadora) elec).PrecioFinal();
        
            else if (elec instanceof Television) 
                preciotele += elec.precioFinal();
            

        }
        System.out.println ("El precio final de los electrodomésticos es: "+precioele);
        System.out.println ("El precio final de las lavadoras es: "+preciolava);
        System.out.println ("El precio final de las televisiones es: "+preciotele);
        

       
    }

}
