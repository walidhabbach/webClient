package org.group.voiture.controllers;

import  org.group.voiture.models.CarResponse;
import org.group.voiture.services.CarWebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/voiture")
public class CarController {

    @Autowired
    private CarWebClientService carWebClientService;


    @GetMapping("/all")
    public List<CarResponse> findAllWebClient() {
        return carWebClientService.findAll ();
    }

    @GetMapping("/{id}")
    public CarResponse findByIdWebClient(@PathVariable Long id) throws Exception{
        return carWebClientService.findById (id);
    }
}