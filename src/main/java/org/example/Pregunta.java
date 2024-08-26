package org.example;

public class Pregunta {
    private String prgunta;
    private String[] opciones;
    private int respuesta;

    public Pregunta(String prgunta, String[] opciones, int respuesta) {
        this.prgunta = prgunta;
        this.opciones = opciones;
        this.respuesta = respuesta;
    }

    public String getPrgunta() {
        return prgunta;
    }



    public String[] getOpciones() {
        return opciones;
    }


    public boolean esRespuestaCorrecta(int indice) {
        return indice == respuesta;
    }


    }

