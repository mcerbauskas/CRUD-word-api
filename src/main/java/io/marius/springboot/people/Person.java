package io.marius.springboot.people;

//hardcode'intas zmoniu sarasas

public class Person {
	
	private String id;
	private String name;
	private String surname;
	
	// no arg constructor
	public Person() 
	{
		
	}
	//konstructor'ius, kuris paima siuos argumentus ir inicijuoja objektus
	public Person(String id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	//sugeneruojame setters and getters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	

}
