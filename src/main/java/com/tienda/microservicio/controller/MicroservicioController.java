package com.tienda.microservicio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/microservicio")
public class MicroservicioController {

    @GetMapping("/{id}")
    public ResponseEntity<String> obtenerPorId(@PathVariable Integer id) {
        return ResponseEntity.ok("Integración OK - GET, recibido path variable: " + id);
    }
}
