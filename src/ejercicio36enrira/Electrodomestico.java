/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36enrira;

import java.util.regex.Pattern;

/**
 *
 * @author enriq
 */
public class Electrodomestico {
    protected int precio_base ,peso;
    protected char consumo_energetico;
    protected enum  tipoColor {
        blanco,negro,gris,rojo,azul
    }
    protected tipoColor color;
    
    public Electrodomestico () {
        this.precio_base = 100;
        this.peso = 5;
        this.color = tipoColor.blanco;
        this.consumo_energetico='F';
    }
    public Electrodomestico(int precio_base, int peso){
        this();
        this.precio_base=precio_base;
        this.peso=peso;
    }
    public Electrodomestico (int precio_base, int peso,String color, char consumo_energetico){
        this();
        this.precio_base=precio_base;
        this.peso=peso;        
        this.consumo_energetico=comprobarConsumoEnergetico(consumo_energetico);
        if (comprobarColor(color)){
            this.color = tipoColor.valueOf(color.toLowerCase());
        }
    }
    
    private char comprobarConsumoEnergetico(char consumo_electrico){
        String valido = "[A-F]";
        String consumo_electrico_s = Character.toString(consumo_electrico);
        if (Pattern.matches(valido, consumo_electrico_s))
            return consumo_electrico;       
        else
            return 'F' ;
    }
    private boolean comprobarColor (String color){
        try{
            tipoColor valido = tipoColor.valueOf(color.toLowerCase());
            return true;
        }
        catch (IllegalArgumentException IAE) {
            return false;
        }
    }
    
    public int precioFinal(){
        int precioLetra=0,precioPeso=0,precioFinal;
        switch (this.consumo_energetico){
            case 'A':
                precioLetra=100;
            break;
            case 'B':
                precioLetra=80;
            break;
            case 'C':
                precioLetra=60;
            break;
            case 'D':
                precioLetra=50;
            break;
            case 'E':
                precioLetra=30;
            break;
            case 'F':
                precioLetra=10;
            break;            
        }
        if (this.peso > 0 && this.peso < 20){
            precioPeso=10;
        }
       else if (this.peso > 20 && this.peso < 49){
            precioPeso=50;
        }      
       else if (this.peso > 50 && this.peso < 79){
            precioPeso=80;
        }
       else if (this.peso > 80){
            precioPeso=10;
        }
        precioFinal = precioPeso + precioLetra;
        return precioFinal;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public int getPeso() {
        return peso;
    }

    public tipoColor getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }
    
    
}
