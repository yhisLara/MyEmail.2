package com.example.yhislaraf.myemail;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yhislaraf on 23-05-17.
 */

public class Utils {

    public static String[] colors = new String[]
            {"F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
                    "03A9F4", "009688", "4CAF50", "CDDC39", "FFC107",
                    "FF5722", "795548", "9E9E9E", "455A64", "FF5722"};

    public static List<Email> getDummyData(){
        List<Email> lista = new ArrayList<Email>(){{
            add(new Email("Presupuesto","Estimado,le enviamos nuestro presupuesto para el segundo semestre en el area de informática","ihn@bommi.cl"));
            add(new Email("Nueva Hora","Le recordamos que usted tiene una nueva para la cita dental ","gustavo@cl.df.com"));
            add(new Email("Citación","Le recordamos que se ha cambiado la hora de su cita dental por dia administrativo","gustavo@cl.df.com"));
            add(new Email("Nuevo Mac","Te invitamos a conocer lo nuevo de mac, este sabado en nuestras tiendas del mall","maconline@mac.com"));
            add(new Email("Problemas con app","Hola usuario,te informamos que nuestra appa esta presentando problemas","google@play.com"));
            add(new Email("Boletas validas","Adjunto boletas validas para ser presentadas con el contador el dia vierna a las 09 am. cualquier duda llamar al siguiente numero","ricardo@genius.com"));
            add(new Email("Tickets para validar","Estimado, adunto información de los ticket que necesitan ser regularizados antes del viernes, para ser ejecutados el dia lunes a mas tardar.","renefg@bancochile.cl"));
            add(new Email("Resumen reunión","Señores, a traves del siguiente email,envio el resumen de lo se vio en la reunión del lunes, cualquier duda responder el email con copia a todos.","jgh@colegio.cl"));
            add(new Email("Presupuesto 2017","Estimado,le enviamos nuestro presupuesto para el segundo semestre en el area de informática","tgj@dummi.cl"));
            add(new Email("Archivos delicados","Señores de appcompac, comunico a ustedes que los siguientes archivos adjuntados son de uso confidencial","francog@imb.cl"));
            add(new Email("Documentos para apertura de cuenta","Estimado, informamos a usted que nos encontramos realizando la apertura de la cuenta solicitada, pero necesitams que nos adjunte los siguientes archivos","renef@bancochile.cl"));
            add(new Email("Bienvenido a nuestra pataforma","Hola @lara, te damos la bienvenida a nuestra plataforma de aprendizaje, donde encontraras miles de cursos para ti.","coursera@world.com"));
            add(new Email("Prueba gratuita","Gracias por preferir spotify, desde ahora y hasta 3 meses disfruta de tu cuenta gratuita, sin limite y sin publicidad","spotify@funny.com"));
            add(new Email("Centro de formación","Estimados, queremos informarle que hemos abierto nuevos cursos en crecic, para mayor información respondan este email","soporte@crecic.cl"));
        }};
        return lista;
    }

    public static String getRandomColor() {
        // Número aleatorio entre [0] y [14];
        int randonNumber = new Random().nextInt(colors.length) + 0;
        // Devolvemos el color
        return colors[randonNumber];
    }
}