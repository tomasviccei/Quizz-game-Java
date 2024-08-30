package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();



// Pregunta 1
        Pregunta pregunta1 = new Pregunta(
            "¿Qué planeta es conocido como el 'planeta rojo'?",
            new String[]{"Marte", "Júpiter", "Saturno", "Venus"},
            0 // La respuesta correcta es la opción 0 (Marte)
        );

// Pregunta 2
        Pregunta pregunta2 = new Pregunta(
                "¿Cuál es el océano más grande del mundo?",
                new String[]{"Atlántico", "Íntico", "Ártico", "Pacífico"},
                3 // La respuesta correcta es la opción 3 (Pacífico)
        );

// Pregunta 3
        Pregunta pregunta3 = new Pregunta(
                "¿En qué continente se encuentra Egipto?",
                new String[]{"Asia", "Europa", "África", "América"},
                2 // La respuesta correcta es la opción 2 (África)
        );

// Pregunta 4
        Pregunta pregunta4 = new Pregunta(
                "¿Cuál es el metal precioso que se usa comúnmente en joyería y tiene el símbolo químico 'Au'?",
                new String[]{"Plata", "Oro", "Cobre", "Platino"},
                1 // La respuesta correcta es la opción 1 (Oro)
        );

// Pregunta 5
        Pregunta pregunta5 = new Pregunta(
                "¿Quién escribió 'Cien años de soledad'?",
                new String[]{"Gabriel García Márquez", "Mario Vargas Llosa", "Jorge Luis Borges", "Julio Cortázar"},
                0 // La respuesta correcta es la opción 0 (Gabriel García Márquez)
        );

// Pregunta 6
        Pregunta pregunta6 = new Pregunta(
                "¿Qué es el ADN?",
                new String[]{"Ácido desoxirribonucleico", "Ácido ribonucleico", "Proteína", "Carbohidrato"},
                0 // La respuesta correcta es la opción 0 (Ácido desoxirribonucleico)
        );

// Pregunta 7
        Pregunta pregunta7 = new Pregunta(
                "¿Cuál es el proceso por el cual las plantas producen su alimento?",
                new String[]{"Respiración", "Fotosíntesis", "Fermentación", "Digestión"},
                1 // La respuesta correcta es la opción 1 (Fotosíntesis)
        );

// Pregunta 8
        Pregunta pregunta8 = new Pregunta(
                "¿En qué año se llevó a cabo la primera misión tripulada a la Luna?",
                new String[]{"1965", "1969", "1972", "1975"},
                1 // La respuesta correcta es la opción 1 (1969)
        );

// Pregunta 9
        Pregunta pregunta9 = new Pregunta(
                "¿Cuál es el idioma más hablado en el mundo por número de hablantes nativos?",
                new String[]{"Inglés", "Español", "Mandarín", "Hindi"},
                2 // La respuesta correcta es la opción 2 (Mandarín)
        );

// Pregunta 10
        Pregunta pregunta10 = new Pregunta(
                "¿Cuál es la capital de Japón?",
                new String[]{"Seúl", "Beijing", "Tokio", "Bangkok"},
                2 // La respuesta correcta es la opción 2 (Tokio)
        );

        quiz.agregarPregunta(pregunta1);
        quiz.agregarPregunta(pregunta2);
        quiz.agregarPregunta(pregunta3);
        quiz.agregarPregunta(pregunta4);
        quiz.agregarPregunta(pregunta5);
        quiz.agregarPregunta(pregunta6);
        quiz.agregarPregunta(pregunta7);
        quiz.agregarPregunta(pregunta8);
        quiz.agregarPregunta(pregunta9);
        quiz.agregarPregunta(pregunta10);



        quiz.iniciar();
    }

}