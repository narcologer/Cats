public class Calc {
    public static Double MAX_VALUE=100.0;
    public static Double MIN_VALUE=-100.0;

    public static String calculate(Double x, char operator, Double y)
    {
        String res=null;
        if ((x>=Calc.MAX_VALUE)||(x<=Calc.MIN_VALUE)||(y>=Calc.MAX_VALUE)||(y<=Calc.MIN_VALUE))
            res="Error: Input out of range";
        else{
            switch(operator){
                case '+':
                    if ((x+y>=Calc.MAX_VALUE)||(x+y<=Calc.MIN_VALUE))
                        res="Error: Output out of range";
                    else{
                        Double sum = x+y;
                        res=sum.toString();
                    }
                    break;
                case '-':
                    if ((x-y>=Calc.MAX_VALUE)||(x-y<=Calc.MIN_VALUE))
                        res="Error: Output out of range";
                    else{
                        Double diff = x-y;
                        res=diff.toString();
                    }
                    break;
                case '*':
                    if ((x*y>=Calc.MAX_VALUE)||(x*y<=Calc.MIN_VALUE))
                        res="Error: Output out of range";
                    else{
                        Double prod = x*y;
                        res=prod.toString();
                    }
                    break;
                case '/':
                    if (y==0.0)
                        res="Error: Divide by zero";
                    else if ((x/y>=Calc.MAX_VALUE)||(x/y<=Calc.MIN_VALUE))
                        res="Error: Output out of range";
                    else{
                        Double quot = x/y;
                        res=quot.toString();
                    }
                    break;
            }
        }
        System.out.println(res);
        return res;
    }
}
