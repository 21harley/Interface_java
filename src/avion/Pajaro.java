/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;
import avion.*;
/**
 *
 * @author CASA
 */
public class Pajaro implements Volar,Creatura{
   
    public void HacerNido(){
        System.out.println("hace nidos");
    }
    public void PonerHuevos(){
        System.out.println("Poner huevos");
    }
    
    @Override
    public void despegar() {
      
    }

    @Override
    public void volar() {

    }

    @Override
    public void aterrizar() {

    }

    @Override
    public void raza() {
        System.out.println("Ave");
    }
    
}
