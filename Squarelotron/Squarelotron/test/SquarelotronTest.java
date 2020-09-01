import org.junit.Test;

import static org.junit.Assert.*;

public class SquarelotronTest {

    @Test
    public void test() {
        Squarelotron test = new Squarelotron(3);
        assertEquals(3,test.size);
    }

    @Test
    public void printSquarelotronTest(){
        Squarelotron test = new Squarelotron(3);
        test.printSquarelotron();
    }

    @Test
    public void upsideDownFlipTest(){
        Squarelotron test = new Squarelotron(4);
        test.printSquarelotron();
        System.out.println();
        test.upsideDownFlip(1);
        test.printSquarelotron();
    }

    @Test
    public void swap(){
        Squarelotron test = new Squarelotron(6);
        test.printSquarelotron();
        System.out.println();
        test.swap(test,2);
        test.printSquarelotron();
    }

    @Test
    public void maxRingsNumberTest() {
        Squarelotron test = new Squarelotron(8);
        System.out.println(test.maxRingsNumber());
    }

    @Test
    public void typeCheckTest(){
        Squarelotron test = new Squarelotron(8);
        assertEquals("even",test.typeCheck());
    }

    @Test
    public void swapDiagonals() {
        Squarelotron test = new Squarelotron(5);
        test.printSquarelotron();
        System.out.println();
        test.swapDiagonals(test,1);
        test.printSquarelotron();
    }

    @Test
    public void rotateRightOnce() {
        Squarelotron test = new Squarelotron(4);
        test.printSquarelotron();
        test.rotateRightOnce();
        System.out.println();
        test.printSquarelotron();
    }

    @Test
    public void rotateRight() {
        Squarelotron test = new Squarelotron(4);
        test.printSquarelotron();
        System.out.println();
        test.rotateRight(4);
        test.printSquarelotron();
    }
}