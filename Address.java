public class Address
{
	private String street;
	private String city;
	private String state;
	private int zip;

	public Address()
	{
		this.setStreet("");
		this.setCity("");
		this.setState("");
		this.setZip(0);
	}
	public Address(String s, String c, String st, int z)
	{
		this.setStreet(s);
		this.setCity(c);
		this.setState(st);
		this.setZip(z);
	}
	public String getStreet()
	{
		return this.street;
	}
	public String getCity()
	{
		return this.city;
	}
	public String getState()
	{
		return this.state;
	}
	public int getZip()
	{
		return this.zip;
	}
	public Void setStreet(String s)
	{
		this.street = s;
	}
	public Void setCity(String c)
	{
		this.city = c;
	}
	public Void setState(String s)
	{
		this.static = s;
	}
	public Void setZip(int z)
	{
		this.zip = z;
	}
	public String toString()
	{
		return "";
	}
}