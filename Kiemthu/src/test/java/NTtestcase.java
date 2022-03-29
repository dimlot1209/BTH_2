
import com.loc.kiemthu.Utils;
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lọt
 */
public class NTtestcase {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }
    
    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }
    
    @Test
    @Tag("Critical")
    @DisplayName("Kiem tra so nguyen to chan")
    public void testNtChan() throws InterruptedException {
        int n = 2;
        boolean expected = true;
        boolean actual = Utils.ktNt(n);

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testNtException(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Utils.ktNt(-5);
        });
    }
    
    @ParameterizedTest
    @ValueSource(ints = {2,5,7,9})
    public void testTrue (int n) throws InterruptedException{
        Assertions.assertTrue(Utils.ktNt(n));
    }
    
    @ParameterizedTest
    @CsvSource({"4,true","3,false","5,true"})
    public void testAll(int n, boolean kt) throws InterruptedException{
        Assertions.assertEquals(kt,Utils.ktNt(n));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 0) //doc khong bo qua dong nao
    public void testAllInFile(int n, boolean kt, String mess) throws InterruptedException{
        Assertions.assertEquals(kt,Utils.ktNt(n),mess);
    }
}
