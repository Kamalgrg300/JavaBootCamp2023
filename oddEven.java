public class oddEven {
        public static void main(String[] args) {
            for(int a=1; a <= 40; a++){
                if(a % 2==0)
                    System.out.println("Even number: " + a);
            }
            System.out.println("........................................................");
            for (int a=1; a <= 30; a++){
                if(a==1 || a%2!=0)
                    System.out.println("Odd number: " +a);
            }
        }
    }
