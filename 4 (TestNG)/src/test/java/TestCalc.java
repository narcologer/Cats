import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestCalc {
    @DataProvider(name = "DProvider")
    public Object[][] DProvider(Method m) {
        switch (m.getName()) {
            case "TestSumMaxInt":
                return new Object[][]{{2147483647, 2147483647+1}};
            case "TestDiff":
                return new Object[][]{{3, 3}};
            case "TestProd":
                return new Object[][]{{3, 4}};
            case "TestQuotZero":
                return new Object[][]{{16.0, 0.0}};
        }
        return null;
    }
        @Test(dataProvider = "DProvider")
        public void TestSumMaxInt ( int x, int y){
            Assert.assertTrue(Calc.sum(x, 1)==y);
        }

        @Test(dataProvider = "DProvider")
        public void TestDiff ( int x, int y){
            Assert.assertTrue(Calc.diff(x, y)==x-y);
        }

        @Test(dataProvider = "DProvider")
        public void TestProd ( int x, int y){
            Assert.assertTrue(Calc.prod(x, y)==x*y);
        }

        @Test(dataProvider = "DProvider")
        public void TestQuotZero ( double x, double y){
            Assert.assertTrue(Calc.quot(x, y)==0);
        }
    }
