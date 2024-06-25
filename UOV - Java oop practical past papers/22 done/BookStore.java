public class BookStore {
    public static void main(String[] args) {
        //authors
        Author author1 = new Author("David", 'M', 34);
        Author author2 = new Author("Anjelina", 'F', 38);
        Author author3 = new Author("Tharaka", 'F', 52);
        Author author4 = new Author("Henry", 'M', 45);
        Author author5 = new Author("Jeny", 'F', 32);

        //books
        Book book1 = new Book("Introduction to Java", 450, 750.0, author1);
        Book book2 = new Book("Head First C++", 300, 800.0, author2);
        Book book3 = new Book("JavaScript", 450, 750.0, author3);
        Book book4 = new Book("C#", 300, 600.0, author4);
        Book book5 = new Book("PHP", 250, 450.0, author5);

        //conditions
        System.out.println("Books with price greater than 500:");
        if (book1.getPrice() > 500) book1.displayDetails();
        if (book2.getPrice() > 500) book2.displayDetails();
        if (book3.getPrice() > 500) book3.displayDetails();
        if (book4.getPrice() > 500) book4.displayDetails();
        if (book5.getPrice() > 500) book5.displayDetails();

        System.out.println("\nBooks with number of pages less than 400:");
        if (book1.getNumberOfPages() < 400) book1.displayDetails();
        if (book2.getNumberOfPages() < 400) book2.displayDetails();
        if (book3.getNumberOfPages() < 400) book3.displayDetails();
        if (book4.getNumberOfPages() < 400) book4.displayDetails();
        if (book5.getNumberOfPages() < 400) book5.displayDetails();

        System.out.println("\nBooks with author's age less than 40:");
        if (book1.getAuthor().getAge() < 40) book1.displayDetails();
        if (book2.getAuthor().getAge() < 40) book2.displayDetails();
        if (book3.getAuthor().getAge() < 40) book3.displayDetails();
        if (book4.getAuthor().getAge() < 40) book4.displayDetails();
        if (book5.getAuthor().getAge() < 40) book5.displayDetails();

        System.out.println("\nBooks written by female authors:");
        if (book1.getAuthor().getSex() == 'F') book1.displayDetails();
        if (book2.getAuthor().getSex() == 'F') book2.displayDetails();
        if (book3.getAuthor().getSex() == 'F') book3.displayDetails();
        if (book4.getAuthor().getSex() == 'F') book4.displayDetails();
        if (book5.getAuthor().getSex() == 'F') book5.displayDetails();
		
		
    }
}

class Author {
    // Private attributes
    private String name;
    private char sex;
    private int age;

    public Author(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}

class Book {
    private String title;
    private int numberOfPages;
    private double price;
    private Author author;

    public Book(String title, int numberOfPages, double price, Author author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    // details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Price: " + price);
        System.out.println("Author Details:");
        System.out.println();
        author.displayDetails();
    }
}


