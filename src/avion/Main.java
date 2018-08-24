/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;
import avion.*;
import java.util.*;
/**
 *
 * @author CASA
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec=new Scanner(System.in);
        
        Avion at=new Avion();
        at.hacerManiobras();
        Pajaro perico=new Pajaro();
        perico.HacerNido();
        Superman superboy =new Superman();
        superboy.SaltarEdificios();
        
    }
}
