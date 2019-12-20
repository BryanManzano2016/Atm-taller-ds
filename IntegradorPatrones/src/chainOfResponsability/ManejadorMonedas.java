 
package chainOfResponsability;

public class ManejadorMonedas implements ManejadorInterface {
    protected int monto;
    protected double denominacion;

    public ManejadorMonedas(int monto, double denominacion){
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }

    @Override
    public int getMonto(){ return monto; }
    @Override
    public void setMonto(int monto){ this.monto = monto; }

    @Override
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