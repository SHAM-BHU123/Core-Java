class hondaCity{
   static long price=10;
   int a,b;

   static double onRoadPrice(String city) {
       switch (city) {
           case "delhi":
               return price + price * 0.10;

           case "mumbai":
             return  price + price * 0.09;
       }
       return 0;
   }
}


public class Test {
    public static void main(String[] args) {
        hondaCity h1=new hondaCity();
        System.out.println(h1.price);
        System.out.println(h1.onRoadPrice("delhi"));
        System.out.println(h1.onRoadPrice("mumbai"));
    }
}
