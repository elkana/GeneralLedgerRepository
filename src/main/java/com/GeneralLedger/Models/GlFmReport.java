package com.GeneralLedger.Models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_FM_RPT")
public class GlFmReport {
	
	@Id
	@Column(name="GL_ID")
	private BigDecimal glfmrptId;
	
	@Column(name="GL_YEAR")
	private BigDecimal glfmrptYear;
	
	@Column(name="GL_MONTH")
	private BigDecimal glfmrptMonth;
	
	@Column(name="GL_CURR",length=10)
	private String glfmrptCurr;
	
	@Column(name="AC_ENT",length=20)
	private String glfmrptEnt;
	
	@Column(name="AC_OFF",length=20)
	private String glfmrptOff;
	
	@Column(name="FM_FPOS",length=20)
	private String glfmrptFpos;
	
	@Column(name="GL_AMT_DB")
	private BigDecimal glfmrptAmtDb;
	
	@Column(name="GL_AMT_CR")
	private BigDecimal glfmrptAmtCr;
	
	@Column(name="GL_AMT_DB_BEG")
	private BigDecimal glfmrptAmtDbBeg;
	
	@Column(name="GL_AMT_CR_BEG")
	private BigDecimal glfmrptAmtCrBeg;
	
	@Column(name="GL_CUR_AMT_DB")
	private BigDecimal glfmrptCurAmtDb;
	
	@Column(name="GL_CUR_AMT_CR")
	private BigDecimal glfmrptCurAmtCr;
	
	@Column(name="GL_CUR_AMT_DB_BEG")
	private BigDecimal glfmrptCurAmtDbBeg;
	
	@Column(name="GL_CUR_AMT_CR_BEG")
	private BigDecimal glfmrptCurAmtCrBeg;

	@Column(name="AC_USER_CRE",length=15)
	private String glamacusercre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glamacdatecre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glamacuserupd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glamacdateupd;
}

