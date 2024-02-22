package com.HibernateRelation.HibernateRelation.Entity;



import com.fasterxml.jackson.annotation.JsonBackReference;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class AuthorAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int pincode;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="author_id", nullable = false)
	 @JsonBackReference
	private AuthorEntity author;

}



//@Entity
//@Data
//public class AuthorAddress {
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private int addressid;
//private int doornum;
//private String area;
//private String city;
//private int pincode;
//
//@OneToOne(fetch = FetchType.EAGER)
//@JoinColumn(name="author_id", nullable = false)
//@JsonBackReference
//private AuthorEntity entity;
//}
