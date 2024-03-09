import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 85));
        students.add(new Student("Jane", "Smith", 72));
        students.add(new Student("Alice", "Johnson", 60));
        students.add(new Student("Bob", "Brown", 45));

        //16
        students.stream()
                .filter(s -> s.getscore() >= 56)
                .forEach(s -> System.out.println(s.getname() + " " + s.getsurname()));

        // 17
        double averageScore = students.stream()
                .filter(s -> s.getscore() >= 56)
                .mapToInt(Student::getscore)
                .average()
                .orElse(0);
        System.out.println("Average score of students with score >= 56: " + averageScore);

        // 18
        String longestsurname = students.stream()
                .filter(s -> s.getscore() >= 56)
                .map(Student::getsurname)
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("");
        System.out.println("Longest surname among students with score >= 56: " + longestsurname);
    }
}