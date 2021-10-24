package com.dao;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name="address")
@Table(name="Address")
public class Address implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;
	private String addressLane1;
	private String addressLane2;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}

	public Address(String addressLane1, String addressLane2, String city, String state, String country) {
		super();
		this.addressLane1 = addressLane1;
		this.addressLane2 = addressLane2;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getAddressLane1() {
		return addressLane1;
	}

	public void setAddressLane1(String addressLane1) {
		this.addressLane1 = addressLane1;
	}

	public String getAddressLane2() {
		return addressLane2;
	}

	public void setAddressLane2(String addressLane2) {
		this.addressLane2 = addressLane2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressLane1=" + addressLane1 + ", addressLane2=" + addressLane2 + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
}
