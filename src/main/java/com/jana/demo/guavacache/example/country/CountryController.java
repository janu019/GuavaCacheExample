package com.jana.demo.guavacache.example.country;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/guavacache/v1/country")
@Api(tags = { "country" })
public class CountryController {
	private final CountryService service;

	public CountryController(CountryService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryDto> getAllCountries() {
		return service.getAllCountries();
	}
	
}
