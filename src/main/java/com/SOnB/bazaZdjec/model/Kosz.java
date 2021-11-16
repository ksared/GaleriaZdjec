package com.SOnB.bazaZdjec.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kosz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID_Kosza;
    private String Rozmiar;
    @OneToMany(targetEntity = Zdjecie.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "kosz_zdjecie_fk", referencedColumnName = "ID_Kosza")
    private List<Zdjecie> zdjecia;

    public Kosz(String rozmiar) {
        Rozmiar = rozmiar;
    }

    public long getID_Kosza() {
        return ID_Kosza;
    }

    public void setID_Kosza(long ID_Kosza) {
        this.ID_Kosza = ID_Kosza;
    }

    public String getRozmiar() {
        return Rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        Rozmiar = rozmiar;
    }
}
