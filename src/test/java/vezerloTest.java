import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class vezerloTest {
    vezerlo vez;

    int[] tomb =  {1, 2, 4, 5, 43, 6, 8, 10};
    int[] tomb1 = {1, 20, 40, 5, 43, 6, 80, 10};
    int[] tombvisszaNagyobb = {43, 6, 8, 10,0,0,0,0};

    int[] tomb0 = {0,0,0,0,0,0,0,0,0,0,};
    int[] tombMinus = {-5,-2,-9,10,18,1,-12,12,-18,-14,};

    @BeforeEach
    void setUp() {
        vez = new vezerlo();
    }

    @AfterEach
    void tearDown() {
        vez = null;
    }

    @Test
    @DisplayName("Teszt összegzés tétele")

    public void osszegzesTetele() {
        assertEquals(79, vez.osszegzesTetele(tomb));
        assertEquals(0, vez.osszegzesTetele(tomb0));
        assertNotEquals(79+1,vez.osszegzesTetele(tomb));
        assertNotEquals(-39,vez.osszegzesTetele(tombMinus));
        assertEquals(-19,vez.osszegzesTetele(tombMinus));
    }

    @Test
    @DisplayName("Megszámlálés Tetele")
    public void megszamlalasTetele(){
        assertEquals(4, vez.megszamlalasTetele(tomb));
        assertNotEquals(4, vez.megszamlalasTetele(tomb0));
    }
    @Test
    @DisplayName("Eldöntés Tétele")
    public void eldontestetele(){
        assertTrue(vez.eldontestetele(tomb,5));
        assertTrue(vez.eldontestetele(tomb0,0));
        assertFalse(vez.eldontestetele(tomb, 45));
    }
    @Test
    @DisplayName("Kiválasztás Tétele")
    public void kivalasztasTetele(){
        assertEquals(4,vez.kivalasztasTetele(tomb,5));
        assertNotEquals(5,vez.kivalasztasTetele(tomb,5));
        assertEquals(0,vez.kivalasztasTetele(tomb,11));

    }
    @Test
    @DisplayName("Keresés Tétele")
    public void keresesTetele(){
        assertTrue(vez.keresesTetele(tomb,5));
        assertFalse(vez.keresesTetele(tomb,0));
    }
    @Test
    @DisplayName("Kiválogatás Tétele")
    public void kivalogatasTetele(){
        assertArrayEquals(new int[]{43, 6, 8, 10,0,0,0,0}, vez.kivalogatasTetele(tomb,5));

    }

    @Test
    @DisplayName("Minimum kiválasztás tétele")
    void minimumTetel() {
        assertEquals(1, vez.minimumTetel(tomb));
        assertNotEquals(2, vez.minimumTetel(tomb));
        assertNotEquals(11, vez.minimumTetel(tomb));
        assertEquals(1, vez.minimumTetel(new int[]{12,5,23,8,43,99,1}));
    }

    @Test
    @DisplayName("Maximum kiválasztás tétele")
    void maximumTetel() {
        assertEquals(43,vez.maximumTetel(tomb));
        assertNotEquals(2, vez.maximumTetel(tomb));
        assertNotEquals(11, vez.maximumTetel(tomb));
        assertEquals(99, vez.maximumTetel(new int[]{12,5,23,8,43,99,1}));
    }

    @Test
    @DisplayName("Metszet Tétele")
    void metszetTetele() {
        assertArrayEquals(new int[]{1,5,43,6,10,0,0,0}, vez.metszetTetele(tomb,tomb1));
    }

    @Test
    @DisplayName("Unio tétel")
    void unioTetele() {
            assertArrayEquals(new int[]{1, 2, 4, 5, 43, 6, 8, 10, 20,40,80}, vez.unioTetele(tomb,tomb1));
    }
}
