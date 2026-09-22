/*
 * TPO Exercice 2
 * 22 septembre 2026
 */

package exo2.exo2;

import java.util.Scanner;


public class Exo2 {
/**
 *
 * @author Idir SMAIL
     * @param args
 */
    public static void main(String[] args) {
        
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; //indice
        result=0;
        Scanner sc;
        
        
        sc = new Scanner(System.in);
        
        System.out.println("Quel est le nombre d'entiers que vous voulez additionner ?");
        nb = sc.nextInt(); // Assigne l'entier entré par l'utilisateur à la variable nb
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind ++; // Incrémenter l'indice pour sortir de la boucle while
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " premiers entiers est: "+result);
        }
}
