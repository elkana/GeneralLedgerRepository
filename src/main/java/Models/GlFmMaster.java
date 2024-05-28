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
@Table(name = "GL_FM_MSTR")
public class GlFmMaster {
	
	@Id
	@Column(name="FM_FPOS",length=20,  nullable = false)
	private String fm_fpos;
	
	@Column(name="FM_DESC",length=50)
	private String fm_desc;
	
	@Column(name="FM_TYPE",length=1)
	private String fm_type;
	
	@Column(name="FM_LEVEL")
	private Integer fm_level;
	
	@Column(name="FM_SUM_INTO",length=20)
	private String fm_sum_into;
	
	@Column(name="FM_DB_CR",length=1)
	private String fm_db_cr;
	
	@Column(name="FM_HEADER",length=1)
	private String fm_header;
	
	@Column(name="FM_NEW_PAGE",length=1)
	private String fm_new_page;
	
	@Column(name="FM_TOTAL",length=1)
	private String fm_total;
	
	@Column(name="FM_UNDERLINE",length=1)
	private String fm_underline;
	
	@Column(name="FM_SKIP",length=1)
	private String fm_skip;
	
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
