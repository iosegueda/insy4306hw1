public class ResidentialProperty extends Property implements Exemption
{
	public enum Subdivision {NONE, KINGLY_ESTATES, STATELY_ESTATES, KING_MANOR, GREEN_GABLES};
	private Subdivision subdivision;
	private double exemption;

	public ResidentialProperty()
	{
		super.Property();
		this.subdivision = Subdivision.NONE;
	}
	public ResidentialProperty(Address a, double v, int f, boolean z, Subdivision s)
	{
		super.Property(a, v, f, z);
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
	public Void setSubdivision(Subdivision s)
	{
		this.subdivision = s;
	}
	public Void setExemption(double a)
	{
		this.exemption = a;
	}
	public String toString()
	{
		return "";
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