package com.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="messages")
public class messageVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn
	private RegistrationVO from;
	@ManyToOne
	@JoinColumn
	private RegistrationVO to;
	@Column
	private String message;
	@Column
	private Date date;
	@Column
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RegistrationVO getFrom() {
		return from;
	}
	public void setFrom(RegistrationVO from) {
		this.from = from;
	}
	public RegistrationVO getTo() {
		return to;
	}
	public void setTo(RegistrationVO to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
