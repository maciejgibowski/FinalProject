package pl.coderslab.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.Customer;
import pl.coderslab.repository.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerRepositoryController {
	
//	@Autowired
//	Validator validator;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/add/{firstName}/{lastName}/{phoneNumber}/{email}")
	@ResponseBody
	public String addCustomer(@PathVariable String firstName, @PathVariable String lastName,
							  @PathVariable String phoneNumber, @PathVariable String email) {
			
	Customer customer = new Customer(firstName, lastName, phoneNumber, email);
	customerRepository.saveAndFlush(customer);
	return "Customer added";
}
	
	@GetMapping("/customerAddForm")
	public String form(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerAddForm";
	}
	
	
	@PostMapping("/customerAddForm")
	public String CustomerAddForm(@RequestParam String firstName,
								  @RequestParam String lastName,
								  @RequestParam String phoneNumber,
								  @RequestParam String email,
								  Model model) {
		
		Customer customer = new Customer(firstName, lastName, phoneNumber, email);		
		customerRepository.saveAndFlush(customer);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);	 
		model.addAttribute("customers", customerList);
		
		return "customersList";	
	}
	
	@GetMapping("/delete/{id}")
	@ResponseBody
	public String deleteWorker(@PathVariable long id) {
		customerRepository.delete(id);
		return "Pracownik został usuniety";
	}
	
	
	@GetMapping("/customerEditForm/{customerid}")
	public String CustomerEditFormGet(Model model) {
		model.addAttribute("customers", new Customer());
		return "customerEditForm";
	}
	
	@PostMapping("/customerEditForm/{customerid}")
	public String WorkerEditForm (@PathVariable  long customerid,
					@RequestParam String firstName, 
					@RequestParam String lastName,
					@RequestParam String phoneNumber, 
					@RequestParam String email, 
					Model model) {

		Customer  customer = this.customerRepository.findById(customerid);
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPhoneNumber(phoneNumber);
		customer.setEmail(email);
		customerRepository.saveAndFlush(customer);
			
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);	 
		model.addAttribute("customers", customerList);
		
		return "customersList";	
	}

}