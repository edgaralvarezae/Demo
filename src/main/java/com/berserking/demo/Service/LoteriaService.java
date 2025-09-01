package com.berserking.demo.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoteriaService {
    private final Random random = new Random();

    public List<Integer> generarNumeros(int numSuerte, int tamanio){
        int posicion=random.nextInt(tamanio);
        List<Integer> resultado=new ArrayList<>(Collections.nCopies(tamanio,0));
        resultado.set(posicion,numSuerte);
        int randomSet=0;
        for (int i=0;i<tamanio;i++) {

            randomSet=random.nextInt(10);
            if (i!=posicion){
                resultado.set(i,randomSet);
            }
        }
        return resultado;
    }
}
