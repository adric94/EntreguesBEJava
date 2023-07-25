package cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.repository.FruitaRepository;

@Service
public class FruitaService {

FruitaRepository fruitarepository;
@Autowired
public FruitaService (FruitaRepository fruitarepository) {
	this.fruitarepository = fruitarepository;
	
}

public Fruita addFruita(Fruita fruita) {
	return fruitarepository.save(fruita);
}

public Fruita updateFruita(Fruita fruita) {
	return fruitarepository.save(fruita);
}

public void deleteFruita(int id) {
	fruitarepository.deleteById(id);
}

public Fruita getFruitaById (int id) {
	
	Optional<Fruita> optionalfruita = fruitarepository.findById(id);
	return optionalfruita.orElse(null);
}

public List<Fruita> getAllFruita(){
	return fruitarepository.findAll();
	
}

}
