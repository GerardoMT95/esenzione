/*******************************************************************************
* Copyright Regione Piemonte - 2022
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/

package it.csi.esenred.esenredweb.business.aura.get;

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
@WebService(name = "AnagrafeSanitariaNewSoap", targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnagrafeSanitariaNewSoap {


    /**
     * 
     * @param aurAid
     * @return
     *     returns it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraNewMsg
     */
    @WebMethod(operationName = "GetProfiloSanitarioNew", action = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it/AURA.WS.AnagrafeSanitariaNew.GetProfiloSanitarioNew")
    @WebResult(name = "GetProfiloSanitarioNewResult", targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it")
    @RequestWrapper(localName = "GetProfiloSanitarioNew", targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it", className = "it.csi.aura.auraws.services.central.anagrafesanitaria.GetProfiloSanitarioNew")
    @ResponseWrapper(localName = "GetProfiloSanitarioNewResponse", targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it", className = "it.csi.aura.auraws.services.central.anagrafesanitaria.GetProfiloSanitarioNewResponse")
    public SoggettoAuraNewMsg getProfiloSanitarioNew(
        @WebParam(name = "AURAid", targetNamespace = "http://AnagrafeSanitaria.central.services.auraws.aura.csi.it")
        String aurAid);

}