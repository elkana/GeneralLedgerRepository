package com.GeneralLedger.Models;

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
@Table(name = "GL_FM_MSTR")
public class GlFmMaster {
	
	@Id
	@Column(name="FM_FPOS",length=20,  nullable = false)
	private String glfmfmfpos;
	
	@Column(name="FM_DESC",length=50)
	private String glfmfmdesc;
	
	@Column(name="FM_TYPE",length=1)
	private String glfmfmtype;
	
	@Column(name="FM_LEVEL")
	private Integer glfmfmlevel;
	
	@Column(name="FM_SUM_INTO",length=20)
	private String glfmfmsuminto;
	
	@Column(name="FM_DB_CR",length=1)
	private String glfmfmdbcr;
	
	@Column(name="FM_HEADER",length=1)
	private String glfmfmheader;
	
	@Column(name="FM_NEW_PAGE",length=1)
	private String glfmfmnewpage;
	
	@Column(name="FM_TOTAL",length=1)
	private String glfmfmtotal;
	
	@Column(name="FM_UNDERLINE",length=1)
	private String glfmmunderline;
	
	@Column(name="FM_SKIP",length=1)
	private String glfmfmskip;
	
	@Column(name="AC_STATUS",length=2)
	private String glfmacstatus;
	
	@Column(name="AC_USER_CRE",length=15)
	private String glfmacusercre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glfmacdatecre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glfmacuserupd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glfmacdateupd;

}
