package com.mucahit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mucahit.Service.DepartmantService;
import com.mucahit.entity.Departmant;

@RestController
@RequestMapping(path = "/departmant")
public class DepartmantController {

	public DepartmantService departmantService;
	public DepartmantController(DepartmantService departmantService) {
		this.departmantService = departmantService;
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Departmant>> getAll() {
		System.out.println("getAll called");
		return new ResponseEntity<List<Departmant>>(departmantService.getAll(), HttpStatus.OK);
	}
	
	/*@GetMapping("/{id}")
	public ResponseEntity getOne(@PathVariable("id") 	int id) {
		System.out.println("getone called");
		return new ResponseEntity(departmantService.getOne(id), HttpStatus.OK);
		
	}*/
	@PostMapping(path = "/getone", consumes = "application/json", produces = "application/json")
	public ResponseEntity getOne(@RequestBody Departmant departmant) {
		System.out.println("getone called");
		System.out.println(departmant.toString());
	    return new ResponseEntity(departmantService.getOne(departmant.getD_id()),HttpStatus.OK);
	}
	
	@PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
	public ResponseEntity save(@RequestBody Departmant departmant) {
		System.out.println("save called");
		System.out.println(departmant.toString());
		departmantService.save(departmant);
	    return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping(path = "/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity update(@RequestBody Departmant departmant) {
		System.out.println("update called");
		System.out.println(departmant.toString());
		departmantService.update(departmant);
	    return new ResponseEntity(HttpStatus.OK);
	    
	}
	@DeleteMapping(path = "/delete", consumes = "application/json", produces = "application/json")
	public ResponseEntity delete(@RequestBody Departmant departmant) {
		System.out.println("delete called");
		System.out.println(departmant.toString());
		System.out.println("denmee");
		System.out.println("denmee");

		System.out.println("denmee");

		departmantService.delete(departmant.getD_id());
	    return new ResponseEntity(HttpStatus.OK);
	    
	    
	}

}
