package pl.coderslab.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.Device;
import pl.coderslab.entity.Order;
import pl.coderslab.entity.StatusType;
import pl.coderslab.repository.DeviceRepository;
import pl.coderslab.repository.OrderRepository;
import pl.coderslab.repository.StatusTypeRepository;

@Controller
@RequestMapping("/order")
public class OrderRepositoryController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private StatusTypeRepository statusRepository;
	
	@Autowired
	private DeviceRepository deviceRepository;
	

	@GetMapping("/orderAddForm/{device_id}")
	public String saveOrderByDeviceId(@PathVariable long device_id, Model model, Model model1) {
		
		// Z adresu pobieramy ID konkretnego Devica
		// Szukamy Devica po danym ID i tworzymy obiekt Device
		Device device = this.deviceRepository.findById(device_id);
		
		// Pobieramy listę zleceń tego konkretnego Devica
		List<Order> ordersList = this.orderRepository.findByDevice(device);
		
		model1.addAttribute("ordersList", ordersList); // tu zapisujemy listę Deviców do wyświetlenia
		
		model.addAttribute("order", new Order()); // a tu będz zapiszemy dane z formularza
		return "orderAddForm";
	}
	
	@PostMapping("/orderAddForm/{device_id}")
	public String formPost(@PathVariable long device_id, @Valid Order order, BindingResult result) {
		if (result.hasErrors()) {
			return "Zlecenie nie zostało dodane";
		}
		Device device = this.deviceRepository.findById(device_id);
		order.setDevice(device);
		
		orderRepository.saveAndFlush(order);
		return "endOfOrderPlacement";
	}
	
	@ModelAttribute("statusType")
	public List<StatusType> getStatusType() {
		return this.statusRepository.findAll();
	}
	
	
}
