public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca", "01", "TRH");
        Teacher t2 = new Teacher("Muhammet", "02", "SOF");
        Teacher t3 = new Teacher("Mustafa Amucuk", "03", "FZK");

        Course history = new Course("History", "101", "TRH");
        history.AddTeacher(t1);
        Course physic = new Course("Pyhsic", "101", "FZK");
        physic.AddTeacher(t3);
        Course software = new Course("Software", "102", "SOF");
        software.AddTeacher(t2);

        Student s1 = new Student("Muhammet", "2101290001", "4", history, physic, software);
        s1.AddBulkExamNote(75,100,90);
        s1.AddBLukVerbalGrade(60,75,90);
        s1.Ispass();


        Student s2 = new Student("Batu", "210129009", "4", history, physic, software);
        s2.AddBulkExamNote(75,80,15);
        s2.AddBLukVerbalGrade(50,90,12);
        s2.Ispass();



    }
}