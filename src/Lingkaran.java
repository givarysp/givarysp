public class Lingkaran {
   private final double phi = 3.14;
   private int radius;
   public double keliling;

   public void hitungkelilinglingkaran(){
       this.keliling = 2 * phi * radius;
   }

   public void setRadius(int radius){
       this.radius = radius;
   }

   public double getKelilingLingkaran(){
       return keliling;
   }
}
