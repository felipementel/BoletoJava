package com.felipementel.BoletoJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    private final BoletoService boletoService;

    @Autowired
    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @PostMapping
    public ResponseEntity<Boleto> createBoleto(@RequestBody Boleto boleto) {
        Boleto newBoleto = boletoService.createBoleto(boleto);
        return ResponseEntity.ok(newBoleto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boleto> getBoletoById(@PathVariable Long id) {
        Boleto boleto = boletoService.getBoletoById(id);
        return ResponseEntity.ok(boleto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boleto> updateBoleto(@PathVariable Long id, @RequestBody Boleto boleto) {
        Boleto updatedBoleto = boletoService.updateBoleto(id, boleto);
        return ResponseEntity.ok(updatedBoleto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoleto(@PathVariable Long id) {
        boletoService.deleteBoleto(id);
        return ResponseEntity.ok().build();
    }
}
