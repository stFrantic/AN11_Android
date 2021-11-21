package task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of students: ");
        int studentsCount = in.nextInt();
        System.out.println("Enter count of lessons: ");
        int lessonsCount = in.nextInt();

        System.out.println("Enter students by the order");
        AttendanceLog log = new AttendanceLog(studentsCount, lessonsCount);
        in.nextLine();
        for (int i = 0; i < studentsCount; i++) {
            String studentName = in.nextLine();
            log.setStudent(studentName, i + 1);
        }
        log.print();
        boolean exit = false;
        System.out.println("Fill the attendance");
        while (!exit) {
            System.out.println(
                    "Enter \"m\" to mark one lesson;\n" +
                            "Enter \"d\" to delete the student\n" +
                            "Enter \"a\" to add the student\n" +
                            "Enter \"p\" to print the log\n" +
                            "Enter \"e\" to finish the attendance");
            String c = in.nextLine();
            switch (c) {
                case "m": {
                    System.out.println("Enter student id");
                    int id = in.nextInt();
                    System.out.println("lesson number: ");
                    int lesson = in.nextInt();
                    log.mark(id, lesson);
                    log.print();
                    break;
                }
                case "d": {
                    System.out.println("Enter student id");
                    int id = in.nextInt();
                    String name = in.nextLine();
                    log.remove(id);
                    log.print();
                    break;
                }
                case "a": {
                    System.out.println("Student name");
                    String name = in.nextLine();
                    log.addStudent(name);
                    log.print();
                    break;
                }
                case "p":
                    log.print();
                case "e":
                    exit = true;
            }
        }
    }
}
