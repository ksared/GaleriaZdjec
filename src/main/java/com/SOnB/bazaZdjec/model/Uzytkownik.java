package com.SOnB.bazaZdjec.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Uzytkownika;
    private String nazwa;
    private String haslo;
    private String email;
    @OneToMany(targetEntity = Galeria.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "gal_fk", referencedColumnName = "id_Uzytkownika")
    private List<Galeria> galerie;

    public Long getID_Uzytkownika() {
        return id_Uzytkownika;
    }

    public void setID_Uzytkownika(Long ID_Uzytkownika) {
        this.id_Uzytkownika = ID_Uzytkownika;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        nazwa = nazwa;
    }



    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        haslo = haslo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public Uzytkownik(String nazwa, String haslo, String email) {
        nazwa = nazwa;
        haslo = haslo;
        email = email;
    }
}
