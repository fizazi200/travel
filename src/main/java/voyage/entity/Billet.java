package voyage.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import voyage.entity.Passenger;
import  voyage.enumeration.TypeWagon;


@Entity
@Data
@NoArgsConstructor
public class Billet{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String reference;
	private Double prix;
	private LocalDate dateAchat;
	
	private TypeWagon typeWagon;
	
	@ManyToOne
	@JoinColumn(name="id_passenger")
	private Passenger passenger;
	
}