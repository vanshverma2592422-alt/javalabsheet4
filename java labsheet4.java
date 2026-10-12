class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println(name + " " + rollNumber);
    }
}

class Medicine {
    String name;
    double price;

    Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

class Pharmacy {
    static String pharmacyName = "Health Pharmacy";
    static String location = "Jaipur";

    void display() {
        System.out.println(pharmacyName + " " + location);
    }
}

class MedicineStock {
    String name;
    int quantity;

    MedicineStock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + " " + quantity);
    }
}

class Inventory {
    MedicineStock[] stock = {
        new MedicineStock("Tablet", 100),
        new MedicineStock("Syrup", 50),
        new MedicineStock("Capsule", 75)
    };

    void displayInventory() {
        for (MedicineStock m : stock)
            m.display();
    }
}

class Patient {
    int age;

    Patient(int age) {
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not eligible");
    }
}

class MedicineProduct {
    private String name;
    private double price;

    MedicineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    void displayBalance() {
        System.out.println(balance);
    }
}

class PatientBill {
    private double consultationFee;
    private double medicineFee;

    void setConsultationFee(double fee) {
        if (fee >= 0)
            consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        if (fee >= 0)
            medicineFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee;
    }
}

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println(name + " " + id);
    }
}

class Pharmacist extends Employee {
    String qualification;

    Pharmacist(String name, int id, String qualification) {
        super(name, id);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println(qualification);
    }
}

class Doctor extends Employee {
    String specialization;

    Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println(specialization);
    }
}

class Person {
    void showPerson() {
        System.out.println("Person details");
    }
}

class HospitalEmployee extends Person {
    void showEmployee() {
        System.out.println("Employee details");
    }
}

class Manager extends HospitalEmployee {
    void showManager() {
        showPerson();
        showEmployee();
        System.out.println("Manager details");
    }
}

class MultipleInheritanceConcept {
    void explain() {
        System.out.println(
            "Java cannot extend two classes directly."
        );
    }
}

class HybridInheritanceConcept {
    void explain() {
        System.out.println(
            "Hybrid inheritance combines inheritance structures."
        );
    }
}

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class HospitalSystem {
    void run() {
        Doctor d = new Doctor("Neha", 101, "Cardiology");
        Pharmacist p = new Pharmacist("Amit", 102, "B.Pharm");

        d.displayDoctor();
        p.displayPharmacist();
    }
}

public class Main {

    // Q1. Student Record
    static void q1() {
        Student s = new Student("Rahul", 101);
        s.display();
    }

    // Q2. Medicine
    static void q2() {
        Medicine m = new Medicine("Tablet", 25.0);
        m.display();
    }

    // Q3. Pharmacy
    static void q3() {
        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();

        Pharmacy.pharmacyName = "City Pharmacy";

        p1.display();
        p2.display();
    }

    // Q4. Pharmacy Inventory
    static void q4() {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }

    // Q5. Patient Eligibility
    static void q5() {
        Patient p = new Patient(20);
        p.checkEligibility();
    }

    // Q6. Encapsulated Medicine Product
    static void q6() {
        MedicineProduct m =
            new MedicineProduct("Tablet", 30.0);
        m.display();
    }

    // Q7. Bank Account
    static void q7() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.displayBalance();
    }

    // Q8. Patient Bill
    static void q8() {
        PatientBill bill = new PatientBill();

        bill.setConsultationFee(300);
        bill.setMedicineFee(200);

        System.out.println(bill.calculateTotal());
    }

    // Q9. Employee -> Pharmacist
    static void q9() {
        Pharmacist p =
            new Pharmacist("Amit", 201, "B.Pharm");
        p.displayPharmacist();
    }

    // Q10. Hierarchical Hospital Staff
    static void q10() {
        Doctor d = new Doctor("Neha", 101, "Cardiology");
        Pharmacist p =
            new Pharmacist("Amit", 102, "B.Pharm");

        d.displayDoctor();
        p.displayPharmacist();
    }

    // Q11. Multilevel Hospital Staff
    static void q11() {
        Manager m = new Manager();
        m.showManager();
    }

    // Q12. Multiple Inheritance Concept
    static void q12() {
        MultipleInheritanceConcept concept =
            new MultipleInheritanceConcept();
        concept.explain();
    }

    // Q13. Hybrid Inheritance Concept
    static void q13() {
        HybridInheritanceConcept concept =
            new HybridInheritanceConcept();
        concept.explain();
    }

    // Q14. Shape Hierarchy
    static void q14() {
        Shape r = new Rectangle(10, 5);
        Shape c = new Circle(7);

        System.out.println(r.calculateArea());
        System.out.println(c.calculateArea());
    }

    // Q15. Final Hospital Staff System
    static void q15() {
        HospitalSystem system = new HospitalSystem();
        system.run();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter question number (1-15): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            default:
                System.out.println("Invalid question number");
        }

        sc.close();
    }
}
