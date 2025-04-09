package pe.edu.vallegrande.project.repository;

import pe.edu.vallegrande.project.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByEmail(String email);
}
