package java_code;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        //type conversion
//        Scanner input=new Scanner(System.in);
//        Float number=input.nextFloat();
//        //we can input the integer it will give float value;
//        System.out.println(number);
//
//        int num=input.nextInt();
//        //we cannot input float in it as destination(which is int) is not greater than the
//        // source(which is float , out input);
//
//
//
//        //type casting
//        int num=(int)(65.08f);
//
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a=257;   //maximum range of byte is 256
//        byte b=(byte)(a);   //257 % 256 = 1

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=(a*b)/c;   //sub expressions like a*b are performed using integer.

//        System.out.println(d);

//        int number='ह';
//        System.out.println(number);
//        //java works on the unicode principle;
//        System.out.println("नमस्ते");
//        System.out.println("मेरा नाम हर्षिता बाजपेयी है");


        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d = 0.234223;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+" | "+(i/c)+" | "+(d-s));
        System.out.println(result);

    }
}
