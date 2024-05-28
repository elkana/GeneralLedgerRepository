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
	private String ac_code;
	
	@Column(name="AC_DESC",length=50)
	private String ac_desc;
	
	@Column(name="AC_DESC2",length=50)
	private String ac_desc2;
	
	@Column(name="AC_FPOS",length=20)
	private String ac_fpos;
	
	@Column(name="AC_GROUP",length=20)
	private String ac_group;
	
	@Column(name="AC_TYPE",length=10)
	private String ac_type;
	
	@Column(name="AC_ENT",length=20)
	private String ac_ent;
	
	@Column(name="AC_OFF",length=20)
	private String ac_off;
	
	@Column(name="AC_ACC",length=20)
	private String ac_acc;
	
	@Column(name="AC_SUB",length=20)
	private String ac_sub;
	
	@Column(name="AC_CC",length=20)
	private String ac_cc;
	
	@Column(name="AC_PL",length=20)
	private String ac_pl;
	
	@Column(name="AC_PJ",length=20)
	private String ac_pj;
	
	@Column(name="AC_FU1",length=20)
	private String ac_fu1;
	
	@Column(name="AC_FU2",length=20)
	private String ac_fu2;
	
	@Column(name="AC_FU3",length=20)
	private String ac_fu3;
	
	@Column(name="AC_FU4",length=20)
	private String ac_fu4;
	
	@Column(name="AC_FU5",length=20)
	private String ac_fu5;
	
	@Column(name="AC_STATUS",length=2)
	private String ac_status;
	
	@Column(name="AC_USER_CRE",length=15)
	private String ac_user_cre;
	 
	@Column(name="AC_DATE_CRE")
	private Date ac_date_cre;
	 
	@Column(name="AC_USER_UPD",length=15)
	private String ac_user_upd;
	 
	@Column(name="AC_DATE_UPD")
	private Date ac_date_upd;

}
