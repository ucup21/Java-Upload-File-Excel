/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.upload.controller;

import com.example.upload.model.JumlahSuara;
import com.example.upload.model.Partai;
import com.example.upload.repository.PartaiRepository;
import com.example.upload.service.FileStorageService;
import com.example.upload.service.JumlahSuaraService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class PartaiController {

    @Autowired
    PartaiRepository pr;

    @Autowired
    FileStorageService fileStorageService;
    
    @Autowired
    JumlahSuaraService jmlSuaraService;
    
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("partai", new Partai());
        List<JumlahSuara> jmlSuara = jmlSuaraService.getJumlahSuara();
        model.addAttribute("partais", jmlSuara);
        return "view/partai";
    }
    
    @PostMapping("uploadFile")
    public String uploadFile(@ModelAttribute Partai partai, RedirectAttributes redirectAttributes
    ) {
        fileStorageService.storeFile(partai.getFile());
        return "redirect:/";
    }
    
    @GetMapping("getFile")
    public String homeFile(Model model){
        model.addAttribute("partai", new Partai());
        List<JumlahSuara> jmlSuara = jmlSuaraService.getJumlahSuara();
        model.addAttribute("partais", jmlSuara);
        return "view/partai";
    }
}
