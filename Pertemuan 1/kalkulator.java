import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char  operasi;
        int bilangan1,bilangan2, hasil;

        System.out.print("Masukkan bilangan pertama : ");
        bilangan1 = sc.nextInt();  
        System.out.print("Masukkan bilangan kedua : ");  
        bilangan2 = sc.nextInt();  
        System.out.println("Pilih Operasi  +, -, *, / : ");
        operasi = sc.next().charAt(0);

        switch (operasi) {
            case '+':
            hasil= bilangan1 + bilangan2;
            System.out.println( bilangan1 + " + " +  bilangan2 +" = "+ hasil);
                break;
                case '-':
                    hasil= bilangan1 - bilangan2;
                    System.out.println(bilangan1 + " - " + bilangan2 + " = " + hasil);
            break;
            case '*':
            hasil = bilangan1*bilangan2;
            System.out.println(bilangan1 + " * " + bilangan2 + " = " +hasil);
            break;
            case '/':
            hasil=bilangan1/bilangan2;
            System.out.println(bilangan1 + " + " + bilangan2 + " = " + hasil);
            break;
            default:
            System.out.println("Operasi tidak valid");
                break;
        }
}
}
