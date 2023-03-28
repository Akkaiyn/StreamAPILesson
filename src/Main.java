import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer>integers = List.of(1,2,3,4,5,6,7,8,9,10);

        integers.stream().forEach(x-> System.out.println(x*x));      //integers.stream().map(number-> number*number);

        List<String > names = List.of("Adilet", "Aidin", "Azamat", "Kairat");
        names.stream().map(x->x+ " is a java Student").forEach(System.out::println);







        // list tus any str ailan Intke  kvadar



    }
}