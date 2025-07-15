package es.cic.curso2025.casa002;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.TagElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrada")
public class EntradaController {

    // Creamos una variable contador que nos servirá para hacer pruebas, pero no es lo correcto
    private int contador = 0;
    // Aquí asignamos la anotación de Spring autowired que nos 
    // instancia la clase entrada sin necesidad de hacerlo nosotros  
    @Autowired
    private EntradaService entradaService;

    // C R U D
    @PostMapping
    public long create(@RequestBody Entrada entrada){
        long id = entradaService.create(entrada);
        return id;
    }

    // Con esta anotación respondemos un petición HTTP GET de datos por parte del navegador o cliente
    // Creamos un metodo que nos devolvera una lista de objetos
    @GetMapping
    public List<Entrada>get(){

        List<Entrada> resultado = new ArrayList<>();

        // Instanciamos manualmente porque no disponemos de BBDD e introducimos los datos tantos como queramos
        Entrada entrada1 = new Entrada();

        entrada1.setId(1);
        entrada1.setNombreDeCliente("Héctor");
        entrada1.setNumeroDeAsiento(43);
        entrada1.setNumeroDeFila(4);
        entrada1.setPartido("Racing - Eibar");

        resultado.add(entrada1);

        return resultado;


    }

    // El método va a responder a una llamada /telefono/{id}
    // Hacemos un metodo que nos va a devolver un objeto con un id asignado desde la url
    @GetMapping("/{id}")
    public Entrada create(@PathVariable long id){
        Entrada entrada1 = new Entrada();

        entrada1.setNombreDeCliente("Héctor");
        entrada1.setNumeroDeAsiento(43);
        entrada1.setNumeroDeFila(4);
        entrada1.setPartido("Racing - Eibar");

        return entrada1;
    }


    
    @PutMapping
    public void update (@RequestBody Entrada entrada) {
        // TODO
    }

    // Este metodo elimina un objeto por su id recibido por la URL
    // Se necesita BBDD
    @DeleteMapping("{id}")
    public void delete(@PathVariable long id){
        contador = contador;
    }

}
