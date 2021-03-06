package predicate6;

import java.util.Arrays;
import java.util.function.IntPredicate;
/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class JavaPredicateNegate {

    public static void main(String[] args) {

        int nums[] = { 2, 3, 1, 5, 6, 7, 8, 9, 12 };
        // por que aqui não da para usar ::
        IntPredicate p = n -> n > 5;

        Arrays.stream(nums)
                .filter(p)
                .forEach(System.out::println);

        System.out.println("****MUDA PARA NEGATIVO******");

        Arrays.stream(nums)
                .filter(p.negate())
                .forEach(System.out::println);
    }
}