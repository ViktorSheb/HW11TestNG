import homeworkEight2.Director;
import homeworkEight2.Employee;
import homeworkEight2.Manager;
import homeworkEight2.Worker;


public class EmployeeData {

        public static String name = "Alex";
        public static  String subName= "";
      //  public static int salarySum = 1000;



        public static Employee[] getEmployeesData() {
            Employee emp1 = new Employee("Jack", 100);
            Employee emp2 = new Employee("Alex", 200);
            Employee emp3 = new Employee("Peter", 300);

            Employee employees[] = {emp1, emp2, emp3};
            return employees;
        }


            public static homeworkEight2.Employee[] findBySubName(){
                Employee emp4 = new Employee("Vasyl", 25);
                Employee emp5 = new Employee("Damir", 40);
                Employee emp6 = new Employee("Olga", 35);
                Employee employees1 [] = {emp4, emp5, emp6};
                return employees1;

        }

        public  static Worker[] salarySum(){
            Worker work1 = new Worker("Vasyl", 250);
            Worker work2= new Worker("Damir", 400);
            Worker work3 = new Worker("Olga", 350);
            Worker workers [] = {work1, work2, work3};
            return workers;
        }

    public  static Worker[] salaryMaxSum(){
        Worker work1 = new Worker("Vasyl", 300);
        Worker work2= new Worker("Damir", 450);
        Worker work3 = new Worker("Olga", 1500);
        Worker workers [] = {work1, work2, work3};
        return workers;
    }
    public  static Manager[] salaryMinSum() {
        Manager man1 = new Manager("Joe", 1000, 100);
        Manager man2 = new Manager("John", 2000, 200);
        Manager man3 = new Manager("Lee", 3000, 300);
        Manager[] managers = {man1, man2, man3};

        return managers;
    }

    public static Director[] findMinNumberOfSubordinates(){

        Director dir1 = new Director("Chris", 10, 1);
        Director dir2 = new Director("Kyle", 20, 2);
        Director dir3 = new Director("Jasper", 30, 3);
        Director[] directors = {dir1, dir2, dir3};
        return directors;

    }



}



