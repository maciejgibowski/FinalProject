package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/wyloguj")
public class LogoutController {

    @GetMapping("/logout")
    public String Logout() {
        return "logout";
    }

    @PostMapping("/logout")
    @ResponseBody
    public String Logout(HttpServletRequest request) {
    	
    	HttpSession session=request.getSession();  
        session.invalidate(); 
    	
		return "redirect:/authorization/login";

      
  }
}