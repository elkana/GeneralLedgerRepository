package Models;

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
@Table(name = "GL_AC_MSTR")
public class GlAcMaster {
	
	@Id
	@Column(name="AC_CODE",length=20,  nullable = false)
	private String glamaccode;
	
	@Column(name="AC_DESC",length=50)
	private String glamacdesc;
	
	@Column(name="AC_DESC2",length=50)
	private String glamacdesc2;
	
	@Column(name="AC_FPOS",length=20)
	private String glamacfpos;
	
	@Column(name="AC_GROUP",length=20)
	private String glamacgroup;
	
	@Column(name="AC_TYPE",length=10)
	private String glamactype;
	
	@Column(name="AC_ENT",length=20)
	private String glamacent;
	
	@Column(name="AC_OFF",length=20)
	private String glamacoff;
	
	@Column(name="AC_ACC",length=20)
	private String glamacacc;
	
	@Column(name="AC_SUB",length=20)
	private String glamacsub;
	
	@Column(name="AC_CC",length=20)
	private String glamaccc;
	
	@Column(name="AC_PL",length=20)
	private String glamacpl;
	
	@Column(name="AC_PJ",length=20)
	private String glamacpj;
	
	@Column(name="AC_FU1",length=20)
	private String glamacfu1;
	
	@Column(name="AC_FU2",length=20)
	private String glamacfu2;
	
	@Column(name="AC_FU3",length=20)
	private String glamacfu3;
	
	@Column(name="AC_FU4",length=20)
	private String glamacfu4;
	
	@Column(name="AC_FU5",length=20)
	private String glamacfu5;
	
	@Column(name="AC_STATUS",length=2)
	private String glamacstatus;
	
	@Column(name="AC_USER_CRE",length=15)
	private String glamacusercre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glamacdatecre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glamacuserupd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glamacdateupd;

}
