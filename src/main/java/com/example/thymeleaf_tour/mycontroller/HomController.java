package com.example.thymeleaf_tour.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomController {
    @GetMapping("/showflowerlist")
    public String sendDatToHtml(Model model){
        String[] flowers = new String[] {"Rose", "Lily", "Tulip", "Carnation"
                , "Hyacinth"};

        String[] City = new String[] {"nyc", "nj", "dallas", "chicago"};
        model.addAttribute("flowersVariable", flowers);
        model.addAttribute("CityVariable", City);
        return "viewFlowers";
    }
}
