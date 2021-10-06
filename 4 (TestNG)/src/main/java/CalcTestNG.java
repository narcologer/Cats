import java.util.Scanner;
public class CalcTestNG
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("1 - сложить, 2 - вычесть, 3 - умножить 4 - Разделить");
        int ch = in.nextInt();
        switch(ch){
            case 1:
                System.out.println(Calc.sum((int)x,(int)y));
                break;
            case 2:
                System.out.println(Calc.diff((int)x,(int)y));
                break;
            case 3:
                System.out.println(Calc.prod((int)x,(int)y));
                break;
            case 4:
                System.out.println(Calc.quot(x,y));
                break;
            default:
                System.out.println("Нет такого действия");
                break;
    }

    }
}
