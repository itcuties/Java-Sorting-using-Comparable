package com.itcuties.java.sorting;

/**
 * Class represents dollar.
 * 
 * @author itcuties
 *
 */
public class Dollar implements Comparable<Dollar> {

	// Country eg. US, AUS, CAN
	private String country;
	// Value
	private Integer value;

	// Compare values method
	public int compareTo(Dollar d) {
		// Countries have to match
		// Because we don't take into consideration the the exchange rates
		if (!country.equals(d.getCountry()))
			throw new RuntimeException("Those dollars countries doesn't match");
		
		// If this obejct's value is greater then d value then a value 1 will be returned
		if (this.value - d.getValue() > 0)
			return 1;
		// If this obejct's value is smaller then d value then a value -1 will be returned
		if (this.value - d.getValue() < 0)
			return - 1;
		
		// By default they are equal
		return 0;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return getValue()+"$";
	}
	
}
