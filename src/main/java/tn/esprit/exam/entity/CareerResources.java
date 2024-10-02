package tn.esprit.exam.entity;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CareerResources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ressourceid;

    private String name;
    private String url;
    private boolean iscompleted;


    public static List<CareerResources> retrieveAllCareers() {
    }
}
