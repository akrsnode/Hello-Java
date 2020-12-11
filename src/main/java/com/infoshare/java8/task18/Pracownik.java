package com.infoshare.java8.task18;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private int staz;
    private int wiek;
    private Stanowisko stanowisko;

    public Pracownik(String imie, String nazwisko, int staz, int wiek, Stanowisko stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.staz = staz;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getStaz() {
        return staz;
    }

    public int getWiek() {
        return wiek;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
