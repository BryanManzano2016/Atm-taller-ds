 
package chainOfResponsability;
 
public interface ManejadorInterface<T> {
    public int getMonto();
    public void setMonto(int monto);
    public boolean retirar(int monto);
}
