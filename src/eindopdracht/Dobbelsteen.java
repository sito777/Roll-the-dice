package eindopdracht;

import java.util.Random;

/**
 * @author Darnell
 *
 */
public class Dobbelsteen
{
    private int aantalZijde;
    private int gegooideOgen;

    public Dobbelsteen()
    { // Default constructor
    }

    public int getAantalZijde()
    {
	return aantalZijde;
    }

    public Dobbelsteen(int aantalZijde)
    {
	this.aantalZijde = aantalZijde;
    }

    public int getGegooideOgen()
    {
	return gegooideOgen;
    }

    public void setGegooideOgen(int gegooideOgen)
    {
	this.gegooideOgen = gegooideOgen;
    }

    public String toString(int worpNummer)
    {
	//Hier worden de waarders berekente en wordt de dobbelsteen groter waneer het getal ook groter wordt
	int streenBreedte = String.valueOf(this.aantalZijde).length();
	String dobbel = String.valueOf(worpNummer);
	String realDobbelSteen = "";

	// De middelste laag word hier mee gemaakt
	if (streenBreedte != dobbel.length())
	{
	    for (int i = 0; i <= streenBreedte - dobbel.length(); i++)
	    {
		dobbel += " ";
	    }
	    dobbel += " #\n";

	} 
	else
	{
	    dobbel += " #\n";
	}
	String laag0 = "\n\n";
	String laag1 = "##";
	String laag2 = "# ";
	String laag3 = "# " + dobbel; //de cijfer van de dobbelsteen is hier te zien
	String laag4 = "# ";
	String laag5 = "##";

	// De zijkanten van de dobbelsteen worden hiergemaakt
	for (int i = -1; i < streenBreedte; i++)
	{
	    if (streenBreedte - i != 1)
	    {
		laag1 += "#";
		laag2 += " ";
		laag4 += " ";
		laag5 += "#";
	    } 
	    else
	    {
		laag1 += "##\n";
		laag2 += " #\n";
		laag4 += " #\n";
		laag5 += "##\n";
		realDobbelSteen = laag0 + laag1 + laag2 + laag3 + laag4 + laag5; //alle lagen samen voegen
	    }
	}

	// de uiteindelijke dobbelsteen
	return realDobbelSteen;
    }

    public void werpDobbelSteen()
    {
	Random rand = new Random();
	this.gegooideOgen = rand.nextInt(this.aantalZijde) + 1;
    }
}
