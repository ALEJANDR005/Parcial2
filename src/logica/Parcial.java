package logica;

public class Parcial {
    
	public int potencia(int b, int e) {
        if (e < 0) {
            throw new IllegalArgumentException("El exponente debe ser un número entero no negativo.");
        } else if (b == 0 && e == 0) {
            throw new IllegalArgumentException("La base y el exponente no pueden ser ambos 0.");
        } else if (e == 0) {
            return 1; 
        } else {
            return calcularPotencia(b, e);
        }
    }

    private int calcularPotencia(int b, int e) {
        try {
            long resultado = 1; 
            for (int i = 0; i < e; i++) {
                resultado *= b;
                if (resultado > Integer.MAX_VALUE) {
                    throw new ArithmeticException("Desbordamiento de enteros al calcular la potencia.");
                }
            }
            return (int) resultado;
        } catch (ArithmeticException ex) {        
            throw new ArithmeticException("Desbordamiento de enteros al calcular la potencia.");
        }
    }

}
