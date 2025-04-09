package pe.edu.vallegrande.project.service;

import pe.edu.vallegrande.project.model.UserWeb;  
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserWeb> findAll();  

    Optional<UserWeb> findById(Long id);  

    UserWeb save(UserWeb user);  

    UserWeb update(UserWeb user);  

    UserWeb deleteLogical(Long id);  

    UserWeb restoreLogical(Long id);  
    
    List<UserWeb> findByStatus(String status);  
}
