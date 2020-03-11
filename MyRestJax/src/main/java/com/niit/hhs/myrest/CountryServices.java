package com.niit.hhs.myrest;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class CountryServices {
	static HashMap<Integer, Country> countryIdMap = getCountryIdMap();

	CountryServices() {
		if (countryIdMap == null) {
			countryIdMap = new HashMap<Integer, Country>();
			Country india = new Country(1, "India", 10000);
			Country China = new Country(2, "China", 7000);
			Country Bhutan = new Country(3, "Bhutan", 8000);
			Country UAE = new Country(4, "UAE", 1000);

			countryIdMap.put(1, india);
			countryIdMap.put(2, China);
			countryIdMap.put(3, Bhutan);
			countryIdMap.put(4, UAE);

		}
	}

	public List getAllCountries() {
		List countries = new ArrayList(countryIdMap.values());
		return countries;

	}

	public Country getCountry(int id) {
		Country country = countryIdMap.get(id);
		return country;
	}

	public Country addCountry(Country country) {
		country.setId(countryIdMap.size() + 1);
		return country;
	}

	public Country updateCountry(Country country) {
		if (country.getId() <= 0)
			return null;
		countryIdMap.put(country.getId(), country);
		return country;
	}

	public void deleteCountry(int id) {
		countryIdMap.remove(id);
	}

	public static HashMap<Integer, Country> getCountryIdMap() {
		return countryIdMap;
	}
}