package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import org.springframework.stereotype.Repository;
>>>>>>> 7a6d038cbec5e61b6e48b2997df46500c965bf09

import Models.GlAcMaster;

@Repository
<<<<<<< HEAD
public interface IGlAcMasterRepository extends JpaRepository<GlAcMaster,String>{
=======
public interface IGlAcMasterRepository extends JpaRepository<GlAcMaster, Integer>{
>>>>>>> 7a6d038cbec5e61b6e48b2997df46500c965bf09

}
