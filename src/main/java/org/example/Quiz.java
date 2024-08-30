package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Quiz {
    private List<Pregunta> preguntas;
    private Scanner scanner;

    public Quiz() {
        preguntas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public void iniciar() {
        int puntaje = 0;

        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getPrgunta());
            String[] opciones = pregunta.getOpciones();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ": " + opciones[i]);
            }

            System.out.print("Elige una opción (1-" + opciones.length + "): ");
            int respuesta = scanner.nextInt() - 1;

            if (pregunta.esRespuestaCorrecta(respuesta)) {
                System.out.println("¡Respuesta correcta!");
                puntaje++;
            } else {
                System.out.println("Respuesta incorrecta. La respuesta correcta era: " + (pregunta.getRespuesta()));
            }
            System.out.println();
        }

        System.out.println("Tu puntaje final es: " + puntaje + "/" + preguntas.size());
    }
}



