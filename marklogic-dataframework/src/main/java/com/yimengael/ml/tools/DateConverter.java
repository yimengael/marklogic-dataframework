package com.yimengael.ml.tools;

import java.util.Date;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.yimengael.ml.exceptions.TechnicalException;

public class DateConverter implements com.thoughtworks.xstream.converters.Converter {
	
	private static final Logger LOGGER = Logger.getLogger(DateConverter.class);

	@Override
	public boolean canConvert(@SuppressWarnings("rawtypes") Class clazz) {
		return Date.class.isAssignableFrom(clazz);
	}

	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		Date oldDate = (Date) source;
		String newDate = "";
		LOGGER.debug("Received Date : " + source);
		
		try {
			newDate = Utils.toMarkLogicDateFormat(oldDate);
		} catch (TechnicalException e) {
			e.printStackTrace();
		}
		writer.setValue(newDate);
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Date vDate = null;
		
		try {
			vDate = Utils.parseDate(reader.getValue());
		} catch (TechnicalException e) {
			LOGGER.error("Utils.parseDate", e);
		}
		return vDate;
	}

}
