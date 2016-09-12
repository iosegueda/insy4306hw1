import java.util.*;
public class Owner
{
	private String name;
	private List<String> propertyList;
	private double totalTaxes;

	public Owner()
	{
		this.name = "";
		this.propertyList = new ArrayList<String>();
		this.totalTaxes = 0.0;
	}
	public Owner(String n)
	{
		this.Owner();
		this.setName(n);
	}
	public String getName()
	{
		return this.name;
	}
	public double getTotalTaxes()
	{
		return this.totalTaxes;
	}
	public Void setName(String n)
	{
		this.name = n;
	}
	public Void setTotalTaxes(double t)
	{
		this.totalTaxes = t;
	}
	public String toString()
	{
		return "";
	}
	public Void addProperty(Property p)
	{
		this.propertyList.add(p);
	}
	public ArrayList<Property> getPropertyList()
	{
		return this.propertyList;
	}
}