package com.tienda.microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.microservicio.model.Boleta;
import com.tienda.microservicio.model.ProductoCompra;
import com.tienda.microservicio.service.CompraService;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<Boleta> realizarCompra(@RequestBody List<ProductoCompra> carrito) {

        Boleta boleta = compraService.procesarCompra(carrito);
        return ResponseEntity.ok(boleta);
    }

}
