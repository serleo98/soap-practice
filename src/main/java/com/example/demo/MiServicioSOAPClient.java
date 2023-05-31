package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
@Component
public class MiServicioSOAPClient extends WebServiceGatewaySupport {
    public String saludar(String nombre) {
        SaludoRequest request = new SaludoRequest();
        request.setNombre(nombre);

        SaludoResponse response = (SaludoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/miservicio", request);

        return response.getSaludo();
    }
}
