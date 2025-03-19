import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    @DisplayName("Test de comprobarDNI")
    public void testComprobarDNI() {
        //caso de prueba 1
        assertTrue(Main.comprobarDNI("00000000", 'T'));
        //caso de prueba 2
        assertFalse(Main.comprobarDNI("00000000", 'R'));
    }
    @Test
    @DisplayName("Test de calcularLetraDNI")
    public void testCalcularLetraDNI() {
        //caso de prueba 1
        assertEquals('T', Main.calcularLetraDNI("00000000"));
        //caso de prueba 2
        assertEquals('R', Main.calcularLetraDNI("00000001"));
    }



}
