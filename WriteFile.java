//Iris Osegueda
import java.io.*;

public class WriteFile 
{
	public static void main (String [] args) 
	{
		File file = new File ("properties.txt");
		
		try
		{ 
			PrintWriter writer = new PrintWriter(file);
			
			writer.println("Residential;Jones;111 W. 2nd St.;Tulsa;Oklahoma;58934;135000;1575;True;STATELY_ESTATES");
			writer.println("Residential;Smith;92 Davis St.;Arlington;Texas;76019;90000;2235;False;GREEN_GABLES");
			writer.println("Commercial;Willis;3865 Cooper St.;Arlington;Texas;76018;235000;1300;TRUE;Joe Paint Shop;TX");
			writer.println("Commercial;Jones;111 Smart Rd.;New Orleans;Louisiana;34562;65000;5000;FALSE;Tacos Galore;LA");
			writer.println("Residential;Traver;252 Park Lane;Atlanta;Georgia;60606;155000;1850;False;KING_MANOR");
			writer.println("Commercial;Merrit;605 Green Blvd;Tulsa;Oklahoma;76015;275000;4321;True;Battery City;OK");
			writer.println("Residential;Willis;853 Third Avenue;New York;New York;90123;96000;3025;False;KINGLY_ESTATES");
			
			writer.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}
		catch ( Exception e )
        {
            e.printStackTrace();
        }
	}
}