/*
 * An XML document type.
 * Localname: getDebitCardResponse
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards;


/**
 * A document containing one getDebitCardResponse(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards) element.
 *
 * This is a complex type.
 */
public interface GetDebitCardResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDebitCardResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1202BBC5BB549437776BB5078F092DF4").resolveHandle("getdebitcardresponsef6d2doctype");
    
    /**
     * Gets the "getDebitCardResponse" element
     */
    com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse getGetDebitCardResponse();
    
    /**
     * Sets the "getDebitCardResponse" element
     */
    void setGetDebitCardResponse(com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse getDebitCardResponse);
    
    /**
     * Appends and returns a new empty "getDebitCardResponse" element
     */
    com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse addNewGetDebitCardResponse();
    
    /**
     * An XML getDebitCardResponse(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
     *
     * This is a complex type.
     */
    public interface GetDebitCardResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDebitCardResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1202BBC5BB549437776BB5078F092DF4").resolveHandle("getdebitcardresponse5735elemtype");
        
        /**
         * Gets the "debitCard" element
         */
        com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard getDebitCard();
        
        /**
         * Sets the "debitCard" element
         */
        void setDebitCard(com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard debitCard);
        
        /**
         * Appends and returns a new empty "debitCard" element
         */
        com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard addNewDebitCard();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse newInstance() {
              return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument.GetDebitCardResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument newInstance() {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
