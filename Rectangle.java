import java.awt.*;

public class Rectangle {
    private int x;
    private int y;
    private int height;
    private int width;
    public Rectangle(int x,int y,int height,int width){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
    }
    public Rectangle(Point p,int width,int height){
       /* this.x=p.getX();
        this.y=p.getY();    //dono constructor mai se koe ek
        this.width=width;
        this.height=height;*/

        this((int) p.getX(),(int)p.getY(),width,height);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void move(int x,int y){
        this.x=this.x+x;
        this.y=this.y+y;
    }
    public void move(Point p){
        move(int x,int y;)
        this.x=this.x+(int)p.getX();
        this.y=this.y+(int)p.getY();
    }
    public void grow(int width,int height){
        this.width=this.width+width;
        this.height=-this.height+height;
    }
    public void setLocation(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setLocation(Point p){
        this.x=(int)p.getX();
        this.y=(int)p.getY();
    }
    public boolean grow(){
        this.height=this.height+height;
        this.width=this.width+width;
        return false;
    }
    public Point  getRightCoordinate(){
         int a=this.x+width;
         Point p1=new Point(a,y);
         return p1;
    }
    public Point getRightBottomCoordinate() {
        int a=this.x+width;
        int b=this.y+height;
        Point p2=new Point(a,b);
        return p2;
    }
    public Point getLeftBottomCoordinate(){
        int b=this.y+height;
        Point p3=new Point(b,x);
        return p3;
    }
    public Point getLeftCoordinate(){
        Point p4=new Point(x,y);
        return p4;
    }
    public boolean Contains(int a,int b) {
        int x1;
        x1=this.x+a;
        int y1;
        y1=this.y+b;
    if ((a>=x&&a<=x1)&&(b>=y&&b<=y1)) {
       return true;
        }else {
        return false;
      }
    }
   public  String toString(){
        return "Rectangle :" +"x" +x +"y" +y +"width" +width +"height" +height;
    }
}
class Rectangle1{
    public static void main(String []ayush){
        Rectangle r1=new Rectangle(10,11,5,4);
        System.out.println(r1.getX());
        System.out.println(r1.getY());
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println(r1.grow());
    }
}

