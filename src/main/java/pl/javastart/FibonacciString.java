package pl.javastart;

import java.util.ArrayList;
import java.util.List;

public class FibonacciString {

    public static void main(String[] args) {
        FibonacciString fibonacciString = new FibonacciString();
        List<Integer> result = fibonacciString.Numbers(4000000);
    }

    public List<Integer> Numbers(int numbers) {

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        for (int i = 1; result.get(i)+result.get(i-1) < numbers; i++) {
            result.add(result.get(i) + result.get(i-1));
        }
        return result;
    }
}
