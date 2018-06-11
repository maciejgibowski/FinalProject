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
import pl.coderslab.entity.Device;
import pl.coderslab.entity.Order;
import pl.coderslab.entity.Worker;
import pl.coderslab.repository.CustomerRepository;
import pl.coderslab.repository.DeviceRepository;
import pl.coderslab.repository.OrderRepository;
import pl.coderslab.repository.WorkerRepository;

@Controller
@RequestMapping("/control")
public class MenagerController {

	@Autowired
	private WorkerRepository workerRepository;
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CustomerRepository customerRepository;

	
	
	@GetMapping("/controlPanel")
	public String workerSearchGet(Model model) {
		model.addAttribute("worker", new Worker());
		return "controlPanel";
	}	
	
	@PostMapping("/controlPanel") // Dowiedzieć się jak wyszukiwać po dowolnym parametrze!!!!!!!!!
	public String workerSearchPost(@RequestParam String search, Model model) {
		List<Worker> worker = this.workerRepository.findByAnything1(search);

		if (worker.isEmpty()) {
			return "redirect:/worker/workerAddForm";
		} else {
			model.addAttribute("workers", worker);
		}
		return "workersList";
	}

	@GetMapping("/allWorkers")
	public String showAllWorkers(Model model) {
		List<Worker> workers = this.workerRepository.findAll();
		model.addAttribute("workers", workers);
		return "workersList";
	}
	
	@GetMapping("/allDevices")
	public String showAllDevices(Model model) {
		List<Device> devices = this.deviceRepository.findAll();
		model.addAttribute("devices", devices);
		return "devicesList";
	}
	
	@GetMapping("/allOrders")
	public String showAllOrders(Model model) {
		List<Order> orders = this.orderRepository.findAll();
		model.addAttribute("orders", orders);
		return "ordersList";
		
	}

	@GetMapping("/allCustomers")
	public String showAllCustomers(Model model) {
		List<Customer> customers = this.customerRepository.findAll();
		model.addAttribute("customers", customers);
		return "customersList";
	}   
}
