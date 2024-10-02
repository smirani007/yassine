package tn.esprit.exam.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.CareerResources;
import tn.esprit.exam.entity.CareerResources;
import tn.esprit.exam.service.CareerRessourceServiceImpl;
import tn.esprit.exam.service.ICareerRessourcesService;
import tn.esprit.exam.service.ICareerRessourcesService;

import java.util.List;

@Tag(name = "Web Services pour la gestion de Projets")
@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class CareerRessourcesRestController {

    ICareerRessourcesService careerRessourcesService;

    // http://localhost:8089/exam/projet/retrieve-all-projets

    @Operation(description = "Ceci récupère la liste de tous les Projets")
    @GetMapping("/retrieve-all-projets")
    public List<CareerResources> getcareers() {
        List<CareerResources> listcareers = CareerResources.retrieveAllCareers();
        return listcareers;
    }


    // http://localhost:8089/exam/projet/retrieve-projet/8
    @GetMapping("/retrieve-projet/{projet-id}")
    public CareerResources retrieveProjet(@PathVariable("projet-id") Long proejtId) {
        CareerResources career = careerRessourcesService.retrieveCareer(ressourceid);
        return career;
    }

    // http://localhost:8089/exam/projet/add-projet
    @PostMapping("/add-projet")
    public CareerResources addcareer(@RequestBody CareerResources c) {
        CareerResources career = CareerRessourceServiceImpl.addcareer(c);
        return career;
    }

    // http://localhost:8089/exam/projet/remove-projet/{projet-id}
    @DeleteMapping("/remove-projet/{ressourceid}")
    public void removecareer(@PathVariable("ressourceid") Long proejtId) {
        ICareerRessourcesService.removecareer(ressourceid);
    }

    // http://localhost:8089/exam/projet/modify-projet
    @PutMapping("/modify-projet")
    public CareerResources modifyCareer(@RequestBody Career c) {
        CareerResources career = ICareerRessourcesService.modifyCareer(c);
        return career;
    }


}
