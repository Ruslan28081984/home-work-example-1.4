public class Main {
    public static void main(String[] args) {
//        examples1();
//        examples2();
//        examples3();
        examples4();

    }
    private static void examples1(){
        int i = 0;
        while (i < 10){
            i ++;
            System.out.print( i + " " );
        }
            System.out.println();
            for (i = 10; i > 0; i --) {
                System.out.print(i + " " );
            }
    }
    private static void examples2(){
        int friday = 1;
        for (int i = 1; i < 31; i = i + 7) {
            System.out.println(" Сегодня пятница, " + i + " число. Необходимо подготоить отчёт");
        }
}
    private static void examples3(){
        int currentYear = 2022;
        int yearComet = currentYear - 200;
        for (int i = 0; i < currentYear + 100; i+= 79) {
              while ( i > yearComet ){
                System.out.println(i);
                break;
            }
        }
    }
    private static void examples4() {
        String a = "ping";
        String b = "pong";
       for (int i = 1; i < 31; i++) {
           System.out.println(i + ": " );

            if (i % 3 == 0) {
                System.out.println( a);
            }
            if (i % 5 == 0) {
                System.out.println(b);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(a + "  " + b);
            }
        }
    }
    }
