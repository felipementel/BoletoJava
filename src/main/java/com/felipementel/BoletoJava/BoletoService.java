package com.felipementel.BoletoJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletoService {

    private final BoletoRepository boletoRepository;

    @Autowired
    public BoletoService(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    public Boleto createBoleto(Boleto boleto) {
        return boletoRepository.save(boleto);
    }

    public Boleto getBoletoById(Long id) {
        return boletoRepository.findById(id).orElseThrow(() -> new RuntimeException("Boleto not found"));
    }

    public Boleto updateBoleto(Long id, Boleto boleto) {
        Boleto existingBoleto = getBoletoById(id);
        existingBoleto.setDueDate(boleto.getDueDate());
        existingBoleto.setValue(boleto.getValue());
        existingBoleto.setStatus(boleto.getStatus());
        return boletoRepository.save(existingBoleto);
    }

    public void deleteBoleto(Long id) {
        boletoRepository.deleteById(id);
    }
}
