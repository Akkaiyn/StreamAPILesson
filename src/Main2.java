import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Person>people = new ArrayList<>();

        // ***********************   Without Stream API
        people.add(new Person("A",7,Gender.WOMEN));
        people.add(new Person("B",1,Gender.WOMEN));
        people.add(new Person("C",3,Gender.MEN));
        people.add(new Person("A",2,Gender.MEN));
        people.add(new Person("A",3,Gender.WOMEN));
        people.add(new Person("K",4,Gender.WOMEN));
        people.add(new Person("K",4,Gender.WOMEN));
        people.add(new Person("K",4,Gender.WOMEN));

        List<Person>boys = new ArrayList<>();
        for (Person p:people) {
            if (p.getGender().equals(Gender.WOMEN)){
                boys.add(p);
            }
        }
      //  System.out.println(boys);

        // Filter with API
        people.stream()
                .filter(person -> person.getAge() > 3 && person.getGender().equals(Gender.WOMEN)) // command + option + w = cool
                .distinct()
                .toList()
                .forEach(System.out::println);


        //           with Lambda




    }
}
