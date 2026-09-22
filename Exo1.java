/*
 * TPO Exercice 1
 * 22 septembre 2026
 * 
 */

package Exo1;

import java.util.Scanner;

/**
 *
 * @author Idir SMAIL
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bonjour");

        // Déclaration des variables
        String prenom;
        Scanner sc;

        // Création du Scanner
        sc = new Scanner(System.in);

        // Demander prénom
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine(); //Lit l'input de l'utilisateur

        System.out.println("Bonjour " + prenom);

        System.out.println("Au revoir");
    }
}
