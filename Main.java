package com.company;

public class Main {

    public static void main(String[] args) {
    PunktMaterialny pierwszy =new PunktMaterialny();
    PunktMaterialny drugi =new PunktMaterialny(7);
    BrylaSztywna trzecia =new BrylaSztywna();
    pierwszy.opis1();  //Wyświetlenie wartości pierwszego obiektu
    pierwszy.akceMasa(9);//Zmiana wartości masy
    pierwszy.opis1(); //Wyświetlenie wartości pierwszego obiektu ze zmienioną masą
    drugi.opis2();//Wyświetlenie wartości drugiego obiektu
    pierwszy.opis3();//Wyświetlenie wartości obiektów z tablicy
    trzecia.opis4();//Wyświetlenia wartości dotyczących bryły sztywnej
    }
}
