/*******************************************************************************
* Copyright Regione Piemonte - 2022
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.esenred.esenredweb.business.deleghebe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inserisciDelegaService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserisciDelegaService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inserisciDelega" type="{http://deleghebe.csi.it/}inserisciDelega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserisciDelegaService", propOrder = {
    "inserisciDelega"
})
public class InserisciDelegaService {

    protected InserisciDelega inserisciDelega;

    /**
     * Gets the value of the inserisciDelega property.
     * 
     * @return
     *     possible object is
     *     {@link InserisciDelega }
     *     
     */
    public InserisciDelega getInserisciDelega() {
        return inserisciDelega;
    }

    /**
     * Sets the value of the inserisciDelega property.
     * 
     * @param value
     *     allowed object is
     *     {@link InserisciDelega }
     *     
     */
    public void setInserisciDelega(InserisciDelega value) {
        this.inserisciDelega = value;
    }

}
