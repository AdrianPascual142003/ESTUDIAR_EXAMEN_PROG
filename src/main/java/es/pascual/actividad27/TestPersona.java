package es.pascual.actividad27;

import java.time.LocalDate;

public class TestPersona {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2003,02,14);

        Persona persona = new Persona("Adrian", "Pascual", localDate, "adrianpascual142003@gmail.com", "601228758", "paco1234","");

        System.out.println(persona.getAge());

        System.out.println(persona.isNewUser());

    }

}
