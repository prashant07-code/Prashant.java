public class oops {
    static class employee {
        int id;
        String name;
        double salary;
        int hours;
        double wage;

        employee(int id ,String name , double salary){
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        void calsalary(){
            this.salary = hours* wage;
        }
    }

    static class part_time extends employee {
        part_time(int id, String name, double salary) {
            super(id, name, salary);
            this.hours = 160;
            this.wage = 100;
        }
        void calsalary(){
            this.salary = hours* wage;
        }
    }
    static class full_time extends employee {
        double bonus;

        full_time(int id, String name, double salary) {
            super(id, name, salary);
            this.hours = 160;
            this.wage = 200;
            this.bonus = 5000;
        }
        void calsalary(){
            this.salary = hours* wage + bonus;
        }
    }
  public static void main(String[] args) {
    part_time p = new part_time(1, "Prashant", 0);
    full_time f = new full_time(2, "rochan", 0);
    p.calsalary();
    f.calsalary();
   
    System.out.println("Part time employee salary: " + p.salary);
    System.out.println("Full time employee salary: " + f.salary);
  }
}
                    
                    