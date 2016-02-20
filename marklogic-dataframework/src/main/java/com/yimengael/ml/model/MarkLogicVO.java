package com.yimengael.ml.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("systemStart")
public abstract class MarkLogicVO {

	@XStreamAlias("documentURI")
	@JsonIgnore
	private String documentURI;
	
	@XStreamAlias("sem:triples")
	@JsonIgnore
	private TriplesVO triples;
	
	@JsonIgnore
	public String getDocumentURI() {
		return documentURI;
	}
	
	@JsonIgnore
	public void setDocumentURI(String documentURI) {
		this.documentURI = documentURI;
	}
	
	@JsonIgnore
	public TriplesVO getTriples() {
		return triples;
	}
	
	@JsonIgnore
	public void setTriples(TriplesVO triples) {
		this.triples = triples;
	}
	
}
