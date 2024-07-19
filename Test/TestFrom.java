class Test {
    private String name;
    private int age;

    Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

public class TestFrom {
    public static void main(String[] args) {
        Test p1 = new Test("Amaya", 21);
        Test p2 = new Test("Chathura", 28);
        Test p3 = new Test("Mahesh", 23);
        Test p4 = new Test("Franklin", 25);

        Test[] persons = new Test[4];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;
        persons[3] = p4;

        System.out.println("____________All Drivers____________");

        for (Test x : persons) {
            x.display();
            System.out.println();
        }

        System.out.println("____________Age >= 25____________");

        for (Test x : persons) {
            if (x.getAge() >= 25) {
                x.display();
                System.out.println();
            }
        }

        System.out.println("__________Oldest Driver__________");

        int age = 10;
        Test oldD = null;
        for (Test x : persons) {
            if (x.getAge() > age) {
                age = x.getAge();
                oldD = x;
            }
        }

        if(oldD != null){
            oldD.display();
        }


    }

}