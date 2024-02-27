package org.example.lambda.black_belt;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {

    void testStudents(List<Student> a1, StudentsCheck sc) {
        for (Student s : a1) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

/*    void printStudentsOverGrade (List<Student> al1, double grade){
        for (Student s : al1) {
            if(s.avgGrade > grade){
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge (List<Student> al1, int age){
        for (Student s : al1) {
            if(s.age < age){
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition (List<Student> al1, int age, double grade, char sex){
        for (Student s : al1) {
            if(s.age < age && s.avgGrade > grade && s.sex==sex) {
                System.out.println(s);
            }
        }
    }*/

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Petr", 'm', 23, 4, 6.4);
        Student st3 = new Student("Maria", 'f', 20, 2, 8.9);
        Student st4 = new Student("Alex", 'm', 19, 1, 7);
        Student st5 = new Student("Ira", 'f', 28, 2, 9.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
        System.out.println("------------------------");
        info.testStudents(students, new StudentsCheck() {
            @Override
            public boolean check(Student s) {
                return s.age < 25;
            }
        }) ;
        System.out.println("------------------------");
//        info.testStudents(students, (Student  s) -> {return s.age < 25;} );
        info.testStudents(students, s -> s.age < 25);
        System.out.println("------------------------");
        info.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("------------------------");
        info.testStudents(students, s -> s.avgGrade > 8 && s.age < 25 && s.sex== 'f' );

//        info.printStudentsOverGrade(students, 8);
//        System.out.println("------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("------------------------");
//        info.printStudentsMixCondition(students, 30, 9, 'f');
    }
}

interface StudentsCheck{
    boolean check (Student s);
}

//class CheckOverGrade implements StudentsCheck{
//    @Override
//    public boolean check(Student s){
//        return s.avgGrade > 8;
//    }
//}
