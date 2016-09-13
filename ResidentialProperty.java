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
	}
	public ResidentialProperty(Address a, double v, int f, boolean z, Subdivision s)
	{
		super.setPropertyAddress(a);
		super.setMarketValue(v);
		super.setSquareFeet(f);
		super.setFloodZone(z);
		this.setSubdivision(s);
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
	public double calculateTaxes()
	{
		return 0.0;
	}
	public double calculateExemption()
	{
		return 0.0;
	}
}