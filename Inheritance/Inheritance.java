class Employee{

    String name;
    int age;
    String phNumber;
    String address;
    long salary;
    
    void printSalary(){
        System.out.println("Salary is "+salary);
    }
}

class Officer extends Employee{
    Officer(String n, int a, String p, String add, long s, String sp) {
        name = n;
        age = a;
        phNumber = p;
        address = add;
        salary = s;
        specialization = sp;
    }
    String specialization;

}

class Manager extends Employee {
    Manager(String n, int a, String p, String add, long s, String d) {
        name = n;
        age = a;
        phNumber = p;
        address = add;
        salary = s;
        department = d;
    }

    String department;

}

class Inheritance {
    public static void main(String[] args) {
        Officer officer = new Officer("Tony Stark", 20, "+91 95624 33164", "Kerala", 100000, "Java");
        System.out.println("\n\nOFFICER \n\nName: "+officer.name+"\nAge: "+officer.age+"\nPhone Number: "+officer.phNumber+"\nAddress: "+officer.address+"\nSpecialization: "+officer.specialization);
        officer.printSalary();

        Manager manager=new Manager("Edard Stark", 25, "+91 82819 53316", "Mumbai", 200000, "R&D");
        System.out.println("\n\nMANAGER \n\nName: " + manager.name + "\nAge: " + manager.age + "\nPhone Number: "
                + manager.phNumber + "\nAddress: " + manager.address + "\nSpecialization: " + manager.department);
        manager.printSalary();
    }
}