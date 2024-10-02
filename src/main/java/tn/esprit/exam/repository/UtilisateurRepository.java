package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Thematique;
import tn.esprit.exam.entity.User;
import tn.esprit.exam.entity.Utilisateur;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByname(String name);

    @Query("SELECT distinct (u) FROM User u " +
            "INNER JOIN u.goals g " +
            "WHERE u.Status=:s ")
    List<User> listerUtilisateurs(@Param("s") Status s);

}