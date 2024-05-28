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
@Table(name = "GL_TYPE_MSTR")
public class GlTypeMaster {
	
	@Id
	@Column(name="TYPE_CODE",length=10,  nullable = false)
	private String type_code;
	
	@Column(name="TYPE_DESC",length=50)
	private String type_desc;
	
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
