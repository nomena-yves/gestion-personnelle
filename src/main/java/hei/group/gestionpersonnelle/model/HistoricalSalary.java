package hei.group.gestionpersonnelle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HistoricalSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @OneToMany
    private List<Salary> salaries=new ArrayList<Salary>();
}
