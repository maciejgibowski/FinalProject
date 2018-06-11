package pl.coderslab.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.Worker;
import pl.coderslab.repository.WorkerRepository;

@Controller
@RequestMapping("/worker")
public class WorkerRepositoryController {

	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping("/add/{firstName}/{lastName}/{phoneNumber}/{email}/{workHourCost}")
	@ResponseBody
	public String addWorker(@PathVariable String firstName, @PathVariable String lastName,
							@PathVariable String phoneNumber, @PathVariable String email,
							@PathVariable double workHourCost) {
			
	Worker worker = new Worker(firstName, lastName, phoneNumber, email, workHourCost);
	workerRepository.saveAndFlush(worker);
	return "Pracownik dodany";
}
	
	@GetMapping("/workerAddForm")
	public String WorkerAddFormGet(Model model) {
		model.addAttribute("worker", new Worker());
		return "workerAddForm";
	}
	
	@PostMapping("/workerAddForm")
	public String WorkerAddFormPost(@RequestParam String firstName, 
									@RequestParam String lastName,
									@RequestParam String phoneNumber, 
									@RequestParam String email, 
									@RequestParam double workHourCost, 
									Model model) {
		
		Worker worker = new Worker(firstName, lastName, phoneNumber, email, workHourCost);
		workerRepository.saveAndFlush(worker);
		
		List<Worker> workersList = new ArrayList<Worker>();
		workersList.add(worker);	 
		model.addAttribute("workers", workersList);
		
		/*return "controlPanel";*/ return "workersList";
	}
	
	@GetMapping("/workerEditForm/{workerid}")
	public String WorkerEditFormGet(Model model) {
		model.addAttribute("workers", new Worker());
		return "workerEditForm";
	}
	
	@PostMapping("/workerEditForm/{workerid}")
	public String WorkerEditForm (@PathVariable  long workerid,
								  @RequestParam String firstName, 
								  @RequestParam String lastName,
								  @RequestParam String phoneNumber, 
								  @RequestParam String email, 
								  @RequestParam double workHourCost, 
								  Model model) {

		Worker worker = this.workerRepository.findById(workerid);
		
	worker.setFirstName(firstName);
	worker.setLastName(lastName);
	worker.setPhoneNumber(phoneNumber);
	worker.setEmail(email);
	worker.setWorkHourCost(workHourCost);
	workerRepository.saveAndFlush(worker);
			
		List<Worker> workerList = new ArrayList<Worker>();
		workerList.add(worker);	 
		model.addAttribute("workers", workerList);
		
		return "workersList";	
	}

	@GetMapping("/delete/{id}")
	@ResponseBody
	public String deleteWorker(@PathVariable long id) {
		workerRepository.delete(id);
		return "Usunięto wybranego pracownika";
	}
	
	
	@GetMapping("/workersList")
	public String WorkersList(Model model) {
		List<Worker> workersList = this.workerRepository.findAll();
		model.addAttribute("workersList", workersList);
		return "workersList";
	}
}
