package com.SOnB.bazaZdjec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Zdjecie {
    @Id
    @GeneratedValue
    private long id_Zdjecia;
    private String nazwa;
    private String format;
    private String rozmiar;
    private Date data_Utworzenia;

    public Zdjecie(String nazwa, String format, String rozmiar, Date data_utworzenia) {
        this.nazwa = nazwa;
        this.format = format;
        this.rozmiar = rozmiar;
        data_Utworzenia = data_utworzenia;
    }

    public long getId_Zdjecia() {
        return id_Zdjecia;
    }

    public void setId_Zdjecia(long id_Zdjecia) {
        this.id_Zdjecia = id_Zdjecia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public Date getData_Utworzenia() {
        return data_Utworzenia;
    }

    public void setData_Utworzenia(Date data_Utworzenia) {
        this.data_Utworzenia = data_Utworzenia;
    }
}
