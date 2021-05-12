package com.ncg.wsclient.controller;

import com.ncg.wsclient.client.SoapClient;
import com.ncg.wsclient.sap.AccountingEntryImportCreateConfirmationMessageSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;

@RestController
public class AccountingEntryImportController {

    @Autowired
    SoapClient soapClient;

    @GetMapping("/aei")
    public AccountingEntryImportCreateConfirmationMessageSync create(){
        return soapClient.createRequest(
                "9000",
                "USD"
        );
    }
}
