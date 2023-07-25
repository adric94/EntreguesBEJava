package cat.itacademy.barcelonactiva.cervillasosa.adria.s04.t02.n01.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fruita")
public class Fruita {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
@Column(name="nom")
String nom;
@Column(name="quantitatKilos")
int quantitatKilos;

public Fruita() {
	
}
public Fruita(int id, String nom, int quantitatKilos) {
	super();
	this.id = id;
	this.nom = nom;
	this.quantitatKilos = quantitatKilos;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getQuantitatKilos() {
	return quantitatKilos;
}

public void setQuantitatKilos(int quantitatKilos) {
	this.quantitatKilos = quantitatKilos;
}
@Override
public String toString() {
	return "Fruita [id=" + id + ", nom=" + nom + ", quantitatKilos=" + quantitatKilos + "]";
}


}
