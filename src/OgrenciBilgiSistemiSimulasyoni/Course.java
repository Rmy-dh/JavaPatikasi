package OgrenciBilgiSistemiSimulasyoni;

public class Course {
    Teacher t1;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.t1=teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){
        this.t1.print();
    }

}
