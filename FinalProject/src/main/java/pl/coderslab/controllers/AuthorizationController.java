package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/authorization")
public class AuthorizationController {

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @PostMapping("/login")
    //@ResponseBody
    public String Login(HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
       
       
        if (username.equals("Menager") && password.equals("menager")){
            HttpSession session = request.getSession();

            session.setAttribute("username", username);
            session.setAttribute("authorized", true);
            session.setMaxInactiveInterval(30*60);

            return "redirect:/control/controlPanel";
        }
        
        else if (username.equals("Serwisant") && password.equals("serwisant")){
            HttpSession session = request.getSession();

            session.setAttribute("username", username);
            session.setAttribute("authorized", true);
            session.setMaxInactiveInterval(30*60);

            return "redirect:/serviceman/servicemanPanel";
        }
        
        else if (username.equals("Obsluga") && password.equals("obsluga")){
            HttpSession session = request.getSession();

            session.setAttribute("username", username);
            session.setAttribute("authorized", true);
            session.setMaxInactiveInterval(30*60);

            return "redirect:/home/userSearch";
        
        }
        else
        {
            return "Zaloguj";
        }
    }
}