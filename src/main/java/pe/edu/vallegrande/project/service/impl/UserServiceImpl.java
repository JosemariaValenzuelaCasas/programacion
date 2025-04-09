package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.UserWeb;  
import pe.edu.vallegrande.project.repository.UserRepository;
import pe.edu.vallegrande.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserWeb> findAll() {  
        log.info("Listando Usuarios: ");
        return userRepository.findAll();
    }

    @Override
    public Optional<UserWeb> findById(Long id) {  
        log.info("Listando Usuario por ID: ");
        return userRepository.findById(id);
    }

    @Override
    public UserWeb save(UserWeb user) {  
        log.info("Registrando Usuario: " + user.toString());
        user.setStatus("A"); // Estado "A" para activo por defecto
        return userRepository.save(user);
    }

    @Override
    public UserWeb update(UserWeb user) {  
        log.info("Editando Usuario: " + user.toString());
        user.setStatus("A"); // Cambiar a activo al actualizar
        return userRepository.save(user);
    }

    public UserWeb deleteLogical(Long id) {  
        UserWeb user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        user.setStatus("I");  // Cambia el estado a "I" (inactivo) para eliminar lógicamente
        return userRepository.save(user);
    }

    public UserWeb restoreLogical(Long id) {  
        UserWeb user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        user.setStatus("A");  // Restaura el estado a "A" (activo)
        return userRepository.save(user);
    }

    @Override
    public List<UserWeb> findByStatus(String status) {  
        log.info("Listando usuarios con estado: " + status);
        return userRepository.findByStatus(status);  // Consulta de usuarios por estado
    }
}
