package OgrenciBilgiSistemiSimulasyoni;

public class Obs {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","TRH","555");
        Teacher t2=new Teacher("Graham Bell","FZK","000");
        Teacher t3=new Teacher("Külyutmaz","BIO","111");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","102","FZK");
        Course bİyo=new Course("Biyoloji","101","BIO");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        bİyo.addTeacher(t3);
        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,bİyo);
        s1.addBulkExamNote(100,70,80);


    }
}
