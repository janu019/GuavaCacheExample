package com.jana.demo.guavacache.example.country;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository {
	public List<CountryDto> getAllCountries() {
		CountryDto c = new CountryDto(1L, "USA", "United States Of America");
		List<CountryDto> countries = new ArrayList<>();
		countries.add(c);
		return countries;
	}
}
