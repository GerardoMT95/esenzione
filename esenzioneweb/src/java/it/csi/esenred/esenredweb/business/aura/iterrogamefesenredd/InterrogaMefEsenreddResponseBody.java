/*******************************************************************************
* Copyright Regione Piemonte - 2022
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.esenred.esenredweb.business.aura.iterrogamefesenredd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InterrogaMefEsenreddResponseBody complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterrogaMefEsenreddResponseBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capResidenza" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codicefiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunenasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datadecesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datanascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="findType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idComunenascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idStatonascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indirizzoResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nazionenasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinciaResidenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincianasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provnasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sceltaInDeroga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterrogaMefEsenreddResponseBody", propOrder = {
    "capResidenza",
    "codicefiscale",
    "cognome",
    "comuneResidenza",
    "comunenasc",
    "datadecesso",
    "datanascita",
    "findType",
    "idComunenascita",
    "idStatonascita",
    "indirizzoResidenza",
    "nazionenasc",
    "nome",
    "provinciaResidenza",
    "provincianasc",
    "provnasc",
    "sceltaInDeroga",
    "sesso",
    "privacy"
})
public class InterrogaMefEsenreddResponseBody {

	 	protected String capResidenza;
	    protected String codicefiscale;
	    protected String cognome;
	    protected String comuneResidenza;
	    protected String comunenasc;
	    protected String datadecesso;
	    protected String datanascita;
	    protected String findType;
	    protected String idComunenascita;
	    protected String idStatonascita;
	    protected String indirizzoResidenza;
	    protected String nazionenasc;
	    protected String nome;
	    protected String provinciaResidenza;
	    protected String provincianasc;
	    protected String provnasc;
	    protected String sceltaInDeroga;
	    protected String sesso;
	    protected String privacy;

    /**
     * Recupera il valore della proprietÓ capResidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapResidenza() {
        return capResidenza;
    }

    /**
     * Imposta il valore della proprietÓ capResidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapResidenza(String value) {
        this.capResidenza = value;
    }

    /**
     * Recupera il valore della proprietÓ codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicefiscale() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprietÓ codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicefiscale(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprietÓ cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietÓ cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietÓ comuneResidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneResidenza() {
        return comuneResidenza;
    }

    /**
     * Imposta il valore della proprietÓ comuneResidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneResidenza(String value) {
        this.comuneResidenza = value;
    }

    /**
     * Recupera il valore della proprietÓ comunenasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunenasc() {
        return comunenasc;
    }

    /**
     * Imposta il valore della proprietÓ comunenasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunenasc(String value) {
        this.comunenasc = value;
    }

    /**
     * Recupera il valore della proprietÓ datadecesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatadecesso() {
        return datadecesso;
    }

    /**
     * Imposta il valore della proprietÓ datadecesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatadecesso(String value) {
        this.datadecesso = value;
    }

    /**
     * Recupera il valore della proprietÓ datanascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatanascita() {
        return datanascita;
    }

    /**
     * Imposta il valore della proprietÓ datanascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatanascita(String value) {
        this.datanascita = value;
    }

    /**
     * Recupera il valore della proprietÓ findType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindType() {
        return findType;
    }

    /**
     * Imposta il valore della proprietÓ findType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindType(String value) {
        this.findType = value;
    }

    /**
     * Recupera il valore della proprietÓ idComunenascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdComunenascita() {
        return idComunenascita;
    }

    /**
     * Imposta il valore della proprietÓ idComunenascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdComunenascita(String value) {
        this.idComunenascita = value;
    }

    /**
     * Recupera il valore della proprietÓ idStatonascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStatonascita() {
        return idStatonascita;
    }

    /**
     * Imposta il valore della proprietÓ idStatonascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStatonascita(String value) {
        this.idStatonascita = value;
    }

    /**
     * Recupera il valore della proprietÓ indirizzoResidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    /**
     * Imposta il valore della proprietÓ indirizzoResidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzoResidenza(String value) {
        this.indirizzoResidenza = value;
    }

    /**
     * Recupera il valore della proprietÓ nazionenasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazionenasc() {
        return nazionenasc;
    }

    /**
     * Imposta il valore della proprietÓ nazionenasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazionenasc(String value) {
        this.nazionenasc = value;
    }

    /**
     * Recupera il valore della proprietÓ nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietÓ nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietÓ provinciaResidenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaResidenza() {
        return provinciaResidenza;
    }

    /**
     * Imposta il valore della proprietÓ provinciaResidenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaResidenza(String value) {
        this.provinciaResidenza = value;
    }

    /**
     * Recupera il valore della proprietÓ provincianasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincianasc() {
        return provincianasc;
    }

    /**
     * Imposta il valore della proprietÓ provincianasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincianasc(String value) {
        this.provincianasc = value;
    }

    /**
     * Recupera il valore della proprietÓ provnasc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvnasc() {
        return provnasc;
    }

    /**
     * Imposta il valore della proprietÓ provnasc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvnasc(String value) {
        this.provnasc = value;
    }

    /**
     * Recupera il valore della proprietÓ sceltaInDeroga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSceltaInDeroga() {
        return sceltaInDeroga;
    }

    /**
     * Imposta il valore della proprietÓ sceltaInDeroga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSceltaInDeroga(String value) {
        this.sceltaInDeroga = value;
    }

    /**
     * Recupera il valore della proprietÓ sesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietÓ sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesso(String value) {
        this.sesso = value;
    }

	public String getPrivacy() {
		return privacy;
	}

	public void setPrivacy(String value) {
		this.privacy = value;
	}
}
