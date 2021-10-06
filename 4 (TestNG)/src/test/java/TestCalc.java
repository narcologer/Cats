import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestCalc {
    @DataProvider(name = "DProvider")
    public Object[][] DProvider(Method m) {
        switch (m.getName()) {
            case "TestSum":
                return new Object[][]{{2.0, 2.0}};
            case "TestDiff":
                return new Object[][]{{3.5, 2.2}};
            case "TestProd":
                return new Object[][]{{3.0, 4.1}};
            case "TestQuot":
                return new Object[][]{{16.0, 2.0}};
        }
        return null;
    }

    @DataProvider (name = "DProviderSimple")
    public Object[][] DProviderSimple(){
        return new Object[][] {{1.0}};
    }

    @DataProvider (name = "DProviderSimpleDouble")
    public Object[][] DProviderSimpleDouble(){
        return new Object[][] {{1.0}};
    }

        @Test(dataProvider = "DProvider")
        public void TestSum ( Double x, Double y){
            Double chk = x+y;
            Assert.assertTrue(Calc.calculate(x,'+', y).equals(chk.toString()));
        }

        @Test(dataProvider = "DProvider")
        public void TestDiff ( Double x, Double y){
            Double chk = x-y;
            Assert.assertTrue(Calc.calculate(x,'-', y).equals(chk.toString()));
        }

        @Test(dataProvider = "DProvider")
        public void TestProd ( Double x, Double y){
            Double chk = x*y;
            Assert.assertTrue(Calc.calculate(x,'*', y).equals(chk.toString()));
        }

        @Test(dataProvider = "DProvider")
        public void TestQuot ( Double x, Double y){
            Double chk = x/y;
            Assert.assertTrue(Calc.calculate(x,'/', y).equals(chk.toString()));
        }
    // ---------------------------------------------------------------------------
        @Test(dataProvider = "DProviderSimple")
        public void TestDiffMinusNumber ( Double x){
            Double chk = Double.parseDouble(Calc.calculate(x,'-', x+1));
            Assert.assertTrue(chk<0);
        }

        @Test(dataProvider = "DProviderSimple")
        public void TestDiffPlusNumber ( Double x){
            Double chk = Double.parseDouble(Calc.calculate(-x,'-', -x-1));
            Assert.assertTrue(chk>0);
        }
    }
