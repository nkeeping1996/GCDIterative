public class Main {
    public static void main(String[] args) {

        System.out.println(Gcd(90,48));

    }

    public static int Gcd(int a, int b){
        int r;
        while((r=a%b) > 0){
            int c = b;
            b = a%b;
            a = c;
        }
        return b;
        }
    }