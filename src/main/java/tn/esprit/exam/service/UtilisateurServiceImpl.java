package tn.esprit.exam.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.*;
import tn.esprit.exam.repository.ChaineRepository;
import tn.esprit.exam.repository.ProgrammeRepository;
import tn.esprit.exam.repository.UtilisateurRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements IUserService {


    UserRepository userRepository;
    GoalRepository goalRepository;


    @Override
    public User ajouterUtilisateur(User u) {
        return userRepository.save(u);
    }

    @Override
    public CareerResources ajouterCareer(CareerResources c) {
        return null;
    }

    @Override
    public List<User> recupererUser(CareerResources c) {
        return null;
    }

    @Override
    public void desaffecterCareerUtilisateur(String name) {

    }

    @Override
    public Goal ajoutergoal(Goal g) {

        return goalRepository.save(g);
    }

    @Override
    public Goal ajoutergoal(Goal g, Long userId) {
        Status status = statusRepository.findById(goalId).get();
        g.setStatus(status);
        return statusRepository.save(g);
    }

    @Override
    public void affectergoalUtilisateur(String name) {
        goal g = goalRepository.findAllByPrNom(name).get(0);
        User u = userRepository.findAllByUsrNom(name).get(0);

        u.getgoals().add(g);

        userRepository.save(u);

    }

    @Override
    public List<User> recupererUsers(Goal g) {

        return userRepository.listerUtilisateurs(g);

    }

    @Override
    @Scheduled(fixedDelay = 20000)
    public void ordonnerChaines() {

        List<Object[]> l = chaineRepository.listerchaines();

        for (Object[] obj : l) {
            Chaine chaine = (Chaine) obj[0];
            Long nbre = (Long) obj[1];
            log.info("Chaine : " + chaine.getChNom() + ".  Nombre de fois où les programmes de cette Chaine sont marqués comme favoris  : " + nbre);
        }

    }

    /*@Override
    public List<Programme> recupererProgrammesInteressants(Long usrId) {

        Utilisateur u = utilisateurRepository.findById(usrId).get();

        return programmeRepository.listerProgrammesInteressants(u.getProfession());

    }*/

    @Override
    public void desaffecterProgrammeDeUtilisateur(String prNom, String usrNom) {

        Goal g = goalRepository.findAllByPrNom(name).get(0);
        User u = userRepository.findAllByUsrNom(name).get(0);

        u.getgoals().remove(g);

        userRepository.save(u);

    }


}
