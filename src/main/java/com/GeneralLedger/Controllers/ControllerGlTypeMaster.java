package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/GeneralLedger/saveupdtypemst")
	public String saveUpdateProduksi(@RequestBody GlTypeMaster type) {
		return servTypeMst.saveUpdateTypeMaster(type);
	
	}
	
	@GetMapping("/GeneralLedger/gettypecodesingle")
	public Optional<GlTypeMaster> getTypeCode(String code) {
		return servTypeMst.getTypeCode(code);
	}
	
	@GetMapping("/GeneralLedger/deletedTypemaster")
	public String DelTypeMaster(String code){
		servTypeMst.DelTypeMaster(code);
        return "Delete Successfully";
    }
	
	

}
