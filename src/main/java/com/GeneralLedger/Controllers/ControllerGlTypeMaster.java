package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Services.ServiceGlTypeMaster;

@RestController
public class ControllerGlTypeMaster {
	
	@Autowired
	ServiceGlTypeMaster servTypeMst;
	
	@GetMapping("/GeneralLedger/getgltypemstlistall")
	public List<GlTypeMaster> getGlTypeMst(){
		return servTypeMst.getGlTypeMaster();
	}
	
	@GetMapping("/GeneralLedger/getgltypestatuslist")
	public List<GlTypeMaster> getGlTypeStatus(String status){
		return servTypeMst.getGlStsType(status);
	}
	
	@GetMapping("/GeneralLedger/getgltypecodelist")
	public List<GlTypeMaster> getGlCodeType(String code){
		return servTypeMst.getGlTypeByCode(code);
	}
	
	@GetMapping("/GeneralLedger/getgltypecodestslist")
	public List<GlTypeMaster> getGlCodeTypeSts(String status, String code){
		return servTypeMst.getGlTypeByCodeSts(status, code);
	}
	
	@GetMapping("/GeneralLedger/getgltypedescstslist")
	public List<GlTypeMaster> getGlDescTypeSts(String status,String desc){
		return servTypeMst.getGlDescTypeSts(status, desc);
	}
	
	@GetMapping("/GeneralLedger/getgltypedesclist")
	public List<GlTypeMaster> getGlDescType(String desc){
		return servTypeMst.getGlDescType(desc);
	}
	
	@PostMapping("/GeneralLedger/saveupdtypemst")
	public String saveUpdateTypeMaster(@RequestBody GlTypeMaster type) {
		return servTypeMst.saveUpdateTypeMaster(type);
	
	}
	
	@GetMapping("/GeneralLedger/gettypecodesingle")
	public Optional<GlTypeMaster> getTypeCode(String code) {
		return servTypeMst.getTypeCode(code);
	}
	
	@GetMapping("/GeneralLedger/getmstypedesc")
	public String getMstTypeDesc(String code) {
		return servTypeMst.getMstTypeDesc(code);
	}
	
	@GetMapping("/GeneralLedger/deletedTypemaster")
	public String DelTypeMaster(String code){
		servTypeMst.DelTypeMaster(code);
        return "Delete Successfully";
    }
	
	@DeleteMapping("/GeneralLedger/delTypemstbytypecode")
	public String DelFuMaster(String code) {
		return servTypeMst.DelTypeMaster(code);

	}
	
}
