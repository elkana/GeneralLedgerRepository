package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GL_GROUP")

public class GlGrup {

	@Id
	@Column (name="GRUP_ID", nullable = false)
	private Integer grupId;

	@Column (name="GRUP_DESC", length=50, nullable = false)
	private String grupDesc;
	
	@Column (name="GRUP_STATUS")
	private Boolean grupStatus;
	
	@Column (name="AC_USER_CRE", length=20)
	private String grupCreateUser;
	
	@Column (name="AC_DATE_CRE", length=20)
	private Date grupCreateDate;	
	
	@Column (name="AC_USER_UPD", length=20)
	private Boolean grupUpdateUser;

	@Column (name="AC_DATE_UPD", length=20)
	private Date grupUpdateDate;

	  

}
