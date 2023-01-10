package com.msclient.Client.Dtos;

public class KpiDto {

	double average;
	double standardDeviation;
	
	public KpiDto() {
		super();
	}
	public KpiDto(double average, double standardDeviation) {
		super();
		this.average = average;
		this.standardDeviation = standardDeviation;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getStandardDeviation() {
		return standardDeviation;
	}
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	
	
}
