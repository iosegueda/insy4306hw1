public abstract class Property
{
	private Address propertyAddress;
	private double marketValue;
	private int squareFeet;
	private boolean floodZone;
	public Property()
	{
		this.setPropertyAddress(new Address());
		this.setMarketValue(0.0);
		this.setSquareFeet(0);
		this.setFloodZone(false);
	}
	public Property(Address a, double v, int s, boolean z)
	{
		this.setPropertyAddress(a);
		this.setMarketValue(v);
		this.setSquareFeet(s);
		this.setFloodZone(z);
	}
	public Address getPropertyAddress()
	{
		return this.propertyAddress;
	}
	public double getMarketValue()
	{
		return this.marketValue;
	}
	public int getSquareFeet()
	{
		return this.squareFeet;
	}
	public boolean getFloodZone()
	{
		return this.floodZone;
	}
	public void setPropertyAddress(Address a)
	{
		this.propertyAddress = a;
	}
	public void setMarketValue(double v)
	{
		this.marketValue = v;
	}
	public void setSquareFeet(int f)
	{
		this.squareFeet = f;
	}
	public void setFloodZone(boolean z)
	{
		this.floodZone = z;
	}
	public String toString()
	{
		String str = this.propertyAddress.toString() + "\n" + Double.toString(this.marketValue) + "\n" + Integer.toString(this.squareFeet) + "\nFlood zone: " + Boolean.toString(this.floodZone) + "\n";
		return str;
	}
	public double calculateTaxes()
	{
		return 0.0;
	}
}