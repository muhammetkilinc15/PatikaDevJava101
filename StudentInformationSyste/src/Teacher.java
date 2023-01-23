public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno,String branch)
    {
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void  Print()
    {
        System.out.println("Teacher name : " +this.name+ "\nmpno : "+this.mpno+ "\nbracnh : "+this.branch);
    }
}
