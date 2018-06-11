package pl.coderslab.controllers;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.entity.Device;
import pl.coderslab.entity.Order;
import pl.coderslab.entity.StatusType;
import pl.coderslab.repository.OrderRepository;
import pl.coderslab.repository.StatusTypeRepository;

@Controller
@RequestMapping("/serviceman")
public class ServicemanController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private StatusTypeRepository statusRepository;
	
//	@Autowired
//	private DeviceRepository deviceRepository; //możliwe, że do wyrzucenia
	
	@GetMapping("/servicemanPanel")
	public String servicemanPanel(Model model) {
		model.addAttribute("order", new Order());
		return "servicemanPanel";
	}	
	
	@PostMapping("/servicemanPanel")
	public String servicemanPanelPost(@RequestParam long orderNumber, Model model) {
		Order order = this.orderRepository.findById(orderNumber);
		model.addAttribute("order", order);
		
	return "redirect:/serviceman/updateOrder/"+orderNumber;
	
	}
	@GetMapping("/updateOrder/{orderNumber}")
	public String updateOrder(@PathVariable long orderNumber, Model model, Model model1) {
		Order order = this.orderRepository.findById(orderNumber);
		Device device = order.getDevice();
		List<Order> orders = orderRepository.findByDevice(device);
		model1.addAttribute("orders", orders);
		model.addAttribute("order", order);
		return "orderDetails";
	}

	@PostMapping("/updateOrder/{orderNumber}")
	public String updateOrderPost(@PathVariable long orderNumber,
								  @RequestParam String repairDescription,
								  @RequestParam String statusType,
								  @RequestParam Date dateOfRepair,
								  @RequestParam double amountOfWorkHours,
								  Model model) {
			
		Order order = this.orderRepository.findById(orderNumber);
		model.addAttribute("order", new Order());


		order.setRepairDescription(repairDescription);
		order.setStatusType(statusType);
		order.setDateOfRepair(dateOfRepair);
		order.setAmountOfWorkHours(amountOfWorkHours);
		orderRepository.saveAndFlush(order);
		
	return "editOrderPlacement";
	
	}
	
	@ModelAttribute("statusType")
	public List<StatusType> getStatusType() {
		return this.statusRepository.findAll();
		
	}
}
