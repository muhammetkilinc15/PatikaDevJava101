public class Student {
    String name, stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    // Constructor metotu
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void AddBulkExamNote(int note1, int note2, int note3) {

        if ((note1 >= 0 && note1 <= 100)) {
            this.c1.note = note1;
        }
        if ((note2 >= 0 && note2 <= 100)) {
            this.c2.note = note2;
        }
        if ((note3 >= 0 && note3 <= 100)) {
            this.c3.note = note3;
        }
    }

    void AddBLukVerbalGrade(double verbal1, double verbal2, double verbal3) {
        if ((verbal1 >= 0 && verbal1 <= 100)) {
            this.c1.verbalGrade = verbal1;
        }
        if ((verbal2 >= 0 && verbal2 <= 100)) {
            this.c2.verbalGrade = verbal2;
        }
        if ((verbal3 >= 0 && verbal3 <= 100)) {
            this.c3.verbalGrade = verbal3;
        }
    }
    void PrintNote() {
        System.out.println(c1.name + " exam note: " + c1.note + " Verbal note: " + c1.verbalGrade);
        System.out.println(c2.name + " exam note: " + c2.note + " Verbal note: " + c2.verbalGrade);
        System.out.println(c3.name + " exam note: " + c3.note + " Verbal note: " + c3.verbalGrade);
        System.out.println("Average :\t " + this.avarage);
        System.out.println("=====================================");
    }
    void Ispass() {
        this.avarage = ((this.c1.note * 0.6 + this.c1.verbalGrade * 0.4) + (this.c2.note * 0.6 + this.c2.verbalGrade * 0.4) + (this.c3.note * 0.6 + this.c3.verbalGrade * 0.4)) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Congratulations :) \n" + this.name + " pass the class");
            System.out.println("=====================================");
            PrintNote();
        } else {
            System.out.println(":( Unfourtanetly " + this.name + " fail the classes");
        }
    }


}
