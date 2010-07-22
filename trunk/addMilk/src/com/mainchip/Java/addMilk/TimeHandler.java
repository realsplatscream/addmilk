/*
 * TimeHandler.java
 *
 * Version:
 *     $Id$
 *
 * Revisions:
 *     $Log$
 */

package com.mainchip.Java.addMilk;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * A SAX Handler for parsing responses to Time methods of the Remember the Milk API.
 * 
 * @author Dustin Stroup
 */
public class TimeHandler extends DefaultHandler{
	private StringBuilder _builder;
	private Time _time;
	private MilkError _error;

	/**
	 * Returns a Time object containing a timestamp.
	 *
	 * @return		A Time object containing a timestamp.
	 */
	Time getTime(){
		return _time;
	}	
	
	/**
	 * Returns the error code and message provided by RTM, if any.
	 * 
	 * @return		If an error was reported by RTM, this returns a MilkError object with the details.  Otherwise, returns null.
	 */
	MilkError getError(){
		return _error;
	}
	
    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        _builder.append(ch, start, length);
    }

	
	@Override
	public void startDocument(){
		_builder = new StringBuilder();
	}
	
    @Override
    public void startElement(String uri, String localName, String name, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, name, attributes);

        if (name.equals("err")){
			_error = new MilkError(attributes.getValue("code"), attributes.getValue("msg"));
		}else if(name.equals("time")){
        	_time = new Time(attributes.getValue("precision"), attributes.getValue("timezone"));
        }
    }
	
	@Override
	public void endElement(String uri, String localName, String name) throws SAXException{
		super.endElement(uri, localName, name);

		if(name.equals("time")){
			_time.setTime(_builder.toString());
		}

		_builder.setLength(0);
	}
}