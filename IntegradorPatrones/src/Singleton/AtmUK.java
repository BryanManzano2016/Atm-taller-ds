 
package Singleton;

import Iterator.ManejadorValores;
import java.util.LinkedList;
// import java.util.Currency;
// import java.util.Locale;

public class AtmUK {
    // protected final Currency currency=Locale.UK;
    protected double dinero = 0;
    protected LinkedList <ManejadorValores> manejadores; // Cada manejador puede entregar dinero de una sola denominación

    // -----------------
    public AtmUK() {
      manejadores = new LinkedList<>();
    }
    // -----------------
    public double getTotal() {
        return this.dinero;
    }

    // -----------------
    public void sacarDinero(double dinero) {
        this.dinero -= dinero;
        // Todo: realizar el proceso de sacar de cada manejador la cantidad requerida
    }

    // -----------------
    public void ingresarDinero(double dinero) {
        this.dinero += dinero;
        // Todo: Sólo se puede depositar billetes de una sola denominación y agregarse al manejador correspondiente
    }

    public void addManejador(ManejadorValores m){
        manejadores.addLast(m);
    }
    
    public ManejadorValores removeManejador(int i){
        return manejadores.remove(i);
    }
    
    public LinkedList <ManejadorValores> getManejadores(){
        return this.manejadores;
    }
    
    public void cargarDinero(){
        for (ManejadorValores manj: this.getManejadores()) {
            this.dinero += manj.getMonto()*manj.getDenominacion();
        }
    }
}
