package task1;


import java.util.ArrayList;


import java.util.List;

class AttendanceLog {
    private List<Student> students;
    private List<List<Boolean>> lessons;

    AttendanceLog(int studentsCount, int lessonsCount) {
        this.students = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(i, new Student());
        }

        this.lessons = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++) {
            lessons.add(i, new ArrayList<Boolean>(lessonsCount));
        }
        for (int i = 0; i < studentsCount; i++) {
            for (int j = 0; j < lessonsCount; j++) {
                lessons.get(i).add(j, false);
            }
        }
    }

    void mark(int id, int lesson) {
        if (id > 0 && id < students.size() || lesson > 0 && lesson < lessons.get(0).size()) {
            this.lessons.get(id - 1).set(lesson - 1, true);
            return;

        }
        System.out.println("Wrong data, try again");
    }

    void addStudent(String studentName) {
        students.add(new Student(students.size() + 1, studentName));
        lessons.add(new ArrayList<>());
        for (int j = 0; j < lessons.get(0).size(); j++) {
            lessons.get(lessons.size() - 1).add(j, false);
        }
    }

    void setStudent(String studentName, int id) {
        students.set(id - 1, new Student(id, studentName));
    }

    void print() {
        for (int i = 0; i < lessons.size(); i++) {
            students.get(i).print();
            for (int j = 0; j < lessons.get(i).size(); j++) {
                String mark;
                if (lessons.get(i).get(j)) {
                    mark = "+";
                } else {
                    mark = "-";
                }
                System.out.print(" " + mark + " ");
            }
            System.out.println();
        }
    }

    void remove(int id) {
        students.remove(id - 1);
        lessons.get(id - 1).clear();
        lessons.remove(id - 1);
    }
}
