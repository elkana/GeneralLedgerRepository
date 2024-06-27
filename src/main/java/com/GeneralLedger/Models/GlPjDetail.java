package com.GeneralLedger.Models;

import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "GL_PJ_DET")
@IdClass(GlPjDetailCompKey.class)
public class GlPjDetail {
	@Id
	@Column(name="PJ_CODE",length=20,  nullable = false)
	private String glPjDtlCode;
	
	@Id
	@Column(name="PJD_SEQ",nullable = false)
	private Integer glPjDtlSeqNo;
	
	@Column(name="PJD_ACC_BEG",length=20)
	private String glPjDtlBeg;
	
	@Column(name="PJD_ACC_END",length=20)
	private String glPjDtlEnd;
	
	@Column(name="PJD_STATUS",length=2,  nullable = false)
	private String glPjDtlStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String glPjDtlUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date glPjDtlDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String glPjDtlUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date glPjDtlDateUpd;

}
