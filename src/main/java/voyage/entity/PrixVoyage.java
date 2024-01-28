package voyage.entity;


 import javax.persistence.Entity;
 
 import java.time.LocalDateTime;
 import javax.persistence.Id;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import  lombok.Data;
 import lombok.NoArgsConstructor;
 import voyage.enumeration.TypeWagon;


@Entity
@Data
@NoArgsConstructor
public class PrixVoyage{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	 
	private boolean  active;
	private LocalDateTime dateCreation;
	private LocalDateTime dateFin;
    private	Double prix;
	private TypeWagon typeWagon;
	
	
	
}