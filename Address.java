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
	public void setStreet(String s)
	{
		this.street = s;
	}
	public void setCity(String c)
	{
		this.city = c;
	}
	public void setState(String s)
	{
		this.state = s;
	}
	public void setZip(int z)
	{
		this.zip = z;
	}
	public String toString()
	{
		String str = this.street + ", " + this.city + ", " + this.state + " " + Integer.toString(this.zip) + "\n";
		return str;
	}
}