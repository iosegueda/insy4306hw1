public class CommercialProperty extends Property
{
	private String businessName;
	private String stateCode;

	public CommercialProperty()
	{
		super.Property();
		this.setBusinessName("");
		this.setStateCode("");
	}
	public CommercialProperty(Address a, double v, int f, boolean z, String b, String c)
	{
		super.Property(a, v, f, z);
		this.setBusinessName(b);
		this.setStateCode(c);
	}
	public String getBusinessName()
	{
		return this.businessName;
	}
	public String getStateCode()
	{
		return this.stateCode;
	}
	public Void setBusinessName(String n)
	{
		this.businessName = n;
	}
	public Void setStateCode(String c)
	{
		this.stateCode = c;
	}
	public String toString()
	{
		return "";
	}
	public double calculateTaxes()
	{
		return 0.0;
	}
}