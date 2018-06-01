/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingrauleduardop.soap.ws.consumer.axis2;

import cl.ingrauleduardop.ws.DebitCardsPortServiceStub;
import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument;
import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest;
import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument;
import com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rperez
 */
public class Main {

    public static void main(String[] args) {
        try {
            DebitCardsPortServiceStub debitCardsPortServiceStub = new DebitCardsPortServiceStub();
            GetDebitCardRequestDocument requestDoc = GetDebitCardRequestDocument.Factory.newInstance();
            GetDebitCardRequest request = GetDebitCardRequest.Factory.newInstance();
            request.setNumeroTarjeta("1235698745");
            requestDoc.setGetDebitCardRequest(request);
            GetDebitCardResponseDocument responseDoc = debitCardsPortServiceStub.getDebitCard(requestDoc);
            GetDebitCardResponse response = responseDoc.getGetDebitCardResponse();
            System.out.println("\n\n======================================================================");
            System.out.println("================ INFORMACIÓN DE TARJETA DE DEBITO ====================");
            System.out.println("NÚMERO DE TARJETA: " + response.getDebitCard().getNumeroTarjeta());
            System.out.println("TIPO DE USUARIO: " + response.getDebitCard().getTipoUsuario());
            System.out.println("CÓDIGO DE ESTADO: " + response.getDebitCard().getCodigoEstado());
            System.out.println("======================================================================\n\n");
        } catch (RemoteException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
