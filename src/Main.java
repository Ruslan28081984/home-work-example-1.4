public class Main {
    public static void main(String[] args) {
        //examples1();
        examples2();
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

    }
}