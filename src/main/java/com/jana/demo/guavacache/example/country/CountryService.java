package com.jana.demo.guavacache.example.country;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountryService {
	private final CountryRepository repository;

	public CountryService(CountryRepository repository) {
		this.repository = repository;
	}

	public List<CountryDto> getAllCountries() {
		return repository.getAllCountries();
	}

}
