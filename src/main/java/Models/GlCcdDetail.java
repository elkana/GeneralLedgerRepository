package Models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GL_CCD_DET")
@IdClass(GlCcdDetailCompKey.class)
public class GlCcdDetail {
	@Id
	@Column(name="CC_CODE",length=20,  nullable = false)
	private String glCcDtlCode;
	
	@Id
	@Column(name="CCD_SEQ",nullable = false)
	private Integer glCcDtlSeqNo;
	
	@Column(name="CCD_ACC_BEG",length=20)
	private String glCcDtlBeg;
	
	@Column(name="CCD_ACC_END",length=20)
	private String glCcDtlEnd;
	
	@Column(name="PJD_STATUS",length=2,  nullable = false)
	private String glCcDtlStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}
