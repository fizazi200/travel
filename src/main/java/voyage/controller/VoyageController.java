package voyage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import voyage.entity.Voyage;
import voyage.exception.NotImplementedException;

@RestController
@RequestMapping("/voyage")
public class VoyageController{
	
	
	@GetMapping("/voyages")
	public Voyage afficherHoraireTrain(){
		
		  
		        throw new NotImplementedException("La méthode afficherHoraireTrain n'est pas encore implémentée.");

		
	}
	
	
	@PostMapping("/saveVoyage")
	public Voyage saveVoyage(@RequestBody Voyage voyage){
		
				 throw new NotImplementedException("La méthode saveVoyage n'est pas encore implémentée.");

		
	}
	
	@PutMapping("/updateVoyage")
	public void updateVoyage(@RequestBody Voyage oldvoyage){
		
				 throw new NotImplementedException("La méthode  n'est pas encore implémentée.");

		
	}
	
	@DeleteMapping("/supVoyage/{id}")
	public void supprimerVoyage(@PathVariable Long id){
	
	    		 throw new NotImplementedException("La méthode supprimerVoyage n'est pas encore implémentée.");

	
}
}