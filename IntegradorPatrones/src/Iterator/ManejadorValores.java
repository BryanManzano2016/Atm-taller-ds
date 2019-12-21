 
package Iterator;

public class ManejadorValores {
    protected int monto;
    protected double denominacion;

    public ManejadorValores(int monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }
    
    public int getMonto(){ return monto; }
    
    public void setMonto(int monto){ this.monto = monto; }

    public boolean retirar(int monto){
        // Implementar
        return false;
    }

    public double getDenominacion(){ return denominacion; }

    public boolean depositar(int monto, double denominacion){
        // Implementar
        return false;
    }
}