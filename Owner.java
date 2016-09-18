/**
 * Created by Iris on 9/17/2016.
 */
import java.util.*;


public class Owner 
{
	private String name;
	private List<Property> propertyList;
	private double totalTaxes; 
	
	public Owner()
	{
		this.name = "Jane Doe";
		this.propertyList = new ArrayList<Property>();
		this.totalTaxes = 0; 
	}
	public Owner(String n)
	{
		this.name = n;
		this.propertyList = new ArrayList<Property>();
		this.totalTaxes = 0; 
	}
	
	public String getName()
	{
		return this.name;
	}
	public double getTotalTaxes()
	{
		return this.totalTaxes;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	public void setTotalTaxes(double t)
	{
		this.totalTaxes = t;
	}
	
	public String toString()
	{
		return "    " + this.name + "\n\t" this.propertyList + "\n\t" +
			this.totalTaxes;
	}
	
	public void addProperty(Property p)
	{
		this.propertyList.add(p);
	}
	public ArrayList getPropertyList();
	{
		return this.ArrayList<Property>;
	}
}