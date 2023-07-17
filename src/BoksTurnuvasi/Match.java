package BoksTurnuvasi;

public class Match {
    Fighter f1;
    Fighter f2;
    Fighter temp;
    int minWeight;
    int maxWeight;
    public Match(Fighter f1,Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    public  void run(){
        if(checkWeight()){
            if(luck()){
                f1=f1;
                System.out.println("İlk vuruş hakkı " +f1.name+" adlı oyuncuda.");
            }else {
                System.out.println("İlk vuruş hakkı "+f2.name+" adlı oyuncuda.");
                temp=f2;
                f2=f1;
                f1=temp;
            }
            while (f1.health>0&&f2.health>0){
                System.out.println("=====Yeni Round======");
                f2.health=f1.hit(f2);
                if(isWin()){
                    break;
                }
                f1.health=f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        }else{
            System.out.println("Sporcuların ağırlıkları siklete uyuşmuyor.");
        }
    }
    public boolean checkWeight(){
        return (f1.weight>=minWeight&&f1.weight<=maxWeight)&&(f2.weight>=minWeight&&f2.weight<=maxWeight);
    }


    public boolean isWin(){
        if(f1.health==0){
            System.out.println("Maçı kazanan: "+f2.name);
            return true;
        }else if(f2.health==0){
            System.out.print("Maçı kazanan "+f1.name);
            return true;
        }
        return false;
    }
    public  void printScore(){

        System.out.println(f1.name+" Kalan can\t: "+f1.health);
        System.out.println(f2.name+" Kalan can\t: "+f2.health);

    }
    //Kullanıcılara öncelikli olarak başlama şansı için luck() metodu.
    // Eğer random number 50 den büyük ise f1 önce vurur.
    public boolean luck(){
        double randomNumber=Math.random()*100;
        if(randomNumber>=50){
            return true;
        }
        return false;
    }
}
