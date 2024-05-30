package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.ServiceGlAcMaster;

import java.util.List;

@RestController
public class ControllerGlAcMaster {
	@Autowired
	ServiceGlAcMaster servGlAcMst;
	
	@GetMapping("/glac/test123")
	public String getTest() {
		return servGlAcMst.getTest();
	}
	
}
