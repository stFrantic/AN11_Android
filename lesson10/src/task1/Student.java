package task1;

import java.util.Objects;

class Student {

    private int id;
    private String name;

    public Student() {
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    void print() {
        System.out.print(id + ". " + name);
    }

}
