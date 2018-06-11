package pl.coderslab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.entity.Customer;
import pl.coderslab.repository.CustomerRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private CustomerRepository customerRepository;

	
		@GetMapping("/userSearch")
		public String userSearchGet1(Model model) {
			return "homeSearchForm";
}

		@PostMapping("/userSearch") 
		public String userSearchPost(@RequestParam String search, Model model) {
			List<Customer> customer = this.customerRepository.findByAnything(search);

			if (customer.isEmpty()) {
				return "redirect:/customer/customerAddForm";
			} else {
				model.addAttribute("customers", customer);
			}
			return "customersList";
		}
}
