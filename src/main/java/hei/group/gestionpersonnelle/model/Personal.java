package hei.group.gestionpersonnelle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private Role role;
    @OneToOne
    private Salary salary;
}
