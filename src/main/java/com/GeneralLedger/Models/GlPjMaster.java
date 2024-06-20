package com.GeneralLedger.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_PJ_MSTR")
public class GlPjMaster {
	
	@Id
	@Column(name="PJ_CODE",length=20,  nullable = false)
	private String glPjCode;
	
	@Column(name="PJ_DESC",length=50,  nullable = false)
	private String glPjDesc;
	
	@Column(name="PJ_START")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date glPjStart;
	
	@Column(name="PJ_END")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date glPjEnd;
	
	@Column(name="PJ_STATUS",length=2,  nullable = false)
	private String glPjStatus;
	
	@Column(name="AC_USER_CRE",length=20)
    private String glPjUserCrea;
	 
	@Column(name="AC_DATE_CRE")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date glPjDateCrea;
	 
	@Column(name="AC_USER_UPD",length=20)
	private String glPjUserUpd;
	 
	@Column(name="AC_DATE_UPD")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date glPjDateUpd;

}
