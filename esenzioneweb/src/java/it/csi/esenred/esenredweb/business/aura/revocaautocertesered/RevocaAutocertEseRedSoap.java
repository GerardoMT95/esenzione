/*******************************************************************************
* Copyright Regione Piemonte - 2022
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.esenred.esenredweb.business.aura.revocaautocertesered;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RevocaAutocertEseRedSoap", targetNamespace = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RevocaAutocertEseRedSoap {


    /**
     * 
     * @param newEseRed
     * @return
     *     returns it.csi.esenred.esenredweb.business.aura.revocaautocertesered.Response
     */
    @WebMethod(operationName = "RevocaAutocertEseRed", action = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it/AURA.WS.RevocaAutocertEseRed.RevocaAutocertEseRed")
    @WebResult(name = "RevocaAutocertEseRedResult", targetNamespace = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it")
    @RequestWrapper(localName = "RevocaAutocertEseRed", targetNamespace = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it", className = "it.csi.esenred.esenredweb.business.aura.revocaautocertesered.RevocaAutocertEseRed")
    @ResponseWrapper(localName = "RevocaAutocertEseRedResponse", targetNamespace = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it", className = "it.csi.esenred.esenredweb.business.aura.revocaautocertesered.RevocaAutocertEseRedResponse")
    public Response revocaAutocertEseRed(
        @WebParam(name = "newEseRed", targetNamespace = "http://RevocaAutocertEseRed.central.services.auraws.aura.csi.it")
        Request newEseRed);

}