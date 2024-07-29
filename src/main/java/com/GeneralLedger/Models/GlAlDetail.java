package com.GeneralLedger.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GL_AL_DET")
@IdClass(GlAlDetailCompKey.class)

public class GlAlDetail {
	
	@Id
	@Column (name="AL_CODE", length=20, nullable = false)
	private String glAlDtlCode;
	
	@Id
	@Column (name="ALD_SEQ", nullable = false)
	private BigDecimal glAlDtlSeqNo;
	
	@Column (name="ALD_ENT", length=20)
	private String glAlDtlEnt;	
	
	@Column (name="ALD_OFF", length=20)
	private String glAlDtlOff;
	
	@Column (name="ALD_ACC", length=20)
	private String glAlDtlAcc;
	
	@Column (name="ALD_SUB", length=20)
	private String glAlDtlSub;
	
	@Column (name="ALD_CC", length=20)
	private String glAlDtlCc;
	
	@Column (name="ALD_PL", length=20)
	private String glAlDtlPl;
	
	@Column (name="ALD_PJ", length=20)
	private String glAlDtlPj;
	
	@Column (name="ALD_FU1", length=20)
	private String glAlDtlFu1;
	
	@Column (name="ALD_FU2", length=20)
	private String glAlDtlFu2;
	
	@Column (name="ALD_FU3", length=20)
	private String glAlDtlFu3;
	
	@Column (name="ALD_FU4", length=20)
	private String glAlDtlFu4;
	
	@Column (name="ALD_FU5", length=20)
	private String glAlDtlFu5;
	
	@Column (name="ALD_PCT_AMT")
	private BigDecimal glAlDtlPctAmt;
	
	@Column (name="ALD_STATUS", length=2)
	private String glAlDtlStatus;
	
	@Column (name="AC_USER_CRE", length=15)
	private String glAlDtlUserCre;
	
	@Column (name="AC_DATE_CRE")
	private Date glAlDtlDateCre;	
	
	@Column (name="AC_USER_UPD", length=15)
	private String glAlDtlUserUpd;

	@Column (name="AC_DATE_UPD")
	private Date glAlDtlDateUpd;	

}
