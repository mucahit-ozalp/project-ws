package com.mucahit.controller;

import java.util.List;

import javax.swing.text.html.HTML;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mucahit.Service.FilterService;
import com.mucahit.entity.Filter;

@RestController
@RequestMapping(path = "/filtre")

public class FiltreController  {
	public FilterService filterService;

	public FiltreController(FilterService filterService) {
		super();
		this.filterService = filterService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Filter>> getall()
	{
		System.out.println("getone called");
		return new ResponseEntity<List<Filter>>(filterService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping(path = "/getone", consumes = "application/json", produces = "application/json")
	public ResponseEntity getOne(@RequestBody Filter filter)
	{

		System.out.println("getone called");
		System.out.println(filter.toString());
		return new ResponseEntity(filterService.getOne(filter.getF_id()),HttpStatus.OK);
	}

	@PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
	public ResponseEntity save(@RequestBody Filter filter)
	{ 
		filterService.save(filter);
		return new  ResponseEntity(HttpStatus.OK);
		
	}
	@PostMapping(path = "/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity update(@RequestBody Filter filter)
	{
		 	filterService.update(filter);
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);//<> içi dolu
	}
	
	
}
