package otherPackage;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Restaurante {
	@Id
	private Integer Id;
	private String Nombre;
	private String Barrio;
	
	public Restaurante(Integer id, String nombre, String barrio) {
		super();
		Id = id;
		Nombre = nombre;
		Barrio = barrio;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getBarrio() {
		return Barrio;
	}
	public void setBarrio(String barrio) {
		Barrio = barrio;
	}

}
