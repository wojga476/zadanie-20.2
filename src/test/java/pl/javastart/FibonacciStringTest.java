package pl.javastart;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciStringTest {

    @Test
    public void returnList() {
        //given
        FibonacciString fibonacciString = new FibonacciString();
        int liczba = 100;
        List<Integer> liczby = new ArrayList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(5);
        liczby.add(8);
        liczby.add(13);
        liczby.add(21);
        liczby.add(34);
        liczby.add(55);
        liczby.add(89);
        //when
        List<Integer> result = fibonacciString.Numbers(liczba);
        //then
        Assert.assertThat(result, CoreMatchers.is(liczby));
    }
}