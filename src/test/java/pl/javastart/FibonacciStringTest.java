package pl.javastart;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FibonacciStringTest {

    private FibonacciString fibonacciString;

    @Before
    public void init(){
        fibonacciString = new FibonacciString();
    }
    @Test
    public void returnto10() {

            //given
            int a=10;

            //when
            int result = fibonacciString.fibonacciString(a);

            //then
            assertThat(result, is(2));
        }
    @Test
    public void shouldReturnFor90(){
        //given
        int a=90;

        //when
        int result = fibonacciString.fibonacciString(a);

        //then
        assertThat(result, is(44));
    }
}