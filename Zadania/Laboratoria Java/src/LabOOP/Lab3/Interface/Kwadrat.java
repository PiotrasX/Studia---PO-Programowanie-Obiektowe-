package LabOOP.Lab3.Interface;

// Klasa Kwadrat musi zaimplementować wszystkie metody interfejsu FiguraGeometryczna, ale nic nie stoi na przeszkodzie,
// aby posiadała dodatkowe metody wewnątrz własnej klasy np.: wzór na przekątną.

public class Kwadrat implements FiguraGeometryczna
{
    private double a; // Długość boku

    public Kwadrat() { this.a = 0; }
    public Kwadrat(double a) { this.a = a; }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double pole() { return a*a; }
    public double obwod() { return 4*a; }
}
