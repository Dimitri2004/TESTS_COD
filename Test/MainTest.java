import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest{
    @Test
    @DisplayName("comprobarDNI")
    public void testComprobarDNI(){
        //Comprobamos que cualquier DNI con cualquier letra es correcto

        assertTrue(Main.comprobarDNI("00000000",'T'));
        assertTrue(Main.comprobarDNI("00000001",'R'));
        assertTrue(Main.comprobarDNI("00000002",'W'));
        assertTrue(Main.comprobarDNI("00000003",'A'));
        assertTrue(Main.comprobarDNI("00000004",'G'));
        assertTrue(Main.comprobarDNI("00000005",'M'));
        assertTrue(Main.comprobarDNI("00000006",'Y'));
        assertTrue(Main.comprobarDNI("00000007",'F'));
        assertTrue(Main.comprobarDNI("00000008",'P'));
        assertTrue(Main.comprobarDNI("00000009",'D'));
        assertTrue(Main.comprobarDNI("00000010",'X'));
        assertTrue(Main.comprobarDNI("00000011",'B'));
        assertTrue(Main.comprobarDNI("00000012",'N'));
        assertTrue(Main.comprobarDNI("00000013",'J'));
        assertTrue(Main.comprobarDNI("00000014",'Z'));
        assertTrue(Main.comprobarDNI("00000015",'Q'));
        assertTrue(Main.comprobarDNI("00000016",'S'));
        assertTrue(Main.comprobarDNI("00000017",'V'));
        assertTrue(Main.comprobarDNI("00000018",'H'));
        assertTrue(Main.comprobarDNI("00000019",'L'));
        assertTrue(Main.comprobarDNI("00000020",'C'));
        assertTrue(Main.comprobarDNI("00000021",'K'));
        assertTrue(Main.comprobarDNI("00000022",'E'));

    }
    @Test
    @DisplayName("calcularLetraDNI")
    public void testcomprobarLetraDNI(){
        //al calcular la letra del dni ver que el dni no es mayor que 8
        assertEquals('T',Main.calcularLetraDNI("00000000"));
        assertEquals('R',Main.calcularLetraDNI("00000001"));
        assertEquals('W',Main.calcularLetraDNI("00000002"));
        assertEquals('A',Main.calcularLetraDNI("00000003"));
        assertEquals('G',Main.calcularLetraDNI("00000004"));
        assertEquals('M',Main.calcularLetraDNI("00000005"));
        assertEquals('Y',Main.calcularLetraDNI("00000006"));
        assertEquals('F',Main.calcularLetraDNI("00000007"));
        assertEquals('P',Main.calcularLetraDNI("00000008"));
        assertEquals('D',Main.calcularLetraDNI("00000009"));
        assertEquals('X',Main.calcularLetraDNI("00000010"));
        assertEquals('B',Main.calcularLetraDNI("00000011"));
        assertEquals('N',Main.calcularLetraDNI("00000012"));
        assertEquals('J',Main.calcularLetraDNI("00000013"));
        assertEquals('Z',Main.calcularLetraDNI("00000014"));
        assertEquals('Q',Main.calcularLetraDNI("00000015"));
        assertEquals('S',Main.calcularLetraDNI("00000016"));
        assertEquals('V',Main.calcularLetraDNI("00000017"));
        assertEquals('H',Main.calcularLetraDNI("00000018"));
        assertEquals('L',Main.calcularLetraDNI("00000019"));
        assertEquals('C',Main.calcularLetraDNI("00000020"));
        assertEquals('K',Main.calcularLetraDNI("00000021"));
        assertEquals('E',Main.calcularLetraDNI("00000022"));

    }





}
