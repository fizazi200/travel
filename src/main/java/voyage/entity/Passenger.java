package voyage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Date;


import voyage.entity.Billet;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Passenger{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
    private String nom;
    private String prenom;
    private String email;
	private Date dateNaissance;
	
	@Column(nullable = false, unique = true)
	private String tel;
	
	@Column(nullable = false, unique = true)
	private String cin;
	
	@OneToMany(mappedBy="Passenger",cascade=CascadeType.ALL)
	List<Billet> billets;
}