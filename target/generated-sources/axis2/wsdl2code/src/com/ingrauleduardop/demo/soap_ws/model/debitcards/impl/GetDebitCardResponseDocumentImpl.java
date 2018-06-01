/*
 * An XML document type.
 * Localname: getDebitCardResponse
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards.impl;
/**
 * A document containing one getDebitCardResponse(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards) element.
 *
 * This is a complex type.
 */
public class GetDebitCardResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument
{
    
    public GetDebitCardResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDEBITCARDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "getDebitCardResponse");
    
    
    /**
     * Gets the "getDebitCardResponse" element
     */
    public com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse getGetDebitCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse)get_store().find_element_user(GETDEBITCARDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDebitCardResponse" element
     */
    public void setGetDebitCardResponse(com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse getDebitCardResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse)get_store().find_element_user(GETDEBITCARDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse)get_store().add_element_user(GETDEBITCARDRESPONSE$0);
            }
            target.set(getDebitCardResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getDebitCardResponse" element
     */
    public com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse addNewGetDebitCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse target = null;
            target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse)get_store().add_element_user(GETDEBITCARDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getDebitCardResponse(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
     *
     * This is a complex type.
     */
    public static class GetDebitCardResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse
    {
        
        public GetDebitCardResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEBITCARD$0 = 
            new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "debitCard");
        
        
        /**
         * Gets the "debitCard" element
         */
        public com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard getDebitCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard target = null;
                target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard)get_store().find_element_user(DEBITCARD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "debitCard" element
         */
        public void setDebitCard(com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard debitCard)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard target = null;
                target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard)get_store().find_element_user(DEBITCARD$0, 0);
                if (target == null)
                {
                    target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard)get_store().add_element_user(DEBITCARD$0);
                }
                target.set(debitCard);
            }
        }
        
        /**
         * Appends and returns a new empty "debitCard" element
         */
        public com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard addNewDebitCard()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard target = null;
                target = (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard)get_store().add_element_user(DEBITCARD$0);
                return target;
            }
        }
    }
}
