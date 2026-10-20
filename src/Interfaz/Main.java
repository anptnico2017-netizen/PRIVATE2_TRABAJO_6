package Interfaz;
public class Main {
    static void main() {
        Automatizacion sensor1 = new Automatizacion();
        Automatizacion sensor2 = new Automatizacion();
        sensor1.nombre="Detecta";
        sensor1.tipo="1";
        sensor1.lectura=12.3;
        sensor1.mostrarInformacion();
        sensor1.mostrarLectura();
    }
}
