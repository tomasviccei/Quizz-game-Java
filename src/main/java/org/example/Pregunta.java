package org.example;

public class Pregunta {
    private String pregunta;
    private String[] opciones;
    private int respuesta;

    public Pregunta(String pregunta, String[] opciones, int respuesta) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuesta = respuesta;
    }

    public String getPrgunta() {
        return pregunta;
    }


    public String[] getOpciones() {
        return opciones;
    }


    public boolean esRespuestaCorrecta(int indice) {
        return indice == respuesta;
    }

    public int getRespuesta() {
        if (respuesta == 0)
            return 1;

        return respuesta + 1;
    }
}

