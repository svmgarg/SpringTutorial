package com.basic.autowire;

public class Employee {

	private String name;
	private int id;

	private ContactInformation contactInformation;
	private Address address;

    public Employee(ContactInformation contactInformation, Address address) {
		System.out.println("In Constructorwith 2 param");
        this.contactInformation = contactInformation;
        this.address = address;
    }


	public Employee(String name, int id, ContactInformation contactInformation, Address address) {
		System.out.println("In Constructorwith 4 param");
		this.name = name;
		this.id = id;
		this.contactInformation = contactInformation;
		this.address = address;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}


	public String getName() {
        System.out.println("In Getter");
		return name;
	}

	public void setName(String name) {
        System.out.println("In Setter");
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", contactInformation=" + contactInformation +
                ", address=" + address +
                '}';
    }

    public Employee() {
        System.out.println("In Constructor");
    }
}
