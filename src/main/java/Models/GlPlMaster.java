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
@Table(name = "GL_PL_MSTR")
public class GlPlMaster {
	@Id
	@Column(name="PL_CODE",length=20,  nullable = false)
	private String glPlCode;

	@Column(name="PL_DESC",length=50,  nullable = false)
	private String glPlDesc;
	
	@Column(name="PL_STATUS",length=2,  nullable = false)
	private String glPlStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}
