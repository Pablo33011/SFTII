package com.mipresupuesto.personalbudget.dto;

public final class YearDTO {
	
	private String id;
	private int year;
	
	public YearDTO() {
		setId("");
		setYear(0);
	}
	
	public YearDTO(String id, int year) {
		setId(id);
		setYear(year);
	
		this.id = id;
		this.year = year;
	}
	
	
	public final String getId() {
		if (id == null || "".equals(id.trim())) {
			setId("");
		}
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final int getYear() {
		
		if(year < 0) {
			setYear(0);
		}
		
		return year;
	}
	public final void setYear(int year) {
		this.year = year;
	}
	

}
