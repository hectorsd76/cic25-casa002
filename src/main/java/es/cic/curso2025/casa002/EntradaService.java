package es.cic.curso2025.casa002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaService {
    
    // Creo la variable contador que me va a servir para gestionar el incremento del id 
    // Cada vez que se instancie una entrada
    private long contador = 0;

    public long create(Entrada entrada){
            return ++contador;
    }
}
