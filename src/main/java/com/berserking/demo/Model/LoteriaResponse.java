package com.berserking.demo.Model;

import java.util.List;

public class LoteriaResponse {

    private final List<Integer> numeros;

    public LoteriaResponse(List<Integer> numeros){
        this.numeros = numeros;
    }

    public List<Integer> getNumeros(){
        return numeros;
    }
}
