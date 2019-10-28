package com.deloitte.jgen.appinfo;

import java.util.List;
import java.util.Map;

public class ParentRowDataDTO {

	private static final long serialVersionUID = 1L;

	private Map<String, String> rowData;
	private List<String> childRowDataHeader;
	private List<Map<String, String>> childRowDataList;

	public Map<String, String> getRowData() {
		return rowData;
	}

	public void setRowData(Map<String, String> rowData) {
		this.rowData = rowData;
	}

	public List<String> getChildRowDataHeader() {
		return childRowDataHeader;
	}

	public void setChildRowDataHeader(List<String> childRowDataHeader) {
		this.childRowDataHeader = childRowDataHeader;
	}

	public List<Map<String, String>> getChildRowDataList() {
		return childRowDataList;
	}

	public void setChildRowDataList(List<Map<String, String>> childRowDataList) {
		this.childRowDataList = childRowDataList;
	}

}
