package valorvsreferencia;
class Person{
    private String name;

    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class PasarPersonPorReferencia {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Emerson");

        System.out.println("person = " + person.getName());
        testReferncia(person);
        System.out.println("person = " + person.getName());
    }

    private static void testReferncia(Person person) {
       System.out.println("Iniciamos testReferncia");
       person.setName("Brayan");
       System.out.println("Teminamos testReferncia");
    }
}
