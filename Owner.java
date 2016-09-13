import java.util.*;
public class Owner
{
	private String name;
	private List<Property> propertyList;
	private double totalTaxes;

	public Owner()
	{
		this.name = "";
		this.propertyList = new ArrayList<Property>();
		this.setTotalTaxes(0.0);
	}
	public Owner(String n)
	{
		this.setName(n);
		this.propertyList = new ArrayList<Property>();
		this.setTotalTaxes(0.0);
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
		String str = this.name + "\n";
		for(int i = 0; i < this.propertyList.size(); i++)
		{
			str = str + propertyList.get(i).toString() + "\n";
		}
		return str;
	}
	public void addProperty(Property p)
	{
		this.propertyList.add(p);
	}
	public List<Property> getPropertyList()
	{
		return this.propertyList;
	}
}