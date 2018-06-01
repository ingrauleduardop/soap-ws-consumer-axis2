/*
 * XML Type:  debitCard
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards;


/**
 * An XML debitCard(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
 *
 * This is a complex type.
 */
public interface DebitCard extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DebitCard.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1202BBC5BB549437776BB5078F092DF4").resolveHandle("debitcard081ftype");
    
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
     * Gets the "tipo_usuario" element
     */
    java.lang.String getTipoUsuario();
    
    /**
     * Gets (as xml) the "tipo_usuario" element
     */
    org.apache.xmlbeans.XmlString xgetTipoUsuario();
    
    /**
     * Sets the "tipo_usuario" element
     */
    void setTipoUsuario(java.lang.String tipoUsuario);
    
    /**
     * Sets (as xml) the "tipo_usuario" element
     */
    void xsetTipoUsuario(org.apache.xmlbeans.XmlString tipoUsuario);
    
    /**
     * Gets the "codigo_estado" element
     */
    java.lang.String getCodigoEstado();
    
    /**
     * Gets (as xml) the "codigo_estado" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoEstado();
    
    /**
     * Sets the "codigo_estado" element
     */
    void setCodigoEstado(java.lang.String codigoEstado);
    
    /**
     * Sets (as xml) the "codigo_estado" element
     */
    void xsetCodigoEstado(org.apache.xmlbeans.XmlString codigoEstado);
    
    /**
     * Gets the "codigo_bloqueo" element
     */
    java.lang.String getCodigoBloqueo();
    
    /**
     * Gets (as xml) the "codigo_bloqueo" element
     */
    org.apache.xmlbeans.XmlString xgetCodigoBloqueo();
    
    /**
     * Sets the "codigo_bloqueo" element
     */
    void setCodigoBloqueo(java.lang.String codigoBloqueo);
    
    /**
     * Sets (as xml) the "codigo_bloqueo" element
     */
    void xsetCodigoBloqueo(org.apache.xmlbeans.XmlString codigoBloqueo);
    
    /**
     * Gets the "nombre_bloqueo" element
     */
    java.lang.String getNombreBloqueo();
    
    /**
     * Gets (as xml) the "nombre_bloqueo" element
     */
    org.apache.xmlbeans.XmlString xgetNombreBloqueo();
    
    /**
     * Sets the "nombre_bloqueo" element
     */
    void setNombreBloqueo(java.lang.String nombreBloqueo);
    
    /**
     * Sets (as xml) the "nombre_bloqueo" element
     */
    void xsetNombreBloqueo(org.apache.xmlbeans.XmlString nombreBloqueo);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard newInstance() {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
