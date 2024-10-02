package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Goal;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Utilisateur;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {


    List<Goal> findAllByPrNom(String name);


    /*@Query("SELECT distinct (p) FROM Programme p " +
            "INNER JOIN p.utilisateurs u " +
            "WHERE u.profession = :p ")
    List<Programme> listerProgrammesInteressants(@Param("p") Profession p);*/

}