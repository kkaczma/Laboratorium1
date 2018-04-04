package com.company;

import java.io.PrintStream;

public class PunktMaterialny {


    public double masa;

    PunktMaterialny()   //Konstruktor domyślny
    {
        masa = 2;
    }

    PunktMaterialny(double m) //Konstruktor z parametrem
    {
        masa = m;
    }

    public double moment() //Obliczanie momentu głównego bez parametru
    {
        return 0;
    }

    public double Steinera(double d) //Obliczenie momentu z twierdzenia Steinera
    {
        return moment() + masa * d * d;
    }

    public void opis1()  // Wyświetlenie danych pierwszego elementu
    {
        System.out.printf("Masa pierwszego obiektu wynosi "+masa);
        System.out.printf(", jego główny moment bezwładności "+moment());
        System.out.printf(", natomiast z twierdzenia Steinera "+Steinera(4));
        System.out.printf("\n");

    }

    public void opis2() //Wyswietlenie danych drugiego obiektu
    {
        System.out.printf("Masa drugiego obiektu wynosi "+masa);
        System.out.printf(", jego główny moment bezwładności "+moment());
        System.out.printf(", natomiast z twierdzenia Steinera "+Steinera(6));
        System.out.printf("\n");
    }

    void akceMasa(double c)  //Akcesor zmienia wartość zmiennej masa
    {
        masa = c;
    }

    public void opis3() //Wyświetlenie na konsoli informacji z wykorzystaniem pętli
    {
        for (int i = 0; i < 6; i++) {
            int tablica_obiekty[] = {4, 6, 9, 10, 12, 16};
            masa = tablica_obiekty[i];
            System.out.print("Masa obiektu nr."+(i+1));
            System.out.printf(" wynosi "+masa);
            System.out.printf(", jego główny moment bezwładności "+moment());
            System.out.printf(", natomiast z twierdzenia Steinera "+Steinera(6));
            System.out.printf("\n");
        }
    }

}
