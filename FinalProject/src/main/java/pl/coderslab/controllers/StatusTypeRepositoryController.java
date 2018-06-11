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
//import org.springframework.web.bind.annotation.ResponseBody;
//import pl.coderslab.entity.StatusType;
//import pl.coderslab.repository.StatusTypeRepository;
//
//@Controller
//@RequestMapping("/statusType")
//public class StatusTypeRepositoryController {
//
//	@Autowired
//	private StatusTypeRepository statusTypeRepository;
//	
//	@GetMapping("/statusTypeAddForm")
//	//@ResponseBody
//		public String statusTypeAddForm (Model model) {
//			model.addAttribute("statusType", new StatusType());
////			DeviceType deviceType1 = new DeviceType(deviceType);
////			deviceTypeRepository.saveAndFlush(deviceType1);
//			return "statusTypeAddForm";
//		}
//		
////	StatusType status1 = new StatusType("Przyjety");
////	StatusType status2 = new StatusType("W naprawie");
////	StatusType status3 = new StatusType("Naprawiony");
////	StatusType status4 = new StatusType("Rezygnacja");
////	statusTypeRepository.saveAndFlush(status1);
////	statusTypeRepository.saveAndFlush(status2);
////	statusTypeRepository.saveAndFlush(status3);
////	statusTypeRepository.saveAndFlush(status4);
////	return "Statusy dodane";
//
//	
//	@PostMapping("/statusTypeAddForm")
//	//@ResponseBody
//	public String statusTypeAddForm(@RequestParam String statusTypeName, Model model) {
//		
//		StatusType statusType = new StatusType(statusTypeName);
//				statusTypeRepository.saveAndFlush(statusType);
//		List<StatusType> statusTypeList = new ArrayList<StatusType>();
//		statusTypeList.add(statusType);	 
//		model.addAttribute("statusType", statusTypeList);
//		
//		return "statusTypeList";
//	
//	}
////	@GetMapping("/addStatusType/{statusType}")
////	@ResponseBody
////	public String addStatusType(@PathVariable String statusType) {		
////	StatusType status = new StatusType(statusType);
////	statusTypeRepository.saveAndFlush(status);
////	return "Status dodany";	
////	}
//	
////	@GetMapping("/delete/{statusType}")
////	@ResponseBody
////	public String deleteStatusType(@PathVariable String statusType) {
////	statusTypeRepository.delete(statusType);
////	return "Status dodany";
////	
////	}
//	
//	@GetMapping("/all")
//	//@ResponseBody
//	public String showAllStatusType(Model model) {
//		List<StatusType> statusTypes = this.statusTypeRepository.findAll();
//		model.addAttribute("statusTypes", statusTypes);
//		return "statusTypeList";
//	}
//	
//}

package pl.coderslab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.StatusType;
import pl.coderslab.repository.StatusTypeRepository;

@Controller
@RequestMapping("/statusType")
public class StatusTypeRepositoryController {

	@Autowired
	private StatusTypeRepository statusTypeRepository;
	
	@GetMapping("/addAutomaticallyStatusTypes")
	@ResponseBody
	public String addAutomaticallyStatusTypes() {		
	StatusType status1 = new StatusType("Przyjety");
	StatusType status2 = new StatusType("W naprawie");
	StatusType status3 = new StatusType("Naprawiony");
	StatusType status4 = new StatusType("Rezygnacja");
	statusTypeRepository.saveAndFlush(status1);
	statusTypeRepository.saveAndFlush(status2);
	statusTypeRepository.saveAndFlush(status3);
	statusTypeRepository.saveAndFlush(status4);
	return "Statusy dodane";

	}
	
	@GetMapping("/addStatusType/{statusType}")
	@ResponseBody
	public String addStatusType(@PathVariable String statusType) {		
	StatusType status = new StatusType(statusType);
	statusTypeRepository.saveAndFlush(status);
	return "Status dodany";	
	}
	
//	@GetMapping("/delete/{statusType}")
//	@ResponseBody
//	public String deleteStatusType(@PathVariable String statusType) {
//	statusTypeRepository.delete(statusType);
//	return "Status dodany";
//	
//	}
	
	@GetMapping("/all")
	@ResponseBody
	public List<StatusType> showAll(Model model) {
		List<StatusType> statusList = this.statusTypeRepository.findAll();
		return statusList;
	}
	
}
