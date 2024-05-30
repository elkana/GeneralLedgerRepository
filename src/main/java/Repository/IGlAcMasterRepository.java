package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.GlAcMaster;

@Repository
public interface IGlAcMasterRepository extends JpaRepository<GlAcMaster, Integer>{

}
