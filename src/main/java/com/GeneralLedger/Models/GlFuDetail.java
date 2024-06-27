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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GL_FU_DET")
@IdClass(GlFuDetailCompKey.class)
public class GlFuDetail {
	
	@Id
	@Column (name="FU_SEQ", nullable = false)
	private Integer glFuSeqMstDet;

	@Column (name="FU_CODE", length=20)
	private String glFuCodeDet;
	
	@Id
	@Column (name="FUD_SEQ_DET", nullable = false)
	private Integer glFuSeqDet;
	
	@Column (name="FUD_ACC_BEG", length=20)
	private String glFuAccBegDet;
	
	@Column (name="FUD_ACC_END", length=20)
	private String glFuAccEndDet;
	
	@Column (name="FUD_STATUS", length=2)
	private String glFuStsDet;
	
	@Column (name="AC_USER_CRE", length=20)
	private String glFuUserCreDet;
	
	@Column (name="AC_DATE_CRE")
	private Date glFuDateCreDet;	
	
	@Column (name="AC_USER_UPD", length=20)
	private String glFuUserUpdDet;

	@Column (name="AC_DATE_UPD")
	private Date glFuDateUpdDet;

}
