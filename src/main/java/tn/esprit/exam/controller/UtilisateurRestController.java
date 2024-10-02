package tn.esprit.exam.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.CareerResources;
import tn.esprit.exam.entity.Goal;

import tn.esprit.exam.entity.User;
import tn.esprit.exam.entity.User;
import tn.esprit.exam.service.IUserService;

import java.util.Date;
import java.util.List;

@Tag(name = "Web Services pour la gestion de Users")
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserRestController {


    IUserService userService;


    @PostMapping("/add-user")
    public User ajouterUtilisateur(@RequestBody User u) {
        User utilisateur = userService.ajouterUtilisateur(u);
        return User;
    }

    @PostMapping("/add-program-channel")
    public CareerResources ajouterProgrammeEtChaine(@RequestBody CareerResources c) {
        CareerResources career = userService.ajouterProgrammeEtChaine(c);
        return career;
    }

    @PostMapping("/add-program-assign-channel/{ch-id}")
    public CareerResources ajouterUtilisateur(@RequestBody CareerResources c, @PathVariable("ch-id") Long ressourceid) {
        CareerResources programme = userService.ajouterProgrammeEtAffecterChaine(p, chId);
        return programme;
    }

    @PutMapping("/assign-program-user/{pr-nom}/{usr-nom}")
    public void affecterProgrammeAUtilisateur(@PathVariable("pr-nom") String prNom, @PathVariable("usr-nom") String usrNom) {

        userService.affectercareerUtilisateur(name);

    }

    @GetMapping("/get-users/{p}/{d}/{t}")
    public List<user> listerUtilisateurs(@PathVariable("p") Profession p, @PathVariable("d") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date d, @PathVariable("t") Thematique t) {

        return userService.recupererUser(g);

    }

    /*@GetMapping("/get-users/{usr-id}")
    public List<Programme> listerProgrammes(@PathVariable("usr-id") Long usrId) {

        return utilisateurService.recupererProgrammesInteressants(usrId);

    }*/

    @PutMapping("/unassign-program-user/{pr-nom}/{usr-nom}")
    public void desaffecterProgrammeAUtilisateur(@PathVariable("pr-nom") String prNom, @PathVariable("usr-nom") String usrNom) {

        userService.desaffecterProgrammeDeUtilisateur(name);

    }

}
