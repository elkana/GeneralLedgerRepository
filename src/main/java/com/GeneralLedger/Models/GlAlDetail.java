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
	private String glAlCodeMstDet;
	
	@Id
	@Column (name="ALD_SEQ", nullable = false)
	private BigDecimal glAldSeqDet;
	
	@Column (name="ALD_ENT", length=20)
	private String glAldEntDet;	
	
	@Column (name="ALD_OFF", length=20)
	private String glAldOffDet;
	
	@Column (name="ALD_ACC", length=20)
	private String glAldAccDet;
	
	@Column (name="ALD_SUB", length=20)
	private String glAldSubDet;
	
	@Column (name="ALD_CC", length=20)
	private String glAldCcDet;
	
	@Column (name="ALD_PL", length=20)
	private String glAldPlDet;
	
	@Column (name="ALD_PJ", length=20)
	private String glAldPjDet;
	
	@Column (name="ALD_FU1", length=20)
	private String glAldFu1Det;
	
	@Column (name="ALD_FU2", length=20)
	private String glAldFu2Det;
	
	@Column (name="ALD_FU3", length=20)
	private String glAldFu3Det;
	
	@Column (name="ALD_FU4", length=20)
	private String glAldFu4Det;
	
	@Column (name="ALD_FU5", length=20)
	private String glAldFu5Det;
	
	@Column (name="ALD_PCT_AMT")
	private BigDecimal glAldPctAmtDet;
	
	@Column (name="ALD_STATUS", length=2)
	private String glAldStsDet;
	
	@Column (name="AC_USER_CRE", length=15)
	private String glAcCreUserDet;
	
	@Column (name="AC_DATE_CRE")
	private Date glAlCreDateDet;	
	
	@Column (name="AC_USER_UPD", length=15)
	private String glAlUpdUserDet;

	@Column (name="AC_DATE_UPD")
	private Date glAlUpdDateDet;	

}
