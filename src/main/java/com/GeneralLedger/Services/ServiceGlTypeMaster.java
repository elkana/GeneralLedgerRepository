package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Repository.IGlTypeMaster;

@Service
public class ServiceGlTypeMaster {
	
	@Autowired
	IGlTypeMaster repoTypeMst;
	
	public List<GlTypeMaster> getGlTypeMaster(){
		return repoTypeMst.findAll();
	}
	
	public List<GlTypeMaster> getGlStsType(String status){
		return repoTypeMst.findBygltmacstatus(status);
	}
	
	public List<GlTypeMaster> getGlTypeByCode(String code){
		return repoTypeMst.findBygltmtypecodeContaining(code);
	}
	
	public List<GlTypeMaster> getGlTypeByCodeSts(String status ,String code){
		return repoTypeMst.findBygltmacstatusAndGltmtypecodeContaining(status, code);
	}
	
	public List<GlTypeMaster> getGlDescType(String desc){
		return repoTypeMst.findByGltmtypedescContaining(desc);
	}
	
	public List<GlTypeMaster> getGlDescTypeSts(String status ,String desc){
		return repoTypeMst.findBygltmacstatusAndGltmtypedescContaining(status, desc);
	}
	
	public String saveUpdateTypeMaster(GlTypeMaster type) {
		repoTypeMst.save(type);
		return "Submit Successfully";
	}
	
	public Optional<GlTypeMaster> getTypeCode(String code){
	    return repoTypeMst.findBygltmtypecode(code);
	}
	
	public String getMstTypeDesc(String code) {
		return repoTypeMst.getMstTypeDesc(code);
	}
	
	public String DelTypeMaster(String code) {
		repoTypeMst.getDelByTypeCode(code);
		return "Delete Successfully";
	}
	
	public String DelTypeMasterById(String code) {
		repoTypeMst.deleteById(code);
		return "Delete Successfully";
	}

}
