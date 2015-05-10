/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.model.*;
import java.util.Map;
import com.model.Utilisateur;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DNS
 */

@Controller
@RequestMapping("/utilisateur/*")
public class UserController {
    
    @Autowired
    private JavaMailSender mailSender;
    
    @Autowired
    private com.service.UtilisateurService utilisateurService;
    
    public void setUtilisateurService(com.service.UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
    
    @RequestMapping("/index")
    private String setupForm(Map<String,Object> map){
        map.put("UtilisateurList",utilisateurService.allUtilisateur());
        return "User";
    }
    
     @RequestMapping("/insert")
    private String inscription(Map<String,Object> map){
       map.put("Utilisateur",new Utilisateur());
        return "inscription";
    }
   
    @RequestMapping(value="/insert", method=RequestMethod.POST) // Object user,
    public String insertUser(@ModelAttribute("User")Utilisateur user,BindingResult result,HttpServletRequest request){
        int dtype=Integer.parseInt(request.getParameter("dtype"));
        utilisateurService.insertUtilisateur(user);
        return "redirect:index.html";
    }
    
    @RequestMapping(value="/update", method=RequestMethod.POST)
    public String updateUser(@ModelAttribute("User")Utilisateur user, BindingResult result){
        utilisateurService.updateUtilisateur(user);
        return "redirect:index.html";
    }

    @RequestMapping("/delete/{Id}")
    public String deleteUser(@PathVariable("Id") Integer Id){
        utilisateurService.deleteUtilisateur(Id);
        return "redirect:index.html";
    }
    
    @RequestMapping("/select/{Id}")
    public String selectUser(@PathVariable("Id") Integer Id,Map<String,Object> map){
        map.put("User",utilisateurService.selectUtilisateur(Id));
        // return "ShowUser";
        return "redirect:index.html";
    }
    
    

}
