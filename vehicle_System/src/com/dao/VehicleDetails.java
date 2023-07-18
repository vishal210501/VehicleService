package com.dao;


public interface VehicleDetails {
	
	public void addVehicle()throws VException;
	public void removeVehicle()throws VException;
	public void displayAllVehicle();
	public void searchByMake();
	public void searchByModel();
	public void searchByType();
	public void addServiceRecord()throws VException;
	public void displayServiceHistory();

	
	

}
