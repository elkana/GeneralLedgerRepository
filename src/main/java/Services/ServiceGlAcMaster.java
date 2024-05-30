package Services;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.IGlAcMasterRepository;

import java.util.List;

@Service
public class ServiceGlAcMaster {
	@Autowired
	IGlAcMasterRepository repoGlAcMst;
	
	public String getTest() {
		return "test 13fsdfasdfsadfasdf";
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.GlAcMaster;
import Repository.IGlAcMasterRepository;

@Service
public class ServiceGlAcMaster {
	
	@Autowired
	IGlAcMasterRepository repoglam;
	
	public List<GlAcMaster> getAcMasterAll(){
		return repoglam.findAll();
>>>>>>> 7a6d038cbec5e61b6e48b2997df46500c965bf09
	}

}
