import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        int n=input.nextInt();
        int bolen=0;
        int total=0;

        for (int i=1 ; i<n ; i++){
            if (n%i==0){
                bolen+=i;
            }

        }
        if (bolen==n){
            System.out.println(n+ " Sayısı bir mükemmel sayıdır");
        }
        else {
            System.out.println(n+ " Sayısı bir mükemmel sayı değildir");
        }


    }
}
