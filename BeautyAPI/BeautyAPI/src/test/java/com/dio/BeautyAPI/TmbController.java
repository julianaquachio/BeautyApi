package com.dio.BeautyAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmbController {

    @PostMapping("/tmb")
    public TmbResponse calcularTMB(@RequestBody TmbRequest request) {
        String sexo = request.getSexo();
        double peso = request.getPeso();
        double altura = request.getAltura();
        int idade = request.getIdade();

        // Calcular TMB
        double tmb;
        if (sexo.equals("M")) {
            tmb = 88.362 + (13.397 * peso) + (4.799 * altura * 100) - (5.677 * idade);
        } else if (sexo.equals("F")) {
            tmb = 447.593 + (9.247 * peso) + (3.098 * altura * 100) - (4.330 * idade);
        } else {
            throw new IllegalArgumentException("Sexo deve ser especificado como 'M' ou 'F'");
        }

        return new TmbResponse(tmb);
    }
}

