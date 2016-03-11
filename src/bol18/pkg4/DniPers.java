/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol18.pkg4;

import java.util.Scanner;

/**
 *
 * @author Pablite5
 */
public class DniPers {
     private int DNI;
    private final char[] letras={'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
    private final int[] numeros={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
    
    public void pedirDNI(){
        Scanner obx = new Scanner(System.in);
        System.out.println("Introduzca el número de su DNI:");
        DNI=obx.nextInt();
    }
    
    public void calcularLetra(){
        int numero = DNI%23;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==numero){
                System.out.println("Tu letra es " + letras[i]);
            }
        }
    }
}
