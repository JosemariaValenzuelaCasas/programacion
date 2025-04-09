package pe.edu.vallegrande.project.service;

import pe.edu.vallegrande.project.model.Guest;  
import java.util.List;
import java.util.Optional;

public interface GuestService {

    List<Guest> findAll();  

    Optional<Guest> findById(Long id);  

    Guest save(Guest guest);  

    Guest update(Guest guest);  

    Guest deleteLogical(Long id);  

    Guest restoreLogical(Long id);  
}
