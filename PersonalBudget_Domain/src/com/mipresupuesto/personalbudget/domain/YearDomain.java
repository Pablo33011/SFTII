package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

public final class YearDomain {
	
	private  UUID id;
	private  int year;
	
	private YearDomain( final String id, final int year) {
		setId(id);
		setYear(year);
		
	}
	
	public static YearDomain create(final UUID id, final int year) {
		return new YearDomain(UUID, year);
		
	}

	public final String getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}

	private final void setId(final String id) {
		this.id = (id == null) ? UUID.randomUUID() : id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

}
