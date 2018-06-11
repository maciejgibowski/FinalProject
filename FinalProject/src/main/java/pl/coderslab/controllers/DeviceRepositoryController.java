package pl.coderslab.controllers;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Device;
import pl.coderslab.entity.DeviceType;
import pl.coderslab.entity.Worker;
import pl.coderslab.repository.CustomerRepository;
import pl.coderslab.repository.DeviceRepository;
import pl.coderslab.repository.DeviceTypeRepository;

@Controller
@RequestMapping("/device")
public class DeviceRepositoryController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private DeviceTypeRepository deviceTypeRepository;

	@GetMapping("/deviceAddForm/{customer_id}")
	public String saveDeviceByCustomerId(@PathVariable long customer_id, Model model, Model model1) {
		
		Customer customer = this.customerRepository.findById(customer_id);	
		List<Device> devices = this.deviceRepository.findByCustomer(customer);
		model1.addAttribute("devices", devices);
		
		model.addAttribute("device", new Device());
		return "deviceAddForm";
	}

	
	@PostMapping("/deviceAddForm/{customer_id}")
	public String formPost(@PathVariable long customer_id, @Valid Device device, BindingResult result) {
		if (result.hasErrors()) {
			return "niedodane";
		}
		Customer customer = this.customerRepository.findById(customer_id);
		device.setCustomer(customer);
		
		deviceRepository.saveAndFlush(device);
		return "redirect:/device/deviceAddForm/{customer_id}";
	}
	

//	@GetMapping("/delete/{id}")
//	@ResponseBody
//	public String deleteDevice(@PathVariable long id) {
//		deviceRepository.delete(id);
//		return "Urządzenie zostało usunięte";
//	}
	
	
	
	
	@ModelAttribute("deviceType")
	public List<DeviceType> getDeviceType() {
		return this.deviceTypeRepository.findAll();
	}
	
}
