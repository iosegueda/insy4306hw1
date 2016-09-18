/**
 * Created by Iris on 9/9/2016.
 */
import java.io.*;

public class Address implements Serializable
{
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address()
    {
        this.street = "123 Fake St";
        this.city = "Springfield";
        this.state = "IL";
        this.zip = 90210;
    }
    public Address(String s, String c, String st, int z)
    {
        this.street = st;
        this.city = c;
        this.state = st;
        this.zip = z;
    }

    public String getstreet()
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
        return "    " +this.street+ "\n    " + this.city + 
			", " + this.state + " " + this.zip;
    }
}
