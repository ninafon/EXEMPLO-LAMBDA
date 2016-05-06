
package exemplolambdas;
@FunctionalInterface
public interface ILambdas {
    // interfaz funcional
    public abstract void operacion(int a, int b);
     default void saudo(){
        System.out.println(" saudo dende un metodo default ");
    }
}
