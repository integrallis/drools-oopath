package org.integrallis.drools.oopath;

public class Person {
    private String name = "";
    private Address address;

    public Person() {
    }

    public Person(final String name) {
        super();
        this.setName(name);
    }

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
