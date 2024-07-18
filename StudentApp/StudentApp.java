public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student("2011/ICT/25", "K. Ratna", 'M', 3, 24);
        Student s2 = new Student("2011/ASP/30", "K.S. Ramani", 'F', 3, 22);
        Student s3 = new Student("2011/ASP/30", "L.N. Rifth", 'F', 2, 22);
        Student s4 = new Student("2011/ASP/56", "J.N. Silva", 'M', 2, 23);
        Student s5 = new Student("2011/ASP/30", "H.M. Malini", 'F', 3, 21);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        System.out.println("All students");
        
        for (Student stu : students) {
            stu.display();
        }

        System.out.println("#######################\n");
        for (Student y : students) {
            if (y.getYos() == 3) {
                y.display();
            }
        }
        System.out.println("#################################");
        System.out.println("Youngest stud ");
        int minAge = 29;
        Student youstu = null;
        for (Student stu : students) {
            if (stu.getAge() < minAge) {
                minAge = stu.getAge();
                youstu = stu;
            }
        }

        if (youstu != null) {
            youstu.display();
        }
    }
}

class Student {
    private String regNo;
    private String name;
    private char sex;
    private int yos;
    private int age;

    Student(String regNo, String name, char sex, int yos, int age) {
        this.regNo = regNo;
        this.name = name;
        this.sex = sex;
        this.yos = yos;
        this.age = age;
    }

    public void setYos(int yos) {
        this.yos = yos;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYos() {
        return yos;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Registration NO: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Year of services: " + yos);
        System.out.println("Age: " + age);
    }
}