package com.controller;

import com.model.Utilisateur;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/welcome/*")
public class LoginController {


    @Autowired
    private com.service.UtilisateurService utilisateurService;

    @RequestMapping(value="/login")
    public String login(){
            return "login";

    }
    @RequestMapping(value="/home")
    public String home(){
            return "home";

    }
    @RequestMapping(value="/aider")
    public String aider(){
            return "aider";

    }
    @RequestMapping(value="/403")
    public String error_403(){
            return "error/extras-403";

    }
    @RequestMapping("/default")
    public String defaultAfterLogin(HttpServletRequest request) {
		
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        
        request.getSession().setAttribute("username", username);
        
        try {
		
                Utilisateur u = utilisateurService.getUtilisateurByUsername(username);
                if (u.getUsername().length()<=0) {
                    return "redirect:/j_spring_security_logout";
                }
                System.out.println(u.toString());
                request.getSession().setAttribute("user", u);
                
                
                if (request.isUserInRole("ROLE_CLIENT")){
                    return "redirect:home.html";
                }else{
                    return "redirect:/j_spring_security_logout";
                }         
                
        } catch (Exception e) {
                
		return "redirect:/j_spring_security_logout";
	}
    }
}
