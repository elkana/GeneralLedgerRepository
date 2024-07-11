package com.GeneralLedger.Repository;

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
public class GlGltDetCompKey implements Serializable{

	private String glGltDtlRef;

	private Integer glDltDtlSeqNo;
}
