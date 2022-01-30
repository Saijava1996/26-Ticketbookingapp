package com.info.inet.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ticket_db1")
public class Ticket {

	@Id
	@GeneratedValue
	@Column(name = "ticket_id")
	private Integer ticketId;

	@Column(name = "passenger_name", nullable = false)
	private String passengerName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	@Column(name = "booking_date")
	private Date bookingDate;

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "dest_station")
	private String destStation;

	@Column(name = "email")
	private String email;

	public Ticket(int i, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(Integer ticketId, String passengerName, Date bookingDate, String sourceStation, String destStation,
			String email) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.bookingDate = bookingDate;
		this.sourceStation = sourceStation;
		this.destStation = destStation;
		this.email = email;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
				+ ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
	}
}
