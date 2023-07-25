package cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
@CrossOrigin(origins = "http://localhost:8080")
public class FruitaController {

final FruitaService fruitaservice;
@Autowired
public FruitaController (FruitaService fruitaservice) {
	this.fruitaservice = fruitaservice;
}
@PostMapping("/add")
public ResponseEntity<Fruita> addFruita(@RequestBody Fruita fruita)	{
	Fruita fruita1 = fruitaservice.addFruita(fruita);
	return new ResponseEntity<>(fruita1, HttpStatus.CREATED);
}

@PutMapping("/update")
public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita)	{
	Fruita fruita1 = fruitaservice.updateFruita(fruita);
	return new ResponseEntity<>(fruita1, HttpStatus.OK);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<Void> deleteFruita (@PathVariable int id){
	fruitaservice.deleteFruita(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

@GetMapping("/getOne/{id}")
public ResponseEntity<Fruita> getFruitaById (@PathVariable int id){
	Fruita fruita1 = fruitaservice.getFruitaById(id);
	if (fruita1 != null) {
		return new ResponseEntity<>(fruita1, HttpStatus.OK);
	}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);		
		}
}

@GetMapping("/getAll")
public ResponseEntity<List<Fruita>> getAllFruita (){
	List<Fruita> fruita = fruitaservice.getAllFruita();
	return new ResponseEntity<>(fruita, HttpStatus.OK);
	
 }

	/* 	http://localhost:8080/fruita/add	
		
		http://localhost:8080/fruita/update

		http://localhost:8080/fruita/delete/{id}

		http://localhost:8080/fruita/getOne/{id}

		http://localhost:8080/fruita/getAll
	*/
	

}
