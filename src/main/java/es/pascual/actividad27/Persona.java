package es.pascual.actividad27;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona {

    private String firstName;

    private String lastName;

    private LocalDate birthDay;

    private String email;

    private String phoneNumber;

    private LocalDateTime createdOn;

    private String password;

    private String salt;

    public Persona(String firstName, String lastName, LocalDate birthDay, String email, String phoneNumber, String password, String salt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.salt = salt;
        createdOn = LocalDateTime.now();
    }

    public int getAge() {
        return LocalDate.now().compareTo(birthDay);
    }

    public boolean isNewUser() {
        return createdOn.compareTo(LocalDateTime.now()) > 15;
    }

}
