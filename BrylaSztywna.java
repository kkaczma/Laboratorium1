package com.company;

public class BrylaSztywna
{
    private double m1, m2 , m3;
    private double P1x,P2x,P3x,P1y,P2y,P3y,P1z,P2z,P3z;

    public void setwspolrzedne(double a, double b, double c,double d,double e,
                               double f,double g, double h, double i) //Ustalanie współrzędnych punktów
    {
        P1x=a;
        P1y=b;
        P1z=c;
        P2x=d;
        P2y=e;
        P2z=f;
        P3x=g;
        P3y=h;
        P3z=i;
    }
    public void setMasy(double a, double b, double c)//Ustalanie wartości masy punktów materiału
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public double srodekx()//Obliczenie środka masy względem osi X
    {
        return(P1x*m1+P2x*m2+P3x*m3)/(m1+m2+m3);
    }
    public double srodeky()//Obliczenie środka masy względem osi Y
    {
        return(P1y*m1+P2y*m2+P3y*m3)/(m1+m2+m3);
    }
    public double srodekz()//Obliczenie środka masy względem osi Z
    {
        return(P1z*m1+P2z*m2+P3z*m3)/(m1+m2+m3);
    }
    public double momentx()//Obliczenie momentu bezwładności wzgędem osi X
    {
        return(m1+m2+m3)*srodekx();
    }
    public double momenty()//Obliczenie momentu bezwładności wzgędem osi Y
    {
        return(m1+m2+m3)*srodeky();
    }
    public double momentz()//Obliczenie momentu bezwładności wzgędem osi Z
    {
        return(m1+m2+m3)*srodekz();
    }
    public void opis4()//Wyświetlenie informacji dotyczących bryły sztywnej
    {
        setMasy(2,4,6);
        setwspolrzedne(1,2,3,4,5,6,7,8,9);
        System.out.printf("Srodek masy wzgędem osi X = " +srodekx());
        System.out.printf("\nSrodek masy względem osi Y = "+srodeky());
        System.out.printf("\nSrodek masy względem osi Z = "+srodekz());
        System.out.printf("\nMoment bezwładności względem osi X = "+momentx());
        System.out.printf("\nMoment bezwładności względem osi Y = "+momenty());
        System.out.printf("\nMoment bezwładności wzgledem osi Z = "+momentz()+"\n");
    }

}
