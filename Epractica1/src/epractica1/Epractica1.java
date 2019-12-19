/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epractica1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Epractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num, cont = 0;
        Scanner sc = new Scanner(System.in);

        int numero[] = new int[10];
       
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Inserte numeros");
            numero[i] = sc.nextInt();
        }
        System.out.println("Anota número a buscar:");
        num = sc.nextInt();


        for (int i = 0; i < numero.length; i++) {
            if (numero[i]==num)
                cont++;
        }
        System.out.println("Numeros iguales: "+cont);
    }
    
}
