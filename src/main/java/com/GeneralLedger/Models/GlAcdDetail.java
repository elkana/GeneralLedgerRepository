package com.GeneralLedger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_ACD_DET")
@IdClass(GlAcdDetailCompKey.class)
public class GlAcdDetail {
	
	@Id
	@Column(name="GL_YEAR", nullable = false)
	private Integer GlAcdDtlYear;
	
	@Id
	@Column(name="GL_MONTH", nullable = false)
	private Integer GlAcdDtlMonth;
	
	@Id
	@Column(name="AC_ACC", length=20, nullable = false)
	private String GlAcdDtlAcc;
	
	@Id
	@Column(name="AC_SUB", length=20, nullable = false)
	private String GlAcdDtlSub;	
	
	@Column(name="GL_CURR", length=10, nullable = false)
	private String GlAcdDtlCurr;
	
	@Column(name="AC_ENT", length=20, nullable = false)
	private String GlAcdDtlEnt;
	
	@Column(name="AC_OFF", length=20, nullable = false)
	private String GlAcdDtlOff;
	
	@Column(name="AC_CC", length=20, nullable = false)
	private String GlAcdDtlCc;
	
	@Column(name="AC_PL", length=20, nullable = false)
	private String GlAcdDtlPl;
	
	@Column(name="AC_PJ", length=20, nullable = false)
	private String GlAcdDtlPj;
	
	@Column(name="AC_FU1", length=20, nullable = false)
	private String GlAcdDtlFu1;
	
	@Column(name="AC_FU2", length=20, nullable = false)
	private String GlAcdDtlFu2;
	
	@Column(name="AC_FU3", length=20, nullable = false)
	private String GlAcdDtlFu3;
	
	@Column(name="AC_FU4", length=20, nullable = false)
	private String GlAcdDtlFu4;
	
	@Column(name="AC_FU5", length=20, nullable = false)
	private String GlAcdDtlFu5;
	
	@Column(name="GL_CUR_AMT_DB")
	private BigDecimal GlAcdDtlCurrAmtDb;
	
	@Column(name="GL_CUR_AMT_CR")
	private BigDecimal GlAcdDtlCurrAmtCr;
	
	@Column(name="GL_AMT_DB")
	private BigDecimal GlAcdDtlAmtDb;
	
	@Column(name="GL_AMT_CR")
	private BigDecimal GlAcdDtlAmtCr;

	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
	   
}
