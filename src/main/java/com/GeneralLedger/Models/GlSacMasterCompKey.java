package com.GeneralLedger.Models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GlSacMasterCompKey implements Serializable{
	
	private String glsmsacacc;
	private String glsmsacsub;

}
