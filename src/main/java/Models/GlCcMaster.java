package Models;

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

	@Column(name="CC_DESC",length=50,  nullable = false)
	private String glCcDesc;
	
	@Column(name="CC_STATUS",length=2,  nullable = false)
	private String glCcStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}
