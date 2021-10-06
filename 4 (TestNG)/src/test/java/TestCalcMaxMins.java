import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalcMaxMins {
    @DataProvider (name = "DProviderSimple")
    public Object[][] DProviderSimple(){
        return new Object[][] {{3.0}};
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestSumMaxInt ( Double x ){
        Assert.assertTrue( Calc.calculate(x,'+', Calc.MAX_VALUE).equals("Error: Input out of range"));
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestSumMinInt ( Double x ){
        Double chk = Double.parseDouble(Calc.calculate(x,'+',Calc.MIN_VALUE+1));
        Assert.assertTrue(chk<=0);
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestProdMaxInt ( Double x ){
        Assert.assertTrue(Calc.calculate(x,'*', 50.0).equals("Error: Output out of range"));
    }

    @Test
    public void TestQuotMaxInt (){
        Assert.assertTrue(Calc.calculate(50.0,'/', 0.005).equals("Error: Output out of range"));
    }
}
