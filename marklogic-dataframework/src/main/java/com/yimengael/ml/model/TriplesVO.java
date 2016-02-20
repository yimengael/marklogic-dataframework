package com.yimengael.ml.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class TriplesVO {

	@XStreamImplicit(itemFieldName="triple")
	private List<TripleVO> listOfTriples = new ArrayList<TripleVO>();

	public TriplesVO() {
	}

	public List<TripleVO> getListOfTriples() {
		return listOfTriples;
	}

	public void setListOfTriples(List<TripleVO> listOfTriples) {
		this.listOfTriples = listOfTriples;
	}

	public void removeAllTriples() {
		this.listOfTriples = new ArrayList<TripleVO>();
	}
}
