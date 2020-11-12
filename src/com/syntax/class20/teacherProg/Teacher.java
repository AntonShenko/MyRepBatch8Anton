package com.syntax.class20.teacherProg;

public class Teacher {
    String name;
    String age;
    String subj;

    public Teacher(String name, String age, String subj) {
        this.name = name;
        this.age = age;
        this.subj = subj;
    }
}

class Professor extends Teacher {
    String level;

    public Professor(String name, String age, String subj, String level) {
        super(name,age,subj);
        this.level = level;
    }
}

class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("J", "33", "Math");
        Teacher teacher2 = new Teacher("G", "33", "Chamistry");
        Teacher teacher3 = new Teacher("A", "33", "Math");
        Teacher professor = new Professor("l", "66", "Math", "10");
        professor = (Professor) professor;
    }

}