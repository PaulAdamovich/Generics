package Game;

public class Test1 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar(15 , "Alik");
        Schoolar schoolar2 = new Schoolar(14, "Ivan");

        Student student1 = new Student(20, "Boris");
        Student student2 = new Student(21, "Stas");

        Employee employee1 = new Employee(34, "Nikita");
        Employee employee2 = new Employee(45, "Roma");

       Team<Schoolar> schoolarTeam = new Team<>("Dragon");
       schoolarTeam.addParticipant(schoolar1);
       schoolarTeam.addParticipant(schoolar2);

       Team<Student> studentTeam = new Team<>("Forth");
       studentTeam.addParticipant(student1);
       studentTeam.addParticipant(student2);

       Team<Employee> employeeTeam = new Team<>("Brave Mans");
       employeeTeam.addParticipant(employee1);
       employeeTeam.addParticipant(employee2);

       Schoolar schoolar3 = new Schoolar( 12 , "Olga" );
       Schoolar schoolar4 = new Schoolar(11, "Marina");

       Team<Schoolar> schoolarTeam2 = new Team<>("Ballases");
       schoolarTeam2.addParticipant(schoolar3);
       schoolarTeam2.addParticipant(schoolar4);
    }
}
