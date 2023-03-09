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
public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizador; 
    
    public Television () {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }
    
    public Television (int precio, int peso){
        super (precio,peso);
        
    }
    public Television (int precio_base, int peso,String color, char consumo_energetico,int resolucion,boolean sintonizador){
        super(precio_base,peso,color,consumo_energetico);
        this.sintonizador = sintonizador;
        this.resolucion = resolucion;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }
    public int precioFinal () {
        int preciofinal = super.precioFinal();
        if (this.resolucion > 40){
            preciofinal += preciofinal * 0.3;
        }
        if (sintonizador)
            preciofinal += 50;
        return preciofinal;
    }
    }

