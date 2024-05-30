package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GlAcdDetailCompKey implements Serializable{
	
	private Integer GlAcdDtlYear;
	private Integer GlAcdDtlMonth;
	private String GlAcdDtlAcc;
	private String GlAcdDtlSub;
	
	
}
