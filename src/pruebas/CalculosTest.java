package pruebas;

import logica.Parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculosTest {
	
	@Test
    public void testPotenciaExponentePositivo() {
        Parcial parcial = new Parcial();
        assertEquals(8, parcial.potencia(2, 3));
        assertEquals(1, parcial.potencia(5, 0));
        assertEquals(1, parcial.potencia(1, 100));
        assertEquals(0, parcial.potencia(0, 10));
    }

    @Test
    public void testPotenciaExponenteNegativo() {
        Parcial parcial = new Parcial();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.potencia(2, -3);
        });
        assertEquals("El exponente debe ser un número entero no negativo.", exception.getMessage());
    }

    @Test
    public void testPotenciaDesbordamiento() {
        Parcial parcial = new Parcial();
        assertEquals(Integer.MAX_VALUE, parcial.potencia(2, 31));
        assertEquals(Integer.MAX_VALUE, parcial.potencia(10, 9));
    }

}
