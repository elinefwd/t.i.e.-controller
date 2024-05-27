package com.techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/televisions")
public class TelevisionsController {

    @GetMapping
    public ResponseEntity<String> getAllTelevisions() {
        // Logica om alle televisies op te halen
        return ResponseEntity.ok("List of all televisions");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevisionById(@PathVariable Long id) {
        // Logica om een televisie op basis van id op te halen
        return ResponseEntity.ok("Television with id: " + id);
    }

    @PostMapping
    public ResponseEntity<String> createTelevision(@RequestBody String television) {
        // Logica om een nieuwe televisie aan te maken
        return ResponseEntity.created(null).body("Television created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable Long id, @RequestBody String television) {
        // Logica om een bestaande televisie te updaten
        return ResponseEntity.ok("Television updated with id: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTelevision(@PathVariable Long id) {
        // Logica om een televisie te verwijderen
        return ResponseEntity.noContent().build();
    }
}
