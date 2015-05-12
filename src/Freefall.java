public class Freefall {
      public double fallingDistance(double time, double velo){
        return (time * velo) + .5*9.8*time*time;
      }
      public static void main(String[] args){
      	Freefall myTest = new Freefall();
      	System.out.println(myTest.fallingDistance(3, 1));
      
}
}