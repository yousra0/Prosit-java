import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StudentManagement implements Management {
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream().filter(pre).forEach(con);
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return students.stream().map(fun).collect(Collectors.joining(", "));
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return students.stream().sorted(com).collect(Collectors.toList());
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}