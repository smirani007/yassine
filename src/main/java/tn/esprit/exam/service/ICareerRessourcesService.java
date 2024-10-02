package tn.esprit.exam.service;

import tn.esprit.exam.entity.CareerResources;

import java.util.List;

public interface ICareerRessourcesService {

    public List<CareerResources> retrieveAllCareers();

    public CareerResources retrieveCareer(Long ressourceid);

    public CareerResources addCareer(CareerResources c);

    public void removeCareer(Long ressourceid);

    public CareerResources modifycareer(CareerResources career);

}
