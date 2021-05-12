package com.ncg.wsclient.config;

import com.ncg.wsclient.client.SoapClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClientConfig {

    @Value("${ws.url}")
    private String wsUrl;

    @Value("${ws.username}")
    private String username;

    @Value("${ws.password}")
    private String password;

    public String getUserName() {
        return username;
    }

    public String getUserPassword() {
        return password;
    }

    @Bean
    Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.ncg.wsclient.sap");

        return jaxb2Marshaller;
    }

    @Bean
    public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setDefaultUri(wsUrl);

        return client;
    }
}
