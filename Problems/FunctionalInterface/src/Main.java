//import java.util.function.Predicate;
//public class Main {
//    //Functional interface types (4types)
//    // 1: Predicate -- boolean result
//    public static void main(String[] args) {
//        Predicate<String> checkLength = str -> str.length()>=5; // lembda function
//        // checking if length of string is > 5 then true or false
//        System.out.println(checkLength.test("abcde"));
//    }
//}


import java.util.function.Consumer;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Consumer<Person> setName = t -> t.setName("Ashish");
        setName.accept(p);
        System.out.println(p.getName());
    }
}
