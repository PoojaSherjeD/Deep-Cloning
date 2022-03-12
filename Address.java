
public class Address implements Cloneable{
	String district;
	String city;
	int pincode;


Address()
{
	
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


public Address(String district, String city, int pincode) {
	super();
	this.district = district;
	this.city = city;
	this.pincode = pincode;
}


@Override
public String toString() {
	return "Address [district=" + district + ", city=" + city + ", pincode=" + pincode + "]";
}

}