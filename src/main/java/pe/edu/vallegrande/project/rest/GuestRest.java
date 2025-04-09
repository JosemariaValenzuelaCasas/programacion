package pe.edu.vallegrande.project.rest;

import org.springframework.web.bind.annotation.PatchMapping;
import pe.edu.vallegrande.project.model.Guest;  // Usando 'Guest' en lugar de 'UserWeb'
import pe.edu.vallegrande.project.service.GuestService;  // Usando 'GuestService' en lugar de 'UserService'
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/guest")  // Ruta base para 'Guest'
public class GuestRest {

    private final GuestService guestService;

    @Autowired
    public GuestRest(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> findAll() {  
        return guestService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Guest> findById(@PathVariable Long id) {  
        return guestService.findById(id);
    }

    @PostMapping("/save")
    public Guest save(@RequestBody Guest guest) {  
        return guestService.save(guest);
    }

    @PutMapping("/update")
    public Guest update(@RequestBody Guest guest) {  
        return guestService.update(guest);
    }

    @PatchMapping("/{id}/delete")
    public Guest deleteLogical(@PathVariable Long id) {  
        return guestService.deleteLogical(id);
    }

    @PatchMapping("/{id}/restore")
    public Guest restoreLogical(@PathVariable Long id) {  
        return guestService.restoreLogical(id);
    }
}
