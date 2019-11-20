

package com.petProject.petClinic.controller;

import com.petProject.petClinic.domain.Vets;
import com.petProject.petClinic.repository.VetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Map;

@Controller
public class VetController {
    public VetRepository vets;

    public VetController(VetRepository vets){
        this.vets = vets;
    }

    @GetMapping("/vets.html")
    public String showVetList(Map<String, Object> model){
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        model.put("vets", vets);
        return "vets/vetList";
    }

}
