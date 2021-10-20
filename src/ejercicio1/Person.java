package ejercicio1;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person( String name, int age, String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //metodos get
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }

    //metodos set
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }
}
