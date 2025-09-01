package com.berserking.demo.Controller;

import com.berserking.demo.Model.LoteriaResponse;
import com.berserking.demo.Service.LoteriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1/getNumeros")
public class LoteriaController {

    private final LoteriaService loteriaService;

    public LoteriaController(LoteriaService loteriaService){
        this.loteriaService=loteriaService;
    }

    @GetMapping
    public LoteriaResponse getNumeros(
            @RequestParam(name = "numSuerte",defaultValue = "0") int numSuerte,
            @RequestParam(name = "tamanio",defaultValue = "5") int tamanio){
        return  new LoteriaResponse(loteriaService.generarNumeros(numSuerte,tamanio));
    }
}
