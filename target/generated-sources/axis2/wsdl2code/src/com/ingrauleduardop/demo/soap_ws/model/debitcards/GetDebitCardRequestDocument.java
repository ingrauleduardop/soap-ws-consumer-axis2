/*
 * An XML document type.
 * Localname: getDebitCardRequest
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards;


/**
 * A document containing one getDebitCardRequest(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards) element.
 *
 * This is a complex type.
 */
public interface GetDebitCardRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDebitCardRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1202BBC5BB549437776BB5078F092DF4").resolveHandle("getdebitcardrequesta162doctype");
    
    /**
     * Gets the "getDebitCardRequest" element
     */
    com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest getGetDebitCardRequest();
    
    /**
     * Sets the "getDebitCardRequest" element
     */
    void setGetDebitCardRequest(com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest getDebitCardRequest);
    
    /**
     * Appends and returns a new empty "getDebitCardRequest" element
     */
    com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest addNewGetDebitCardRequest();
    
    /**
     * An XML getDebitCardRequest(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
     *
     * This is a complex type.
     */
    public interface GetDebitCardRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetDebitCardRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1202BBC5BB549437776BB5078F092DF4").resolveHandle("getdebitcardrequestfc0delemtype");
        
        /**
         * Gets the "numero_tarjeta" element
         */
        java.lang.String getNumeroTarjeta();
        
        /**
         * Gets (as xml) the "numero_tarjeta" element
         */
        org.apache.xmlbeans.XmlString xgetNumeroTarjeta();
        
        /**
         * Sets the "numero_tarjeta" element
         */
        void setNumeroTarjeta(java.lang.String numeroTarjeta);
        
        /**
         * Sets (as xml) the "numero_tarjeta" element
         */
        void xsetNumeroTarjeta(org.apache.xmlbeans.XmlString numeroTarjeta);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest newInstance() {
              return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument.GetDebitCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument newInstance() {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.GetDebitCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
