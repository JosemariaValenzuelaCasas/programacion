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
@Table(name = "guest")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_guest")
    private Long idGuest;

    @Column(name = "user_id")
    private Long userId; 

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "identity_document")
    private String identityDocument;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "cellphone")
    private String cellphone;

    @Column(name = "email")
    private String email;
}
