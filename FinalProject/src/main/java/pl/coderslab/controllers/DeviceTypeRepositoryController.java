//package pl.coderslab.controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import pl.coderslab.entity.DevicesType;
//import pl.coderslab.repository.DevicesTypeRepository;
//
//@Controller
//@RequestMapping("/devicesType")
//public class DevicesTypeRepositoryController {
//
//	@Autowired
//	private DevicesTypeRepository devicesTypeRepository;
//
//	@GetMapping("/devicesTypeAddForm")
//	//@ResponseBody
//	public String devicesTypeAddForm(Model model) {
//		model.addAttribute("devicesType", new DevicesType());
////		DeviceType deviceType1 = new DeviceType(deviceType);
////		deviceTypeRepository.saveAndFlush(deviceType1);
//		return "devicesTypeAddForm";
//	}
//
//	@PostMapping("/devicesTypeAddForm")
//	//@ResponseBody
//	public String devicesTypeAddForm(@RequestParam String deviceTypeName, Model model) {
//		
//		DevicesType devicesType = new DevicesType(deviceTypeName);
//				devicesTypeRepository.saveAndFlush(devicesType);
//		List<DevicesType> devicesTypeList = new ArrayList<DevicesType>();
//		devicesTypeList.add(devicesType);	 
//		model.addAttribute("devicesType", devicesTypeList);
//		
//		return "devicesTypeList";
//		
//				
////		DeviceType deviceType1 = new DeviceType("Laptop");
////		DeviceType deviceType2 = new DeviceType("RTV");
////		DeviceType deviceType3 = new DeviceType("AGD");
////		DeviceType deviceType4 = new DeviceType("Komputer PC");
////		DeviceType deviceType5 = new DeviceType("Smartfon");
////		deviceTypeRepository.saveAndFlush(deviceType1);
////		deviceTypeRepository.saveAndFlush(deviceType2);
////		deviceTypeRepository.saveAndFlush(deviceType3);
////		deviceTypeRepository.saveAndFlush(deviceType4);
////		deviceTypeRepository.saveAndFlush(deviceType5);
////		return "DeviceTypes dodane";
//	}
//}

package pl.coderslab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.DeviceType;
import pl.coderslab.repository.DeviceTypeRepository;



@Controller
@RequestMapping("/deviceType")
public class DeviceTypeRepositoryController {

	@Autowired
	private DeviceTypeRepository deviceTypeRepository;

	@GetMapping("/addDeviceType/{deviceType}")
	@ResponseBody
	public String addCustomer(@PathVariable String deviceType) {

		DeviceType deviceType1 = new DeviceType(deviceType);
		deviceTypeRepository.saveAndFlush(deviceType1);
		return "Rodzaj urządzenia dodany";
	}

	@GetMapping("/addAutomaticallyDeviceTypes")
	@ResponseBody
	public String addAutomaticallyStatusTypes() {
		DeviceType deviceType1 = new DeviceType("Laptop");
		DeviceType deviceType2 = new DeviceType("RTV");
		DeviceType deviceType3 = new DeviceType("AGD");
		DeviceType deviceType4 = new DeviceType("Komputer PC");
		DeviceType deviceType5 = new DeviceType("Smartfon");
		deviceTypeRepository.saveAndFlush(deviceType1);
		deviceTypeRepository.saveAndFlush(deviceType2);
		deviceTypeRepository.saveAndFlush(deviceType3);
		deviceTypeRepository.saveAndFlush(deviceType4);
		deviceTypeRepository.saveAndFlush(deviceType5);
		return "DeviceTypes dodane";
	}
}
