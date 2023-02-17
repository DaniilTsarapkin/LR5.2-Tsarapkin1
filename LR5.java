import java.util.Scanner;

class frac {
    public int num, den;

    public frac(){
        num = 1;
        den = 1;
    }
    public frac(int num,int den) throws Exception{
        if (den != 0){
            this.num = num;
            this.den = den;
    } else {
        throw new Exception ("В знаменателе не может стоять ноль");

    }
}
public void showfrac(frac frac1){
    System.out.println(frac1.num + "/" + frac1.den);
}
public void sum(frac frac1, frac frac2){
    System.out.println("Сумма: " + ((frac1.num*frac2.den+frac2.num*frac1.den) + "/" + (frac1.den*frac2.den)));
}
public void sub(frac frac1, frac frac2){
    System.out.println("Разность: " + ((frac1.num*frac2.den-frac2.num*frac1.den) + "/" + (frac1.den*frac2.den)));
}
public void mul(frac frac1, frac frac2){
    System.out.println("Произведение: " + ((frac1.num * frac2.num) + "/" + (frac1.den * frac2.den)));
}
public void seg(frac frac1, frac frac2){
    System.out.println("Частное: " + ((frac1.num * frac2.den) + "/" + (frac1.den * frac2.num)));
}
}
public class LR5{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        frac frac1 = new frac();
        frac1.showfrac(frac1);

        System.out.println("\n" +"Введите целые значения числителя и знаменателя: ");
        frac frac2 = new frac(scanner.nextInt(), scanner.nextInt());
        frac2.showfrac(frac2);

        System.out.println("\n" +"СУММА" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac3 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac4 = new frac(scanner.nextInt(), scanner.nextInt());
        frac3.sum(frac3, frac4);

        System.out.println("\n" +"ВЫЧИТАНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac5 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac6 = new frac(scanner.nextInt(), scanner.nextInt());
        frac5.sub(frac5, frac6);

        System.out.println("\n" +"УМНОЖЕНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac7 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac8 = new frac(scanner.nextInt(), scanner.nextInt());
        frac7.mul(frac7, frac8);

        System.out.println("\n" +"ДЕЛЕНИЕ" + "\n" +"Введите целые значения числителя и знаменателя для первой дроби: ");
        frac frac9 = new frac(scanner.nextInt(), scanner.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя для второй дроби: ");
        frac frac10 = new frac(scanner.nextInt(), scanner.nextInt());
        frac9.seg(frac9, frac10);
        
        scanner.close();
}
}