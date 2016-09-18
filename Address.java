package com.company;
import java.io.*;

/**
 * Created by Iris on 9/9/2016.
 */
public class Address implements Serializable
{
    private String street;
    private String city;
    private String state;
    private int zip;

    public Address()
    {
        street = "123 Fake St";
        city = "Springfield";
        state = "IL";
        zip = 90210;
    }
    public Address(String s, String c, String st, int z)
    {
        street = st;
        city = c;
        state = st;
        zip = z;

    }

    public getstreet()
    {
        return street;
    }
    public getCity()
    {
        return city;
    }
    public getState()
    {
        return state;
    }
    public getZip()
    {
        return zip;
    }

    public void setStreet(String s)
    {
        street = s;
    }
    public void setCity(String c)
    {
        city = c;
    }
    public void setState(String s)
    {
        state = s;
    }
    public void setZip(int z)
    {
        zip = z;
    }
    public String toString()
    {
        return "    " +street+ "\n    " + city + ", " + state + " " + zip;
    }
}
