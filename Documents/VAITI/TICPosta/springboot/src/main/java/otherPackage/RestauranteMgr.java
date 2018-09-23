package otherPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import otherPackage.exceptions.ResAlreadyExistsException;

@Service
public class RestauranteMgr {
	
	@Autowired
	private RestauranteRepository repository;
	
	public void addRestaurante(Integer id, String nombre, String barrio) throws ResAlreadyExistsException{
		Restaurante res=new Restaurante(id, nombre, barrio);
		if(repository.findById(id)!=null) {
			throw new ResAlreadyExistsException();
		}
		repository.save(res);
	}

}
