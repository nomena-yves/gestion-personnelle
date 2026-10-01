package hei.group.gestionpersonnelle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private double salary;
    private LocalDate issueDate= LocalDate.now();
}
