package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.MarkLogicVO;

public interface IMarkLogicDao {
	
	public String write(MarkLogicVO pMarkLogicVO, String pCollection) throws TechnicalException;
	
	public void writeSet(MarkLogicVO[] pMarkLogicVOArray, String pCollection) throws TechnicalException;
	
	public MarkLogicVO getDocumentByURI(String pDocumentURI, String pCollection) throws TechnicalException;

}
