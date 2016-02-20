package com.yimengael.ml.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.yimengael.ml.tools.Utils;

@XStreamAlias("temporal")
public class BiTemporalVO extends MarkLogicVO {
	
	@XStreamAlias("systemStart")
	@JsonIgnore
	private String systemStart = "";
	
	@XStreamAlias("systemEnd")
	@JsonIgnore
	private String systemEnd = "";
	
	@XStreamAlias("validStart")
	@JsonIgnore
	private Date validStart = Utils.getTodayDate();
	
	@XStreamAlias("validEnd")
	@JsonIgnore
	private Date validEnd = Utils.infinitedate;
	
	@JsonIgnore
	public String getSystemStart() {
		return systemStart;
	}
	
	@JsonIgnore
	public void setSystemStart(String systemStart) {
		this.systemStart = systemStart;
	}
	
	@JsonIgnore
	public String getSystemEnd() {
		return systemEnd;
	}
	
	@JsonIgnore
	public void setSystemEnd(String systemEnd) {
		this.systemEnd = systemEnd;
	}
	
	@JsonIgnore
	public Date getValidStart() {
		return validStart;
	}
	
	@JsonIgnore
	public void setValidStart(Date validStart) {
		this.validStart = validStart;
	}
	
	@JsonIgnore
	public Date getValidEnd() {
		return validEnd;
	}
	
	@JsonIgnore
	public void setValidEnd(Date validEnd) {
		this.validEnd = validEnd;
	}
}
