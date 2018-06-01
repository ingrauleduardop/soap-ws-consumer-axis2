/*
 * XML Type:  debitCard
 * Namespace: http://ingrauleduardop.com/demo/soap-ws/model/debitCards
 * Java type: com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard
 *
 * Automatically generated - do not modify.
 */
package com.ingrauleduardop.demo.soap_ws.model.debitcards.impl;
/**
 * An XML debitCard(@http://ingrauleduardop.com/demo/soap-ws/model/debitCards).
 *
 * This is a complex type.
 */
public class DebitCardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.ingrauleduardop.demo.soap_ws.model.debitcards.DebitCard
{
    
    public DebitCardImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROTARJETA$0 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "numero_tarjeta");
    private static final javax.xml.namespace.QName TIPOUSUARIO$2 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "tipo_usuario");
    private static final javax.xml.namespace.QName CODIGOESTADO$4 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "codigo_estado");
    private static final javax.xml.namespace.QName CODIGOBLOQUEO$6 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "codigo_bloqueo");
    private static final javax.xml.namespace.QName NOMBREBLOQUEO$8 = 
        new javax.xml.namespace.QName("http://ingrauleduardop.com/demo/soap-ws/model/debitCards", "nombre_bloqueo");
    
    
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
    
    /**
     * Gets the "tipo_usuario" element
     */
    public java.lang.String getTipoUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOUSUARIO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tipo_usuario" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoUsuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOUSUARIO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tipo_usuario" element
     */
    public void setTipoUsuario(java.lang.String tipoUsuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOUSUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOUSUARIO$2);
            }
            target.setStringValue(tipoUsuario);
        }
    }
    
    /**
     * Sets (as xml) the "tipo_usuario" element
     */
    public void xsetTipoUsuario(org.apache.xmlbeans.XmlString tipoUsuario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOUSUARIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOUSUARIO$2);
            }
            target.set(tipoUsuario);
        }
    }
    
    /**
     * Gets the "codigo_estado" element
     */
    public java.lang.String getCodigoEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOESTADO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo_estado" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoEstado()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOESTADO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "codigo_estado" element
     */
    public void setCodigoEstado(java.lang.String codigoEstado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOESTADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOESTADO$4);
            }
            target.setStringValue(codigoEstado);
        }
    }
    
    /**
     * Sets (as xml) the "codigo_estado" element
     */
    public void xsetCodigoEstado(org.apache.xmlbeans.XmlString codigoEstado)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOESTADO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOESTADO$4);
            }
            target.set(codigoEstado);
        }
    }
    
    /**
     * Gets the "codigo_bloqueo" element
     */
    public java.lang.String getCodigoBloqueo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOBLOQUEO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codigo_bloqueo" element
     */
    public org.apache.xmlbeans.XmlString xgetCodigoBloqueo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOBLOQUEO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "codigo_bloqueo" element
     */
    public void setCodigoBloqueo(java.lang.String codigoBloqueo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODIGOBLOQUEO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODIGOBLOQUEO$6);
            }
            target.setStringValue(codigoBloqueo);
        }
    }
    
    /**
     * Sets (as xml) the "codigo_bloqueo" element
     */
    public void xsetCodigoBloqueo(org.apache.xmlbeans.XmlString codigoBloqueo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODIGOBLOQUEO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODIGOBLOQUEO$6);
            }
            target.set(codigoBloqueo);
        }
    }
    
    /**
     * Gets the "nombre_bloqueo" element
     */
    public java.lang.String getNombreBloqueo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREBLOQUEO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombre_bloqueo" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreBloqueo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREBLOQUEO$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombre_bloqueo" element
     */
    public void setNombreBloqueo(java.lang.String nombreBloqueo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREBLOQUEO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREBLOQUEO$8);
            }
            target.setStringValue(nombreBloqueo);
        }
    }
    
    /**
     * Sets (as xml) the "nombre_bloqueo" element
     */
    public void xsetNombreBloqueo(org.apache.xmlbeans.XmlString nombreBloqueo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREBLOQUEO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREBLOQUEO$8);
            }
            target.set(nombreBloqueo);
        }
    }
}
