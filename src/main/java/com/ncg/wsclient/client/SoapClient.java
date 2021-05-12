package com.ncg.wsclient.client;

import com.ncg.wsclient.config.ClientConfig;
import com.ncg.wsclient.sap.*;
import com.ncg.wsclient.util.BasicAuthenticationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class SoapClient extends WebServiceGatewaySupport {

    @Autowired
    private ClientConfig clientConfig;

    public JAXBElement<AccountingEntryImportCreateConfirmationMessageSync> createRequest(
            String CompanyID,
            String TransactionCurrencyCode
    ){

        ObjectFactory factory = new ObjectFactory();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // BusinessDocumentBasicMessageHeader
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        BusinessDocumentBasicMessageHeader basicMessageHeader = factory
                .createBusinessDocumentBasicMessageHeader();

        BusinessDocumentMessageID businessDocumentMessageID = new BusinessDocumentMessageID();
        businessDocumentMessageID.setValue("");
        basicMessageHeader.setID(businessDocumentMessageID);
        basicMessageHeader.setReferenceID(businessDocumentMessageID);

        UUID uuid = new UUID();
        uuid.setValue("");
        basicMessageHeader.setUUID(uuid);
        basicMessageHeader.setReferenceUUID(uuid);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // AccountingEntryImportCreateRequest
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        AccountingEntryImportCreateRequest accountingEntryImportCreateRequest = factory
                .createAccountingEntryImportCreateRequest();
        accountingEntryImportCreateRequest.setCompanyID(CompanyID);
        accountingEntryImportCreateRequest.setTransactionCurrencyCode(TransactionCurrencyCode);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // AccountingEntryImportCreateRequestMessageSync
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        AccountingEntryImportCreateRequestMessageSync accountingEntryImportCreateRequestMessageSync = factory
                .createAccountingEntryImportCreateRequestMessageSync();
        accountingEntryImportCreateRequestMessageSync.setBasicMessageHeader(basicMessageHeader);
        accountingEntryImportCreateRequestMessageSync.setAccountingEntryImport(accountingEntryImportCreateRequest);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // AccountingEntryImportCreateRequestMessageSync
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JAXBElement<AccountingEntryImportCreateRequestMessageSync> requestMessageSync = factory
                .createAccountingEntryImportCreateRequestSync(accountingEntryImportCreateRequestMessageSync);

        return (JAXBElement<AccountingEntryImportCreateConfirmationMessageSync>) getWebServiceTemplate()
                .marshalSendAndReceive(requestMessageSync, new WebServiceMessageCallback() {
                    @Override
                    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
                        TransportContext context = TransportContextHolder.getTransportContext();
                        HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
                        connection.getConnection().addRequestProperty(
                                "Authorization",
                                BasicAuthenticationUtil.generateBasicAuthenticationHeader(
                                        clientConfig.getUserName(),
                                        clientConfig.getUserPassword()
                                )
                        );
                    }
                });
    }
}
