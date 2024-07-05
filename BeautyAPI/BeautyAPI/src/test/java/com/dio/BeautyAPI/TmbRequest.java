package com.dio.BeautyAPI;

public class TmbRequest {
    private String sexo;
    private double peso;
    private double altura;
    private int idade;

    public TmbRequest(String sexo, double altura, int idade) {
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    // getters e setters
}
