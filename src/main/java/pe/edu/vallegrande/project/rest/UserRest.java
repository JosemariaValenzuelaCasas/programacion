package pe.edu.vallegrande.project.rest;

import org.springframework.web.bind.annotation.PatchMapping;
import pe.edu.vallegrande.project.model.UserWeb;  
import pe.edu.vallegrande.project.service.UserService;
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
@RequestMapping("/v1/api/userWeb")
public class UserRest {

    private final UserService userService;

    @Autowired
    public UserRest(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping
    public List<UserWeb> findAll() {  
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserWeb> findById(@PathVariable Long id) {  
        return userService.findById(id);
    }

    @PostMapping("/save")
    public UserWeb save(@RequestBody UserWeb user) {  
        return userService.save(user);
    }

    @PutMapping("/update")
    public UserWeb update(@RequestBody UserWeb user) {  
        return userService.update(user);
    }

    @GetMapping("/status/{status}")
    public List<UserWeb> getUsersByStatus(@PathVariable String status) {  
        return userService.findByStatus(status);
    }

    @PatchMapping("/{id}/delete")
    public UserWeb deleteLogical(@PathVariable Long id) {  
        return userService.deleteLogical(id);
    }

    @PatchMapping("/{id}/restore")
    public UserWeb restoreLogical(@PathVariable Long id) {  
        return userService.restoreLogical(id);
    }
}
