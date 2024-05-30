package Models;

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
@Table(name = "GL_GLT_DETAIL_HIST")
public class GlGltDtlHist {

	@Id
	@Column(name="GL_REF",length=20,  nullable = false)
	private String glGltDtlRef;
	
	@Column(name="GL_SEQ_NO",length=20,  nullable = false)
	private BigDecimal glDltDtlSeqNo;
	
	@Column(name="GL_DESC",length=50,  nullable = false)
	private String glGltDtlDesc;
	
	@Column(name="GL_DESC2",length=50)
	private String glGltDtlDesc2;
	
	@Column(name="GL_AD_CODE")
	private String glGltDtlAdCode;
	
	@Column(name="GL_DATE")
	private Date glGltDtlGlDate;
	
	@Column(name="GL_EFF_DATE")
	private Date glGltDtlEffDate;
	
	@Column(name="GL_DOC_NO",length=20)
	private String glGltDtlDocNo;
	
	@Column(name="GL_DOC_TYPE",length=20)
	private String glGltDtlDocType;
	
	@Column(name="GL_REF_JOURNAL",length=20)
	private String glGltDtlRefJournal;
	
	@Column(name="GL_AL_CODE",length=20)
	private String glGltDtlAlCode;
	
	@Column(name="GL_AL_AMT")
	private BigDecimal glGltDtlAlAmt;
	
	@Column(name="GL_AL_CURR",length=10)
	private String glGltDtlAlCurr;
	
	@Column(name="AC_ENT",length=20)
	private String glGltDtlAcEnt;
	
	@Column(name="AC_OFF",length=20)
	private String glGltDtlAcOff;
	
	@Column(name="AC_ACC",length=20)
	private String glGltDtlAcAcc;
	
	@Column(name="AC_SUB",length=20)
	private String glGltDtlAcSub;
	
	@Column(name="AC_CC",length=20)
	private String glGltDtlAcCC;
	
	@Column(name="AC_PL",length=20)
	private String glGltDtlAcPl;
	
	@Column(name="AC_PJ",length=20)
	private String glGltDtlAcPj;
	
	@Column(name="AC_FU1",length=20)
	private String glGltDtlAcFu1;
	
	@Column(name="AC_FU2",length=20)
	private String glGltDtlAcFu2;
	
	@Column(name="AC_FU3",length=20)
	private String glGltDtlAcFu3;
	
	@Column(name="AC_FU4",length=20)
	private String glGltDtlAcFu4;
	
	@Column(name="AC_FU5",length=20)
	private String glGltDtlAcFu5;
	
	@Column(name="GL_DB_CR",length=1)
	private String glGltDtlDbCr;
	
	@Column(name="GL_CURR_AMT")
	private BigDecimal glGltDtlCurrAmt;
	
	@Column(name="GL_CURR",length=10)
	private String glGltDtlCurr;
	
	@Column(name="GL_EXC_RATE")
	private BigDecimal glGltDtlExcRate;
	
	@Column(name="GL_AMT")
	private BigDecimal glGltDtlAmt;
	
	@Column(name="GL_BALANCE",length=2)
	private String glGltDtlBalance;
	
	@Column(name="GL_BATCH_NO",length=20)
	private String glGltDtlBatchNo;
	
	@Column(name="GL_BATCH_DATE",length=20)
	private String glGltDtlBatchdate;

	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;
}
