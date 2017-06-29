package org.integrallis.drools.oopath;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Address> locations = new ArrayList<Address>();

	public Company(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getLocations() {
		return locations;
	}

	public void setLocations(List<Address> locations) {
		this.locations = locations;
	}

	public void addLocation(Address address) {
		locations.add(address);
	}
}
