package Delfinen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterClassTest {

    @Test
    void testing() {
        TesterClass test = new TesterClass();
        assertEquals(2, test.testing(10,5));
    }


}
