package org.example;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();


        Pregunta pregunta1 = new Pregunta(
                "¿Cuál es la capital de Francia?",
                new String[]{"Berlín", "Madrid", "París", "Roma"},
                2 // La respuesta correcta es la opción 2 (París)
        );

        Pregunta pregunta2 = new Pregunta(
                "¿Cuál es el color del cielo en un día despejado?",
                new String[]{"Verde", "Rojo", "Azul", "Amarillo"},
                2 // La respuesta correcta es la opción 2 (Azul)
        );


        quiz.agregarPregunta(pregunta1);
        quiz.agregarPregunta(pregunta2);


        quiz.iniciar();
    }

}