package com.GeneralLedger.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GlFuDetailCompKey implements Serializable{
	
	private Integer glFuSeqMstDet;
	private Integer glFuSeqDet;

}
