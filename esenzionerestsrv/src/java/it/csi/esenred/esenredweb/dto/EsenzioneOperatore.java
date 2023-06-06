/*******************************************************************************
* Copyright Regione Piemonte - 2022
* SPDX-License-Identifier: EUPL-1.2
******************************************************************************/
package it.csi.esenred.esenredweb.dto;

import it.csi.esenred.esenredweb.business.entity.EsenredTEsenzioniReddito;

public class EsenzioneOperatore extends EsenzioneCittadino implements Comparable<EsenzioneOperatore>{
	
	private String nomeRichiedente;
	
	private String cognomeRichiedente;
	
	private String codFiscaleRichiedente;
	
	private String codSessoRichiedente;
	
	private String dataNascitaRichiedente;
	
	private int numeroTotaleElementi;
	
	private String comuneNascitaRichiedente;
	
	private String provinciaNascitaRichiedente;
	
	private String nota;

	public String getNomeRichiedente() {
		return nomeRichiedente;
	}

	public void setNomeRichiedente(String nomeRichiedente) {
		this.nomeRichiedente = nomeRichiedente;
	}
	
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getCognomeRichiedente() {
		return cognomeRichiedente;
	}

	public void setCognomeRichiedente(String cognomeRichiedente) {
		this.cognomeRichiedente = cognomeRichiedente;
	}

	public String getCodFiscaleRichiedente() {
		return codFiscaleRichiedente;
	}

	public void setCodFiscaleRichiedente(String codFiscaleRichiedente) {
		this.codFiscaleRichiedente = codFiscaleRichiedente;
	}

	public String getCodSessoRichiedente() {
		return codSessoRichiedente;
	}

	public void setCodSessoRichiedente(String codSessoRichiedente) {
		this.codSessoRichiedente = codSessoRichiedente;
	}

	public String getDataNascitaRichiedente() {
		return dataNascitaRichiedente;
	}

	public void setDataNascitaRichiedente(String dataNascitaRichiedente) {
		this.dataNascitaRichiedente = dataNascitaRichiedente;
	}

	public String getComuneNascitaRichiedente() {
		return comuneNascitaRichiedente;
	}

	public void setComuneNascitaRichiedente(String comuneNascitaRichiedente) {
		this.comuneNascitaRichiedente = comuneNascitaRichiedente;
	}

	public String getProvinciaNascitaRichiedente() {
		return provinciaNascitaRichiedente;
	}

	public void setProvinciaNascitaRichiedente(String provinciaNascitaRichiedente) {
		this.provinciaNascitaRichiedente = provinciaNascitaRichiedente;
	}
	
	public EsenzioneOperatore(EsenredTEsenzioniReddito esenred, Cittadino beneficiario, Cittadino dichiarante) {
		this(esenred, beneficiario, dichiarante, null);
	}	

	public EsenzioneOperatore(EsenredTEsenzioniReddito esenred, Cittadino beneficiario,  Cittadino titolare, Cittadino dichiarante) {
		super(esenred, beneficiario,titolare,dichiarante);
		
		this.codFiscaleRichiedente = dichiarante.getCodFiscale();
		this.cognomeRichiedente = dichiarante.getCognome();
		this.nomeRichiedente = dichiarante.getNome();
		this.codSessoRichiedente = dichiarante.getCodSesso();
		this.dataNascitaRichiedente = dichiarante.getDataNascita();
		this.comuneNascitaRichiedente = dichiarante.getCodComuneNascita();
		this.provinciaNascitaRichiedente = dichiarante.getProvinciaNascita();
		this.nota = esenred.getNota();
	}
	
	public EsenzioneOperatore(int numTotElementi) {
		this.numeroTotaleElementi = numTotElementi;
	}

	public int getNumeroTotaleElementi() {
		return numeroTotaleElementi;
	}

	public void setNumeroTotaleElementi(int numeroTotaleElementi) {
		this.numeroTotaleElementi = numeroTotaleElementi;
	}

	@Override
	public int compareTo(EsenzioneOperatore o) {
		return (this.getCognomeBeneficiario()+" "+this.getNomeBeneficiario()).compareTo(o.getCognomeBeneficiario()+" "+o.getNomeBeneficiario());
	}
	
	
}