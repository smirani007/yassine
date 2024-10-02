package tn.esprit.exam.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.CareerResources;
import tn.esprit.exam.entity.Projet;
import tn.esprit.exam.repository.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CareerRessourceServiceImpl implements ICareerRessourcesService {

    CarrerRepository CareerRepository;

    public static CareerResources addcareer(CareerResources c) {
    }


    //@Scheduled(fixedDelay = 10000)
    public List<CareerResources> retrieveAllcareers() {

        //log.info("In Method : retrieveAllProjets ");

        List<CareerResources> listcareers = CareerRepository.findAll();
        for (CareerResources careerResources : listcareers) {
            log.info("j'affiche un carriere : " + careerResources);
        }

        //log.info("Out of Method : retrieveAllProjets ");

        return listcareers;

    }

    @Override
    public List<CareerResources> retrieveAllCareers() {
        return null;
    }

    public CareerResources retrieveCareer(Long ressourceid) {
        return CareerRepository.findById(ressourceid).get();
    }

    public CareerResources addCareer(CareerResources c) {
        return CareerRepository.save(c);
    }

    public void removeCareer(Long ressourceid) {
        CareerRepository.deleteById(ressourceid);
    }

    public CareerResources modifycareer(CareerResources career) {
        return CareerRepository.save(CareerResources);
    }

    // Projet et ProjetDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le Projet et le Projet Detail


}
