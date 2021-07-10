package com.shane.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="alba")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Alba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="al_id")
	String al_id;

	@Column(name="al_name")
	String al_name;

	@Column(name="al_age")
	int al_age;

	@Column(name="al_zip")
	String al_zip;

	@Column(name="al_addr1")
	String al_addr1;

	@Column(name="al_addr2")
	String al_addr2;

	@Column(name="al_hp")
	String al_hp;

	@Column(name="gr_code")
	String gr_code;

	@Column(name="al_gen")
	String al_gen;

	@Column(name="al_mail")
	String al_mail;

	@Column(name="al_career")
	String al_career;

	@Column(name="al_spec")
	String al_spec;

	@Column(name="al_desc")
	String al_desc;

	@Column(name="al_img")
	String al_img;

}
