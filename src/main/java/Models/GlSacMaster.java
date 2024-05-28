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
@Table(name = "GL_SAC_MSTR")
public class GlSacMaster {
	
	@Id
	@Column(name="SAC_CODE",length=20,  nullable = false)
	private String glsmsacacc;
	
	@Column(name="SAC_SUB",length=20)
	private String glsmsacsub;
	
	@Column(name="ASC_DESC",length=50)
	private String glsmascdesc;
	
	@Column(name="AC_STATUS",length=2)
	private String glsmacstatus;
	
	@Column(name="AC_USER_CRE",length=15)
	private String glsmacusercre;
	 
	@Column(name="AC_DATE_CRE")
	private Date glsmacdatecre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String glsmacuserupd;
	 
	@Column(name="AC_DATE_UPD")
	private Date glsmacdateupd;
	
	@Column(name="ASC_STATUS",length=2)
	private String glsmascstatus;

}
