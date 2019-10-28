package com.deloitte.jgen.appinfo;

import java.util.Map;

public class TypeOfElement {
	// Label, Textbox, TextArea, Radio Button, Checkbox, Button,
	// Grid, Dropdown Single Select, Dropdown Multi Select
	String type;
	String defaultValue;
	String[] validations;
	String source; // Hard Coded, From Back end
	String data; // source is backend, then use this field to store REST URL
	Map<String, String> values;
	GridDetails gridDetails;

}
