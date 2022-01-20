package com.example.uf4pt1part3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.Arrays;

@Controller
@SpringBootApplication
public class Uf4Pt1Part3Application {

    /*@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Oscar!";
    }*/

    @RequestMapping("/")
    @ResponseBody
    ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    /*@RequestMapping("/imprimirArray")
    @ResponseBody
    String[] printArray() {
        return new String[]{"Volvo", "BMW", "Ford", "Mazda"};
    }*/

    @GetMapping("/imprimirArray")
    public String printArray(Model model) {
        model.addAttribute("list", Arrays.asList("Volvo", "BMW", "Ford"));
        return "imprimirArray";
    }

    public static void main(String[] args) {
        SpringApplication.run(Uf4Pt1Part3Application.class, args);
    }

}
