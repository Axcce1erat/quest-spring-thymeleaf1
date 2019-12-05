package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model,
                         //If no doctor's name is entered, set the default value to be "John Smith". If no number is entered, set the default value to be 0.
                         @RequestParam(value = "name", required = false, defaultValue = "John Smith") String nameDoctor,
                         @RequestParam(value = "number", required = false, defaultValue = "0") int numberWho){
                            model.addAttribute("doctorName", nameDoctor);
                            model.addAttribute("doctorNumber", numberWho);
        return "doctor";
        }



    }
