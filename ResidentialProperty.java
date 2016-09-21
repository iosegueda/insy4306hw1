/**
 * Created by Iris on 9/18/2016.
 */
 
 public class ResidentialProperty extends Property implements Exemtion 
 {
	private double exemption = 0.00;
	private enum Subdivision 
	{
		NONE, KINGLY_ESTATES, STATELY_ESTATES, KING_MANOR, GREEN_CABLES
	}
	private Subdivision subdivision = Subdivision.None; 
	
	public ResidentialProperty()
	{
		this.exemption = 0.00;
		this.subdivision = NONE;
	}
	public ResidentialProperty(Address a, double v, int f, boolean z, Subdivision s)
	{
		super.setPropertyAddress(a);
		super.setMarketValue(v);
		super.setSquareFeet(f);
		super.setFloodZone(z);
		this.subdivision = s;
		
	}
	
	public Subdivision getSubdivision()
	{
		return this.subdivision;
	}
	public void setSubdivision(Subdivision s)
	{
		this.subdivision = s;
	}
	
	public double getExemption()
	{
		return this.exemption;
	}
	public void setExemption(double a)
	{
		this.exemption = a;
	}
	public String toString()
	{
		return "/t $";
	}
	
	public double calculateTaxes()
	{
		double totalTaxes;
		
		totalTaxes = (super.marketValue * 0.5); 
		
		if (super.floodZone)
		{
			totalTaxes = totalTaxes * 0.1;
			
			return totalTaxes;
		}
		else 
			return totalTaxes; 
	}
	public double calculateExemption()
	{
		double totalExemptions;
		
		totalExemptions = (super.getMarketValue() * COUNTY) + (super.getMarketValue() * CITY) + (super.getMarketValue() * SCHOOL) + 
			(super.getMarketValue() * MEDICAL); 
		
		return totalExemptions;
	}
 }