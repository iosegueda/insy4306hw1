import java.io.*;

public class WriteFile 
{
	public WriteFile() {}

	public void writeToFile(String fileName, String content)
	{
		File file = new File (fileName);
		try
		{ 
			PrintWriter writer = new PrintWriter(file);
			
			writer.println(content);
			
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

	public void main (String [] args) 
	{
		String content;
		content = "Residential;Jones;111 W. 2nd St.;Tulsa;Oklahoma;58934;135000;1575;True;STATELY_ESTATES"+"\n"+
		"Residential;Smith;92 Davis St.;Arlington;Texas;76019;90000;2235;False;GREEN_GABLES"+"\n"+
		"Commercial;Willis;3865 Cooper St.;Arlington;Texas;76018;235000;1300;TRUE;Joe Paint Shop;TX"+"\n"+
		"Commercial;Jones;111 Smart Rd.;New Orleans;Louisiana;34562;65000;5000;FALSE;Tacos Galore;LA"+"\n"+
		"Residential;Traver;252 Park Lane;Atlanta;Georgia;60606;155000;1850;False;KING_MANOR"+"\n"+
		"Commercial;Merrit;605 Green Blvd;Tulsa;Oklahoma;76015;275000;4321;True;Battery City;OK"+"\n"+
		"Residential;Willis;853 Third Avenue;New York;New York;90123;96000;3025;False;KINGLY_ESTATES";
		writeToFile("properties.txt", content);
	}
}