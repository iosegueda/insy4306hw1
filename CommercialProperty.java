/**
 * Created by Iris on 9/17/2016.
 */
 
 public class CommercialProperty extends Property
 {
	 private String businessName;
	 private String stateCode;
	 
	 public CommercialProperty()
	 {
		 this.businessName = "";
	 }
	 public CommercialProperty(Address a, double v, int f, boolean z, String b, String c)
	 {
		
	 }
	 
	 public String getBusinessName()
	 {
		 return this.businessName;
	 }
	 public String getStateCode()
	 {
		 return this.stateCode;
	 }
	 public void setBusinessName(String n)
	 {
		 this.businessName = n;
	 }
	 public void stateCode(String c)
	 {
		 this.stateCode = c;
	 }
	 
	 public String toString()
	 {
		 return "/t $";
	 }
	 public double calculateTaxes()
	 {
		 double totalTaxes;
		 
		 if(squareFeet > 1500)
		 {
			 if( stateCode.equals(TX))
			 {
				 totalTaxes = ()marketValue * 0.25);
				 return totalTaxes;
			 }
			 else 
				 return totalTaxes;
		 }
		 else 
		 {
			 totalTaxes = (marketValue * 0.10);
			 return totalTaxes;
		 }
	 }
 }