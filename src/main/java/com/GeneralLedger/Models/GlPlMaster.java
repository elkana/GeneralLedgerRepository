package com.GeneralLedger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_PL_MSTR")
public class GlPlMaster {
	@Id
	@Column(name="PL_CODE",length=20,  nullable = false)
	private String glPlCode;

	@Column(name="PL_DESC",length=50)
	private String glPlDesc;
	
	@Column(name="PL_STATUS",length=2)
	private String glPlStatus;
	
	@Column(name="AC_USER_CRE",length=15)
	private String glPlUserCre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glPlDateCre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glPlUserUpd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glPlDateUpd;
}
