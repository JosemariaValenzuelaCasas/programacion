package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.Guest;  
import pe.edu.vallegrande.project.repository.GuestRepository;  // Usamos 'GuestRepository'
import pe.edu.vallegrande.project.service.GuestService;  // Usamos 'GuestService'
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<Guest> findAll() {  
        log.info("Listando Huéspedes: ");
        return guestRepository.findAll();
    }

    @Override
    public Optional<Guest> findById(Long id) {  
        log.info("Listando Huésped por ID: ");
        return guestRepository.findById(id);
    }

    @Override
    public Guest save(Guest guest) {  
        log.info("Registrando Huésped: " + guest.toString());
        return guestRepository.save(guest);
    }

    @Override
    public Guest update(Guest guest) {  
        log.info("Editando Huésped: " + guest.toString());
        return guestRepository.save(guest);
    }

    public Guest deleteLogical(Long id) {  
        Guest guest = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Huésped no encontrado con id: " + id));
        return guestRepository.save(guest);
    }

    public Guest restoreLogical(Long id) {  
        Guest guest = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Huésped no encontrado con id: " + id));
        return guestRepository.save(guest);
    }
}
