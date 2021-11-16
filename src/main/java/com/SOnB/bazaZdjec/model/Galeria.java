package com.SOnB.bazaZdjec.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Galeria {
    @Id
    @GeneratedValue
    private long id_Galerii;
    private String nazwa;
    @OneToMany(targetEntity = Zdjecie.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Zdj_Gal_fk", referencedColumnName = "id_Galerii")
    private List<Zdjecie> zdjecia;

    public long getId_Galerii() {
        return id_Galerii;
    }

    public void setId_Galerii(long id_Galerii) {
        this.id_Galerii = id_Galerii;
    }




    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getData_utworzenia() {
        return Data_utworzenia;
    }

    public void setData_utworzenia(Date data_utworzenia) {
        Data_utworzenia = data_utworzenia;
    }

    private Date Data_utworzenia;

    public Galeria(String nazwa, Date data_utworzenia) {
        this.nazwa = nazwa;
        Data_utworzenia = data_utworzenia;
    }
}
