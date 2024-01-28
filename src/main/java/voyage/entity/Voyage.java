
package voyage.entity;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.CascadeType;

import voyage.entity.Billet;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Voyage{
																				 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ville;
	private LocalDateTime dateDepart;
	private LocalDateTime dateArrive;
	
	@OneToMany(mappedBy="Voyage",cascade=CascadeType.ALL)
    private List<Billet> billets;
	
}