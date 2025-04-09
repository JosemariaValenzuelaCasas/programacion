package pe.edu.vallegrande.project.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "userWeb")  
public class UserWeb { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // id_user en la base de datos

    @Column(name = "username")
    private String username;  // Campo para el nombre de usuario

    @Column(name = "password")
    private String password;  // Campo para la contraseña

    @Column(name = "email")
    private String email;  // Campo para el correo electrónico

    @Column(name = "role")
    private String role;  // Campo para el rol del usuario (por ejemplo, 'A' para administrador)

    @Column(name = "status")
    private String status;  // Estado del usuario (activo/inactivo)
}
