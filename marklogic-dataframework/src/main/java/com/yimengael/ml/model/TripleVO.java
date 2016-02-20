package com.yimengael.ml.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class TripleVO {
	
	@XStreamAlias("sem:subject")
	private String subject;
	
	@XStreamAlias("sem:predicate")
	private String predicate;
	
	@XStreamAlias("sem:object")
	private String object;
	
	/**
	 * 
	 * @param subject
	 * @param predicate
	 * @param object
	 */
	public TripleVO(String subject, String predicate, String object) {
		super();
		this.subject = subject;
		this.predicate = predicate;
		this.object = object;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPredicate() {
		return predicate;
	}
	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	
}
