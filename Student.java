import java.lang.*;
import java.util.*;
  public  class Student {
      int phy, chem, maths;
      String name;

      public Student(int phy, int chem, int maths, String name) {
          this.phy = phy;
          this.chem = chem;
          this.maths = maths;
          this.name = name;
      }

      public int Phy() {
          return phy;
      }

      public int maths() {
          return maths;
      }

      public int chem() {
          return chem;
      }

      public String name() {
          return name;
      }
      public int  Total(){
         return phy+chem+maths;
      }
      public double average(){
          return (phy+chem+maths)/3;
      }
  }
 class Student1{
    public static void main(String []args) {
        Student st = new Student(60, 80, 77, "ram");
        System.out.println("phy :" + st.Phy());
        System.out.println("maths :" + st.maths());
        System.out.println("chem :" + st.chem());
        System.out.println("name :" + st.name());
        System.out.println("total marks :" + st.Total());
        System.out.println("total average :" + st.average());
    }
}