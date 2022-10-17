public class Contoh_Kasus {
 
    static double maxNumber(double a, double b) {
        if (a > b) {
            return a;
        }else{
            return b;
        }   
    }
 
    static int maxNumber(int a, int b) {   
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
 
    public static void main(String[] argrs) {
        System.out.println(maxNumber(10.5, 15.5));
        System.out.println(maxNumber(100, 200));
    }
 
}