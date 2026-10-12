package mx.edu.utez.proyecto1D.model.usuario;

import jakarta.persistence.*;
import lombok.*;
import mx.edu.utez.proyecto1D.model.persona.Persona;

@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Username1", nullable = false, unique = true)
    private String username;

    private String pasword;

    private boolean isEnable;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Transient
    private  String atributoNoColums;

    @Enumerated(EnumType.STRING)
    private Roles rol;

    //
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
