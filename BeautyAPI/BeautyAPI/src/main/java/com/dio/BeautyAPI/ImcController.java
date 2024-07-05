package com.dio.BeautyAPI;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {

    @PostMapping("/imc")
    public ImcResponse calcularIMC(@RequestBody ImcRequest request) {
        double peso = ((ImcRequest) request).getPeso();
        double altura = request.getAltura();

        // Calcular IMC
        double imc = peso / (altura * altura);

        return new ImcResponse(imc);
    }
}

