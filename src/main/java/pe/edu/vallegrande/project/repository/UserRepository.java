package pe.edu.vallegrande.project.repository;

import pe.edu.vallegrande.project.model.UserWeb;  
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<UserWeb, Long> {  
    List<UserWeb> findByStatus(String status);  
}
