package desafio.desafio_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoverImpares {
    public static void main(String[] args) throws Exception {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        number.removeIf(n -> n % 2 != 0);
        System.out.println(number);
    }
}
