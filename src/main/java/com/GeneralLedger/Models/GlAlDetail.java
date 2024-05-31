package com.GeneralLedger.Models;

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
@Table(name= "GL_AL_DET")

public class GlAlDetail {
	
	@Id
	@Column (name="AL_CODE", length=20, nullable = false)
	private String glAlCodeMstDet;


}
