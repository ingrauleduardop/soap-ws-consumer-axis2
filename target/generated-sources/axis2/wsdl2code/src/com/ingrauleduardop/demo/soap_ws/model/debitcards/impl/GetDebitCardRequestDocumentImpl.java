/*
 * An XML document type.
 * Localname: getDebitCardRequest
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards.impl;
/**
 * A document containing one getDebitCardRequest(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards) element.
 *
 * This is a complex type.
 */
public class GetDebitCardRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument
{
    
    public GetDebitCardRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEBITCARDREQUEST$0 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "getDebitCardRequest");
    
    
    /**
     * Gets the "getDebitCardRequest" element
     */
    public com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest getGetDebitCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest)get_store().find_element_user(GETDEBITCARDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDebitCardRequest" element
     */
    public void setGetDebitCardRequest(com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest getDebitCardRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest)get_store().find_element_user(GETDEBITCARDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest)get_store().add_element_user(GETDEBITCARDREQUEST$0);
            }
            target.set(getDebitCardRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "getDebitCardRequest" element
     */
    public com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest addNewGetDebitCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest)get_store().add_element_user(GETDEBITCARDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getDebitCardRequest(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
     *
     * This is a complex type.
     */
    public static class GetDebitCardRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest
    {
        
        public GetDebitCardRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMEROTARJETA$0 = 
            new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "numero_tarjeta");
        
        
        /**
         * Gets the "numero_tarjeta" element
         */
        public java.lang.String getNumeroTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numero_tarjeta" element
         */
        public org.apache.xmlbeans.XmlString xgetNumeroTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROTARJETA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numero_tarjeta" element
         */
        public void setNumeroTarjeta(java.lang.String numeroTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROTARJETA$0);
                }
                target.setStringValue(numeroTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "numero_tarjeta" element
         */
        public void xsetNumeroTarjeta(org.apache.xmlbeans.XmlString numeroTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROTARJETA$0);
                }
                target.set(numeroTarjeta);
            }
        }
    }
}
