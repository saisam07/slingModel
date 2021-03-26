package com.mindtree.capability.core.bean;

public class SlingCapabilityEntity {

	public int Id;
	public String Name;
	public String CountryCode;
	public String District;
	public int Population;

	public SlingCapabilityEntity() {

	}

	public SlingCapabilityEntity(int id, String name, String countryCode, String district, int population) {
		super();
		Id = id;
		Name = name;
		CountryCode = countryCode;
		District = district;
		Population = population;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getDistrict() {
		return District;
	}

	public int getPopulation() {
		return Population;
	}

}
