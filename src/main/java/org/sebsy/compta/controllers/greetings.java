package org.sebsy.compta.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class greetings {
    // je crée mon premier controller pour tester mon application spring boot
    // je vais créer une méthode qui va retourner un message de bienvenue

    @RestController
    public static class GreetingController {
        @GetMapping("/greeting")
        public String greeting() {
            return "Bienvenue dans mon application Spring Boot !, c'est une application qui gère la compta d'une quinquaillerie";
        }
    }
}
