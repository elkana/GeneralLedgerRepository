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
@Table(name = "GL_ACD_RPT")
@IdClass(GlAcdReportCompKey.class)

public class GlAcdReport {
	@Id
	@Column(name="GL_YEAR", nullable = false)
	private Integer GlAcdRptYear;
	
	@Id
	@Column(name="GL_MONTH", nullable = false)
	private Integer GlAcdRptMonth;
	
	@Id
	@Column(name="AC_ACC", length=20, nullable = false)
	private String GlAcdRptAcc;
	
	@Id
	@Column(name="AC_SUB", length=20, nullable = false)
	private String GlAcdRptSub;
	
	@Column(name="GL_CURR", length=10, nullable = false)
	private String GlAcdRptCurr;
	
	@Column(name="AC_ENT", length=20, nullable = false)
	private String GlAcdRptEnt;
	
	@Column(name="AC_OFF", length=20, nullable = false)
	private String GlAcdRptOff;
	
	
	@Column(name="GL_AMT_DB")
	private BigDecimal GlAcdRptAmtDb;
	
	@Column(name="GL_AMT_CR")
	private BigDecimal GlAcdRptAmtCr;
	
	@Column(name="GL_AMT_DB_BEG")
	private BigDecimal GlAcdRptAmtDbBeg;
	
	@Column(name="GL_AMT_CR_BEG")
	private BigDecimal GlAcdRptAmtCrBeg;
	
	@Column(name="GL_CUR_AMT_DB")
	private BigDecimal GlAcdRptCurrAmtDb;
	
	@Column(name="GL_CUR_AMT_CR")
	private BigDecimal GlAcdRptCurrAmtCr;
	
	@Column(name="GL_CUR_AMT_DB_BEG")
	private BigDecimal GlAcdRptCurrAmtDbBeg;
	
	@Column(name="GL_CUR_AMT_CR_BEG")
	private BigDecimal GlAcdRptCurrAmtCrBeg;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;



}
