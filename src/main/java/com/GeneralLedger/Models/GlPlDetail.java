package com.GeneralLedger.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_PL_DET")
@IdClass(GlPlDetailCompKey.class)
public class GlPlDetail {
	@Id
	@Column(name="PL_CODE",length=20,  nullable = false)
	private String glPlDtlCode;
	
	@Id
	@Column(name="PLD_AC_TYPE", length=10, nullable = false)
	private String glPlDtlType;
	
	@Id
	@Column(name="PLD_ACC", length=20, nullable =  false)
	private String glPlDtlAcc;
	
	@Column(name="PLD_STATUS",length=2)
	private String glPlDtlStatus;
	
	@Column(name="AC_USER_CRE",length=15)
	private String glPlDtlUserCre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glPlDtlDateCre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glPlDtlUserUpd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glPlDtlDateUpd;
}
