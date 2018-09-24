package um.edu.uy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import otherPackage.RestauranteMgr;
import otherPackage.exceptions.ResAlreadyExistsException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MainTests {

	@Autowired
	RestauranteMgr resMgr;

	@Test
	public void RestauranteTest() {
		try {

			// Se agrega un restaurante

			resMgr.addRestaurante(12312, "daniel", "pocitos");

		} catch (ResAlreadyExistsException e) {
			fail();
		}
	}

}
