package es.cic.curso2025.casa002;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EntradaControlledTest {

    // Permitimos con  Spring  la antoacion @autowired utilizar los metodos de EntradaController
	@Autowired
	EntradaController entradaController;

    // Comprobamos si funciona 
	@Test
	void contextLoads() {
	long resultadoId = entradaController.create(null);
	assertTrue(resultadoId>0);
	}
}
