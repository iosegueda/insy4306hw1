/**
 * Created by Iris on 9/17/2016.
 */
 import.java.util.*; 
 
 public abstract class Property extends Address
 {
	 private Address propertyAddress;
	 private double marketValue;
	 private int squareFeet;
	 private boolean floodZone;
	 
	 public Property()
	 {
		 this.propertyAddress = ?;
		 this.marketValue = 0.00;
		 this.squareFeet = 0;
		 this.boolean floodZone = false; 
	 }
	 public Property(Address a, double v, int s, floodZone z)
	 {
		 this.propertyAddress = a;
		 this.marketValue = v;
		 this.squareFeet = s;
		 this.floodZone = z;
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
	 public void setFloodZone (boolean z)
	 {
		 this.floodZone = z;
	 }
	 public String toString()
	 {
		 return "/t Address: " + this.propertyAddress + 
		 "\n\t Market Value: " + this.marketValue +
		 "\n\t Square Feet " + this.squareFeet +
		 "\n\t Flood Zone: " + this.floodZone;
	 }
	 
	 public double calculateTaxes()
	 {
		 return 0.00;
	 }
 }