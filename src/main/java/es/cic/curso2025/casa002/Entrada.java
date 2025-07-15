package es.cic.curso2025.casa002;

import org.springframework.stereotype.Component;

@Component
public class Entrada {

    private long id;

    private int numeroDeAsiento;

    private int numeroDeFila;

    private String nombreDeCliente;

    private String partido;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(int numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public int getNumeroDeFila() {
        return numeroDeFila;
    }

    public void setNumeroDeFila(int numeroDeFila) {
        this.numeroDeFila = numeroDeFila;
    }


    public String getNombreDeCliente() {
        return nombreDeCliente;
    }

    public void setNombreDeCliente(String nombreDeCliente) {
        this.nombreDeCliente = nombreDeCliente;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
