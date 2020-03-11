package com.niit.hhs.myrest;

public class Country {
	int id;
	String countryname;
	long population;

	public Country() {
		super();
	}

	public Country(int id, String countryname, long population) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.population = population;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}

