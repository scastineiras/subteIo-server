package model;

import java.util.List;

public class SubwayStation {

	private Long id_station;
	private String station_name;
	private Long id_line;
	private String line_name;
	private Double lon;
	private Double lat;
	private String address;
	private Boolean elevador;
	private Boolean escalator;
	private Boolean toilets;
	private Boolean consultation;
	private Boolean wifi;
	private String bus_lines;
	
	
	
	
	public Long getId_station() {
		return id_station;
	}
	public void setId_station(Long id_station) {
		this.id_station = id_station;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public Long getId_line() {
		return id_line;
	}
	public void setId_line(Long id_line) {
		this.id_line = id_line;
	}
	public String getLine_name() {
		return line_name;
	}
	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getElevador() {
		return elevador;
	}
	public void setElevador(Boolean elevador) {
		this.elevador = elevador;
	}
	public Boolean getEscalator() {
		return escalator;
	}
	public void setEscalator(Boolean escalator) {
		this.escalator = escalator;
	}
	public Boolean getToilets() {
		return toilets;
	}
	public void setToilets(Boolean toilets) {
		this.toilets = toilets;
	}
	public Boolean getConsultation() {
		return consultation;
	}
	public void setConsultation(Boolean consultation) {
		this.consultation = consultation;
	}
	public Boolean getWifi() {
		return wifi;
	}
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	public String getBus_lines() {
		return bus_lines;
	}
	public void setBus_lines(String bus_lines) {
		this.bus_lines = bus_lines;
	}
	
	
	
}
