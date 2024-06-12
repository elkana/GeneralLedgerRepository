package com.GeneralLedger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_CC_MSTR")
public class GlCcMaster {
	@Id
	@Column(name="CC_CODE",length=20,  nullable = false)
	private String glCcCode;

	@Column(name="CC_DESC",length=50)
	private String glCcDesc;
	
	@Column(name="CC_STATUS",length=2)
	private String glCcStatus;
	
	 @Column(name="AC_USER_CRE",length=15)
	 private String glCcUserCre;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date glCcDateCre;
	 
	 @Column(name="AC_USER_UPD",length=15)
	 private String glCcUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date glCcDateUpd;
}
