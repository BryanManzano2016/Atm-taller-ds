 
package chainOfResponsability;

public class ManejadorBilletes implements ManejadorInterface {
    protected int monto;
    protected int denominacion;

    public ManejadorBilletes(int monto, int denominacion){
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

    public int getDenominacion(){ return denominacion; }

    public boolean depositar(int monto, int denominacion){
        // Implementar
        return false;
    }
}