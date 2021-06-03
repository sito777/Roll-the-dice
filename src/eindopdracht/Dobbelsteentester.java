package eindopdracht;

import java.util.Scanner;

/**
 * @author Darnell
 *
 */
public class Dobbelsteentester
{
    /**
     * @param args
     */
    //main driver class
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in); // java haalt de input uit de console
	boolean loop = true; // waneer de variable "false" true is dan stopt de loop
	boolean loop2 = true;
	Dobbelsteen dobbel6 = new Dobbelsteen(6); // dobbelsteen met 6 zijden
	Dobbelsteen dobbel20 = new Dobbelsteen(20); // dobbelsteen met 20 zijdens

	while (loop) // waneer de variable "false" true is dan stopt de loop
	{
	    while (loop2)
	    {
		System.out.println("\nMet welke dobbesteen wil je spelen?\nGeeft antwoordt doormiddel van cijfers\n1. 6 zijden\n2. 20 zijden\n");
		String keuze = input.next();// de input wordt opgeslagen in de variable keuze
		
		System.out.println("\nHoeveel rondes wil je spelen?\n");
		int aantalRondes = input.nextInt();// de input wordt opgeslagen in de variable aantalrondes
		int score = 0;// score wordt gereset
		
		switch (keuze) 
		{
		case "1": // optie 1 de dobbelsteen met 6 zijden 
		    for (int i = 0; i != aantalRondes; i++)
		    {
			dobbel6.werpDobbelSteen();
			int ogenGegooid = dobbel6.getGegooideOgen();
			System.out.println(dobbel6.toString(ogenGegooid));
			score += ogenGegooid;
			loop2 = false;
		    }
		    System.out.println("De score is: " + score);
		    break;
		case "2":  // optie 2 de dobbelsteen met 20 zijden 
		    for (int i = 0; i != aantalRondes; i++)
		    {
			dobbel20.werpDobbelSteen();
			int ogenGegooid = dobbel20.getGegooideOgen();
			System.out.println(dobbel20.toString(ogenGegooid));
			score += ogenGegooid;
			loop2 = false;
		    }
		    System.out.println("de score is:" + score);
		    break;
		default: // als de intpunt niet wordt herkent print java een melding
		    System.out.println("De door jou gegeven input wordt niet herkent");
		    break;
		}
	    }
	    System.out.println("\nWil je verder spelen?\n1. ja\n2. nee");
	    int exit = input.nextInt();//input wordt gevraagd of de speler nog een keer wilt spelen
	    if (exit == 1)
	    {
		loop2 = true;
		loop = true;
	    }
	    else if (exit == 2)
	    {
		System.out.println("Bedankt voor het spelen! Tot de volgende keer");
		loop = false;
		loop2 = false;
	    }
	    else
	    {
		System.out.println("De door jou gegeven input wordt niet herkent");
	    }
	}
    }
}
