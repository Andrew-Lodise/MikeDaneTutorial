/* this will be my follow along with
mike danes java tutorial
starting at tutorial 26 */

import PackageExample.myClass;

public class ClassesAndObjects{
    public static void main(String[] args){

        // creating a student object
        Student student1 = new Student();

        // assigning attributes
        student1.firstName = "Andrew";
        student1.lastName = "Lodise";
        student1.gpa = 3.55;
        student1.major = "Computer Science";
        student1.age = 23;
        student1.onDeansList = true;

        // creating a different student
        Student student2 = new Student();
        student2.firstName = "John";
        student2.lastName = "Smith";
        student2.gpa = 3.9;
        student2.major = "Art";
        student2.age = 21;
        student2.onDeansList = true;

        System.out.println(student1.age);
        System.out.println(student2.major);

        // creating books (with constructor)
        Book book1 = new Book("1984", "George Orwell", 237, false);
        Book book2 = new Book("The way of the peaceful warrior", "Dan Millman", 212, false);

        System.out.println(book2.getTitle());
        System.out.println(book1.getAuthor());

        System.out.println(book1.isLong());

        book1.setPages(15000);
        System.out.println(book1.getPages());

        book1.setPages(237);
        System.out.println(book1.getPages());

        System.out.println(book1.getBookCount());
        System.out.println(book2.getBookCount());

        Book.sayGoodbye();

        Dog Lilly = new Dog();
        Lilly.eat();

        Animal Gracie = new Dog();
        Gracie.speak();

        myClass myClasssss = new myClass();

    }
}
