package com.spring.henallux.firstSpringProject.controller;
import com.spring.henallux.firstSpringProject.model.User;
import com.spring.henallux.firstSpringProject.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping(value="/inscription")
public class InscriptionController {

    private HobbiesService hobbiesService;

    @Autowired
    public InscriptionController(HobbiesService hobbiesService) {
        this.hobbiesService = hobbiesService;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("hobbies",hobbiesService.getHobbies());
        model.addAttribute("currentUser", new User());
        model.addAttribute("title", "Inscription page");
        return "integrated:userInscription";
    }


    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String getFormData( Model model,
                               @Valid @ModelAttribute(value="currentUser") User user,
                               final BindingResult errors) {

        if (!errors.hasErrors()) {
            System.out.println("------------------------" + user);
            return "integrated:gift";
        } else {
            System.out.println("------------------------erreurs");
            model.addAttribute("hobbies", hobbiesService.getHobbies());
            return "integrated:userInscription";
        }
    }



}