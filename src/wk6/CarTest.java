package wk6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    //@ => Annotation => speaks to compiler
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Finished");
    }

    @Test
    public void test1(){

    //asserting
        //ensure that the expected value meets the actual value

        assertTrue(1 == 1);
        assertFalse( 1 == 2);
        assertEquals(1, 2-1);
        assertNotEquals(1, 3-1);
        assertNull(null);
        assertNotNull(true);
    }
    @Test
    public void test2(){
        Car c1 = new Car();
        assertEquals("black", c1.getColor());
    }

    @Test
    public void testDefaultConstructorCarObjectNotNull(){
        Car c1 = new Car();
        assertNotNull(c1);
    }
    public static Car c1;

    @BeforeEach

    public void beforeEach(){
        c1 = new Car();
    }

    @Test
    public void testDefaultConstructorCarObjectSpeedTest(){
        assertEquals(0, c1.getSpeed());
    }
    @Test
    public void testDefaultConstructorCarObjectDoorTest(){

        assertEquals(2, c1.getDoors());
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 10, 100, 150, 200, 250, 400})  // ints, doubles, chars, floats, strings,booleans
    public void testDefaultContrustorSetSpeedMethodValidValues(double speed){
        c1.setSpeed(speed);
        assertEquals(speed, c1.getSpeed());
    }


    @ParameterizedTest
    @ValueSource(doubles = {-1, -10, -100, 450, 4000})  // ints, doubles, chars, floats, strings,booleans
    public void testDefaultContrustorSetSpeedMethodInValidValues(double speed){
        c1.setSpeed(speed);
        assertEquals(0, c1.getSpeed());
    }

    @ParameterizedTest
    @CsvSource({"black,2,200,auto", "blue,4,400,manual", "white,5,300,cvt"})
    public void test4ArgConstructor(String color, int doors, double speed, String transmission){
        Car car = new Car(color, doors, speed, transmission);
        assertEquals(color, car.getColor());
        assertEquals(doors, car.getDoors());
        assertEquals(speed, car.getSpeed());
        assertEquals(transmission.toUpperCase(), car.getTransmission() + "");
    }
}