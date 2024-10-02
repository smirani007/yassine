package tn.esprit.exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goalId;

    private String Nom;
    private String description;
    @Enumerated(EnumType.STRING)
    private status status;
    private LocalDate lastUpdated;
    private LocalDate dueDate;

   


    public void setStatus(Status status) {
    }
}
