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
@Table(name = "GL_PL_DET")
@IdClass(GlPlDetailCompKey.class)
public class GlPlDetail {
	@Id
	@Column(name="PL_CODE",length=20,  nullable = false)
	private String glPlDtlCode;
	
	@Id
	@Column(name="PLD_ACC", length=20,nullable = false)
	private String glPlDtlAcc;
	
	@Column(name="PLD_AC_TYPE", length=10,nullable = false)
	private String glPlDtlType;
	
	@Column(name="PLD_STATUS",length=2,  nullable = false)
	private String glPlDtlStatus;
	
	 @Column(name="AC_USER_CRE",length=20)
	 private String fmFPosUserCrea;
	 
	 @Column(name="AC_DATE_CRE")
	 private Date fmFPosDateCrea;
	 
	 @Column(name="AC_USER_UPD",length=20)
	 private String fmFPosUserUpd;
	 
	 @Column(name="AC_DATE_UPD")
	 private Date fmFPosDateUpd;

}
