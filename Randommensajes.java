/*
Alumno: Luis Jair Acevedo Rubio
Matrícula: 360777
*/
import java.util.Random;

public class Randommensajes {
    public static void main(String[] args) {
        String[] mensajes = {
                "Hey, este es un mensaje random de una pequeña aplicación",
                "Hoy un lector, mañana un líder.",
                "La educación es el arma más poderosa que puedes usar para cambiar el mundo.",
                "La educación no es la respuesta a la pregunta.",
                "Enseñar es aprender dos veces.",
                "Todo aprendizaje tiene una base emocional."
        };

        Random random = new Random();
        int indice = random.nextInt(mensajes.length);

        System.out.println(mensajes[indice]);
    }
}
