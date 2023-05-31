package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiServicioSOAPController {
    @Autowired
    private MiServicioSOAPClient soapClient;

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return soapClient.saludar(nombre);
    }
}
