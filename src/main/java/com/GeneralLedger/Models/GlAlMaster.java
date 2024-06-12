package com.GeneralLedger.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GL_AL_MSTR")

public class GlAlMaster {
	
	@Id
	@Column (name="AL_CODE", length=20, nullable = false)
	private String glAlCode;

	@Column (name="AL_DESC", length=50)
	private String glAlDesc;
	
	@Column (name="AL_STATUS", length=2)
	private String glAlStatus;
	
	@Column (name="AC_USER_CRE", length=15)
	private String glAlCreateUser;
	
	@Column (name="AC_DATE_CRE")
	private Date glAlCreateDate;	
	
	@Column (name="AC_USER_UPD", length=15)
	private String glAlUpdateUser;

	@Column (name="AC_DATE_UPD")
	private Date glAlUpdateDate;
	
}
