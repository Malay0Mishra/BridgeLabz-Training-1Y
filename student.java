import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;

    
    void getData(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        s.getData(id, name, age);
        s.display();

        sc.close();
    }
}

