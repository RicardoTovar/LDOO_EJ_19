/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class UserController {

   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("user", "command", new User());
   }
   
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addUser(@ModelAttribute("SpringWeb")User user, 
   ModelMap model) {
      model.addAttribute("nombre", user.getNombre());
      model.addAttribute("apellido", user.getApellido());
      model.addAttribute("email", user.getEmail());
      model.addAttribute("contraseña", user.getContraseña());
      model.addAttribute("fecha", user.getFecha());
      
      return "result";
   }
}