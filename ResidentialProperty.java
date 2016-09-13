public class ResidentialProperty extends Property implements Exemption
{
	public enum Subdivision {NONE, KINGLY_ESTATES, STATELY_ESTATES, KING_MANOR, GREEN_GABLES};
	private Subdivision subdivision;
	private double exemption;

	public ResidentialProperty()
	{
		super.setPropertyAddress(new Address());
		super.setMarketValue(0.0);
		super.setSquareFeet(0);
		super.setFloodZone(false);
		this.subdivision = Subdivision.NONE;
		this.setExemption(this.calculateExemption());
	}
	public ResidentialProperty(Address a, double v, int f, boolean z, Subdivision s)
	{
		super.setPropertyAddress(a);
		super.setMarketValue(v);
		super.setSquareFeet(f);
		super.setFloodZone(z);
		this.setSubdivision(s);
		this.setExemption(this.calculateExemption());
	}
	public Subdivision getSubdivision()
	{
		return this.subdivision;
	}
	public double getExemption()
	{
		return this.exemption;
	}
	public void setSubdivision(Subdivision s)
	{
		this.subdivision = s;
	}
	public void setExemption(double a)
	{
		this.exemption = a;
	}
	public String toString()
	{
		String str = super.toString() + "Subdivision: " + subdivision + "\nExemption: " + Double.toString(exemption);
		return str;
	}
	@Override
	public double calculateTaxes()
	{
		double taxes = super.getMarketValue() * 0.5;
		if(!super.getFloodZone())
		{
			return(taxes);
		}
		return(taxes * 1.1);
	}
	public double calculateExemption()
	{
		return ( super.getMarketValue() * (COUNTY + CITY + SCHOOL + MEDICAL) );
	}
}