package tn.esprit.exam.service;

import tn.esprit.exam.entity.*;

import java.util.Date;
import java.util.List;

public interface IUserService {

    public User ajouterUtilisateur(User u);

    public CareerResources ajouterCareer(CareerResources c);


    public List<User> recupererUser(CareerResources c);


    //public List<Programme> recupererProgrammesInteressants(Long usrId);

    public void desaffecterCareerUtilisateur(String name);

}
