package voyage.entity;

 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import  lombok.Data;
 import lombok.NoArgsConstructor;
 import javax.persistence.CascadeType;
 import voyage.entity.Voyage;
 import java.util.List;
 import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
public class Train{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String reference;
	private String capacite;
	private Integer nombreWagon;
	
	
	
	@OneToMany(mappedBy="train",cascade=CascadeType.ALL)
	List<Voyage> voyages;
	
	
	
}