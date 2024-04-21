package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxInTest {

    @Test
    void test() {
//        fail("まだ実装されていません");
        ArithSamble ar=new ArithSamble();
        
        assertEquals(1100,ar.taxIn(1000));
        
    }

}
