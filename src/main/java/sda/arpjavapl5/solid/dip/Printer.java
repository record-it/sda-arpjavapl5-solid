package sda.arpjavapl5.solid.dip;

//Interfejs drukarki definiuje zachowanie wszystkich drukarek
//a każda implementacja zajmuje się niskopoziomowymi szczegółami
public interface Printer {
    void print(String string);

    void configure(double resolution);
}
