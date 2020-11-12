package com.syntax.class20.teacherProg;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {
    static ArrayList<ClassTeacher> allTeachersCollection = new ArrayList<>();//создали список. Лист удобен в измении

    public static void main(String[] args) {

        ClassMathTeacher mt1 = new ClassMathTeacher();
        mt1.name = "James";
        mt1.age = "35";
        mt1.mathLevel = "Level: Pro-1";


        ClassTeacher[] allTeachers = {mt1};//образец масива. масив статичен
        allTeachersCollection.add(mt1);

        while (true) {
            System.out.println("If add a new teacher push '1'");
            System.out.println("If you wanna print a new teacher push '2'");

            Scanner addOrPrint = new Scanner(System.in);
            String addNewT = addOrPrint.nextLine();
            if (addNewT.equals("1")) {
                addNewTeacher();
            } else if (addNewT.equals("2")) {
                print();
            }
        }
        }

    public  static  void print(){
        for (int i = 0; i < allTeachersCollection.size(); i++) {
            System.out.println("Hello " + allTeachersCollection.get(i).name +"!!!");
            if(allTeachersCollection.get(i) instanceof ClassMathTeacher){
                System.out.print("!!!");
            }
            else {

            }
        }
    }
    public static void addNewTeacher(){
        Scanner scan = new Scanner(System.in);

        ClassTeacher teachersForProfile = new ClassTeacher();

        System.out.println("Enter your teacher profession");
        String profession = scan.nextLine();
            if(profession.equals("math")) {
                teachersForProfile = new ClassMathTeacher();
                System.out.println("Enter Math level");
                ((ClassMathTeacher) teachersForProfile).mathLevel = scan.nextLine();
            }
            else if(profession.equals("chemistry")) {
                teachersForProfile = new ClassChemistryTeacher();
                System.out.println("Enter your Chemistry level");
                ((ClassChemistryTeacher) teachersForProfile).chemistryLevel = scan.nextLine();
            }
            else if(profession.equals("piano")){
                    teachersForProfile = new ClassPianoTeacher();
                    System.out.println("Enter your Piano level");
                    ((ClassPianoTeacher) teachersForProfile).pianoLevel = scan.nextLine();
            }

        System.out.println("Enter name");
        teachersForProfile.name = scan.nextLine();

        System.out.println("Enter your age");
        teachersForProfile.age = scan.nextLine();

        allTeachersCollection.add(teachersForProfile);
    }
}
