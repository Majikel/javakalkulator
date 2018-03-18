package Program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class kalkulatortendobry {
    public static void main(String[] args) {
while(true){
        try{
        Scanner skaner= new Scanner(System.in);
System.out.println("\nPROSTY KALKULATOR:\n Napisz liczbe pierwsza,\n znak dzialania:\n(+,-,*,/,^,v,%)\n oraz, {jesli trzeba) druga liczbe:");
int a= skaner.nextInt();
char c= skaner.next().charAt(0);
if(c=='v'){
    System.out.println(Math.sqrt(a));
}
else{
int b= skaner.nextInt();

switch(c){
    case '-':
        System.out.println("\nwynik="+(a-b));
        break;
    case '+':
        System.out.println("\nwynik="+(a+b));
        break;
    case '*':
        System.out.println("\nwynik="+(a*b));
        break;
    case '/':
        if(b==0){
            System.out.println("\nNie dziel przez 0");
            break;
        }
        System.out.println("\nwynik="+(a*1.01/b));
        break;
    case '%':
        if(b==0){
            System.out.println("\nNie dziel przez 0");
            break;
        }
        System.out.println("\nwynik="+(a%b));
        break;
     case '^':
        System.out.println("\nwynik="+(Math.pow(a, b)));
        break;
    default:
        System.out.println("\nbledne dzialanie");
}
}

}
catch (InputMismatchException e) {
            System.out.println("\nPodales liczbe/znak w zlym formacie");
        }
}
    }
}

