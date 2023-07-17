package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double t1,b1,z1,b2;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public void tax() {
        if(salary>=1000){
            t1=(salary*3)/100;
        }else{
            t1=0;
        }
        bonus();
    }
    public void bonus () {
        if (workHours >= 40) {
            b2=workHours-40;
            b2*=30;
        }else{
            b2=0;
        }
        raiseSalary();
    }
    public void raiseSalary () {
        b1=2021-this.hireYear;
        if(b1>=19){
            z1=(salary*15)/100;

        }else if(b1>=10&&b1<19){
            z1=(salary*10)/100;

        }else {
            z1=(salary*5)/100;
        }
        string();
    }
    public void string () {
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlanğıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.t1);
        System.out.println("Bonus : "+this.b2);
        System.out.println("Maaş Artışı : "+this.z1);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(salary+(b2-t1)));
        System.out.println("Toplam maaş : "+(salary+z1));
    }
}
