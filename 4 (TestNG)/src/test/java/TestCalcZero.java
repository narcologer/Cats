import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalcZero {
    @DataProvider (name = "DProviderSimple")
    public Object[][] DProviderSimple(){
        return new Object[][] {{1.0}};
    }
    // ---------------------------------------------------------------------------
    @Test(dataProvider = "DProviderSimple")
    public void TestSumZero (Double x){
        Assert.assertTrue(Calc.calculate(x,'+',-x).equals("0.0"));
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestDiffZero (Double x){
        Assert.assertTrue(Calc.calculate(x,'-',x).equals("0.0"));
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestProdZero ( Double x){
        Assert.assertTrue(Calc.calculate(x,'*',0.0).equals("0.0"));
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestQuotZero ( Double x){
        Assert.assertTrue(Calc.calculate(0.0,'/',x).equals("0.0"));
    }

    @Test(dataProvider = "DProviderSimple")
    public void TestQuotDivideByZero ( Double x){
        Assert.assertTrue(Calc.calculate(x,'/',0.0).equals("Error: Divide by zero"));
    }
    // ---------------------------------------------------------------------------
}
