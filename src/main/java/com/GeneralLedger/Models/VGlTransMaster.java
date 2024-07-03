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
@Table(name = "V_GL_TRANS_MASTER")

public class VGlTransMaster {
	
	@Id
	@Column(name="VGTM_GL_REF",length=20,  nullable = false)
	private String vgtmRef;
	
	@Column(name="VGTM_GL_DATE")
	private Date vgtmDate;
	
	@Column(name="VGTM_EFF_DATE")
	private Date vgtmEffDate;
	
	@Column(name="VGTM_DOC_NO",length=20)
	private String vgtmDocNo;
	
	@Column(name="VGTM_DOC_TYPE",length=20)
	private String vgtmDocType;
	
	@Column(name="VGTM_CURR",length=10)
	private String vgtmCurr;
	
	@Column(name="VGTM_AL_CODE",length=20)
	private String vgtmAlCode;
	
	@Column(name="VGTM_REF_JOURNAL",length=20)
	private String vgtmRefJournal;
	
	@Column(name="VGTM_AMT_CREDIT")
	private BigDecimal vgtmAmtCredit;
	
	@Column(name="VGTM_AMT_DEBET")
	private BigDecimal vgtmAmtDebet;
		
	
}
