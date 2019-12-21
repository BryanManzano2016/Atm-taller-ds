 
package Iterator;

public class ManejadorValores{
    protected int monto;
    protected double denominacion;

    public ManejadorValores(int monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }
    
    public int getMonto(){ return this.monto; }
    
    public void setMonto(int monto){ this.monto = monto; }

    public boolean retirar(int montoA){
        if (this.monto - montoA >= 0) {
            this.monto -= this.monto;
            return true;
        }
        return false;
    }

    public double getDenominacion(){ return this.denominacion; }

    public void depositar(int monto){
        this.monto += monto;
    }

    @Override
    public String toString() {
        return "ManejadorValores{" + "monto=" + this.monto + ", denominacion=" + this.denominacion + '}';
    }
    
}