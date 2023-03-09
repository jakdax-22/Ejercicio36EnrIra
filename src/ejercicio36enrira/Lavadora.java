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
public class Lavadora extends Electrodomestico {
    private int carga;
    public Lavadora () {
        super ();
        this.carga=5;
    }
    public Lavadora (int precio_base,int peso){
        super(precio_base,peso);
    }
    
    public Lavadora (int precio_base, int peso,String color, char consumo_energetico,int carga){
        super(precio_base,peso,color,consumo_energetico);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }
    
    public int PrecioFinal(){
        int preciofinal = super.precioFinal();
        if (this.carga > 30){
            preciofinal += 50;
        }
        return preciofinal;
    }
    
}
