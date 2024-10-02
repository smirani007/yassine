package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.CareerResources;
import tn.esprit.exam.entity.Goal;
import tn.esprit.exam.entity.Projet;

@Repository
public interface GoalRepository extends JpaRepository<CareerResources, Long> {


}