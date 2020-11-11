package com.syntax.class20;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {
    static ArrayList<ClassTeacher> allTeachersCollection = new ArrayList<>();//создали список. Лист удобен в измении

    public static void main(String[] args) {

        ClassMathTeacher mt1 = new ClassMathTeacher();
        mt1.name = "James";
        mt1.age = "35";
        mt1.mathLevel = "Level: Pro-1";
        ClassMathTeacher mt2 = new ClassMathTeacher();
        mt2.name = "Andrew";
        mt2.age = "34";
        mt2.mathLevel = "Level: Pro-2";
        ClassMathTeacher mt3 = new ClassMathTeacher();
        mt3.name = "Linda";
        mt3.age = "44";
        mt3.mathLevel = "Level: Advance";


        ClassChemistryTeacher ct1 = new ClassChemistryTeacher();
        ct1.name = "Joseph";
        ct1.age = "35";
        ct1.chemistryLevel = "Level: Advance";
        ClassChemistryTeacher ct2 = new ClassChemistryTeacher();
        ct2.name = "Eric";
        ct2.age = "55";
        ct2.chemistryLevel = "Level: Pro-3";
        ClassChemistryTeacher ct3 = new ClassChemistryTeacher();
        ct3.name = "Emily";
        ct3.age = "43";
        ct3.chemistryLevel = "Level: Advance-3";



        ClassPianoTeacher pt1 = new ClassPianoTeacher();
        pt1.name = "Anna";
        pt1.age = "35";
        ClassPianoTeacher pt2 = new ClassPianoTeacher();
        pt2.name = "Lora";
        pt2.age = "25";
        ClassPianoTeacher pt3 = new ClassPianoTeacher();
        pt3.name = "Sam";
        pt3.age = "29";

        ClassProfessor prof = new ClassProfessor();
        prof.name = "Joe";
        prof.age = "67";
        prof.profLevel = "Level: Dr. Pro";

        ClassTeacher[] allTeachers = {mt1, mt2, mt3, ct1, ct2, ct3, pt1, pt2, pt3, prof};//образец масива. масив статичен
        allTeachersCollection.add(mt1);
        allTeachersCollection.add(mt2);
        allTeachersCollection.add(mt3);
        allTeachersCollection.add(ct1);
        allTeachersCollection.add(ct2);
        allTeachersCollection.add(ct3);
        allTeachersCollection.add(pt1);
        allTeachersCollection.add(pt2);
        allTeachersCollection.add(pt3);
        allTeachersCollection.add(prof);

        while (true){
            System.out.println("If add a new teacher push '1'");
            System.out.println("If you wanna print a new teacher push '2'");
            break;
        }
        Scanner addOrPrint = new Scanner(System.in);
        String addNewT = addOrPrint.nextLine();
            if(addNewT.equals("1")){
                addNewTeacher();}
            else if(addNewT.equals("2")){
                System.out.println("You are mothefucker!");
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
