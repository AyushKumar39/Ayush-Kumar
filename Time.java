/*import java.util.Scanner;
public class Time {
    private int Hours;
    private int minutes;
    private int second;
    public Time(int Hours,int minutes,int second){
        this.Hours=Hours;
        this.minutes=minutes;
        this.second=second;
    }
    public int getHours(){
        return Hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSecond(){
        return second;
    }
    public int addHours(int hr){
            Hours=-(Hours+hr);
            return hr;
    }
    public int addMinutes(int min){
        minutes=minutes+min;
        int hr=minutes/60;
        addHours(hr);
        minutes=minutes%60;
        return minutes;
    }
    public int addSecond(int sec){
        second=second+sec;
        int min=second/60;
        addMinutes(min);
        second=second%60;
        return second;
    }
    public void add(Time time){
        addHours(time.getHours());
    }
     public String toString(){
        return "time:"+Hours +" "+minutes +" "+second;
    }
}
 class Time1{
    public static void main(String []args){
        Time tr=new Time(1,34,54);
        tr.addHours(2);
        tr.addMinutes(3);
        tr.addSecond(4);
        System.out.println("hr:"+(tr.getHours()));
        System.out.println("min:"+tr.getMinutes());
        System.out.println("sec:"+tr.getSecond());
        System.out.println("sec:"+tr.add());

    }
}
*/