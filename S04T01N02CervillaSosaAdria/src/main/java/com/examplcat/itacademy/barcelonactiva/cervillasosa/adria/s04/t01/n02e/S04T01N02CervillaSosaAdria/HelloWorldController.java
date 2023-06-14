package com.examplcat.itacademy.barcelonactiva.cervillasosa.adria.s04.t01.n02e.S04T01N02CervillaSosaAdria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }

    @GetMapping({"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(value = "nom", required=false) String nom) {
    	if (nom != null) {
            return "Hola, " + nom + ". Estàs executant un projecte Gradle";
        } else {
            return "Hola, UNKNOWN. Estàs executant un projecte Gradle";
        }
    }
}