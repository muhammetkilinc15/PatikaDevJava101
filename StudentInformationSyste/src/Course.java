public class Course {
    //  Sınıfa ait nitelikler
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalGrade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalGrade=0;
    }
    void AddTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
           // PrintTeacherInfo();
        } else {
            System.out.println("Öğretmen ile ders uyuşmuyor");
        }

    }
    void PrintTeacherInfo() {
        this.teacher.Print();
    }

}
