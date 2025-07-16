package es.cic.curso2025.casa002;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
class Casa002ApplicationTests {

@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	/**
	 Simula entrada de HTTP 
	 */
	@Autowired
	private MockMvc mockMvc;


	
	@Test
	void testEntradaDelete() throws Exception {
		mockMvc
		.perform(delete("/entrada/4"))
		.andDo(print())
		.andExpect(status().isOk())
		.andReturn();

	}

	@Test
	void testLista(){

		ArrayList<String> miLista = new ArrayList<>();
		miLista.add("Hola");
		String mensajeOriginal = miLista.get(0);
	}

}
}
