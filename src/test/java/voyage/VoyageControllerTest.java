
package voyage;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.http.MediaType;

import voyage.exception.NotImplementedException;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import com.fasterxml.jackson.databind.ObjectMapper;
import voyage.entity.Voyage;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class VoyageControllerTest{
	
	
	 @Autowired
    private MockMvc mockMvc;
	
	@Autowired
   private ObjectMapper objectMapper;
	
	@Test
    public void testAfficherHoraireTrain() throws Exception {
        mockMvc.perform(get("/voyage/voyages"))
	                   .andExpect(status().isNotImplemented())
					   .andExpect(result -> assertTrue(result.getResolvedException() instanceof NotImplementedException))
                       .andExpect(result -> assertEquals("La méthode afficherHoraireTrain n'est pas encore implémentée.", result.getResolvedException().getMessage()));
    }
	
	@Test
	public void testSaveVoyage() throws Exception{
		Voyage requestBody = new Voyage(); 
		String st=objectMapper.writeValueAsString(requestBody);
		
		byte[] requestBod=st.getBytes();
		mockMvc.perform(post("/voyage/saveVoyage").content(st).contentType(MediaType.APPLICATION_JSON))
		               .andExpect(status().isNotImplemented())
				
					   .andExpect(result-> assertTrue(result.getResolvedException() instanceof NotImplementedException))
					   .andExpect(result-> assertEquals("La méthode saveVoyage n'est pas encore implémentée.",result.getResolvedException().getMessage()));
		
		
	}
	
	@Test
	public void testUpdateVoyage() throws Exception{
		Voyage requestBody = new Voyage(); 
		String st=objectMapper.writeValueAsString(requestBody);
      byte[] requestBod=st.getBytes();
		mockMvc.perform(put("/voyage/updateVoyage").content(st).contentType(MediaType.APPLICATION_JSON))
		      .andExpect(status().isNotImplemented())
			 
			  .andExpect(result-> assertTrue(result.getResolvedException() instanceof NotImplementedException))
			  .andExpect(result-> assertEquals("La méthode  n'est pas encore implémentée.",result.getResolvedException().getMessage()));
	}
	
	@Test
	public void testDeleteVoyage() throws Exception{
		Long idParam=2L;
		String strNumber = String.valueOf(idParam);
		mockMvc.perform(delete("/voyage/supVoyage/{id}",strNumber))
		      .andExpect(status().isNotImplemented())
			  .andExpect(result-> assertTrue(result.getResolvedException() instanceof NotImplementedException))
			  .andExpect(result-> assertEquals("La méthode supprimerVoyage n'est pas encore implémentée.",result.getResolvedException().getMessage()));
	}
}