package com.GeneralLedger.Models;

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
public class GlAcdReportCompKey  implements Serializable{
	
	private Integer GlAcdRptYear;
	private Integer GlAcdRptMonth;
	private String GlAcdRptAcc;
	private String GlAcdRptSub;

}
