import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestCalc {
    @DataProvider(name = "DProvider")
    public Object[][] DProvider(Method m) {
        switch (m.getName()) {
            case "TestSum":
                return new Object[][]{{2, 3}};
            case "TestDiff":
                return new Object[][]{{3, 3}};
            case "TestProd":
                return new Object[][]{{3, 4}};
            case "TestQuot":
                return new Object[][]{{16.0, 8.0}};
        }
        return null;
    }
        @Test(dataProvider = "DProvider")
        public void TestSum ( int x, int y){
            Assert.assertTrue(Calc.sum(x, y)==x+y);
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
        public void TestQuot ( double x, double y){
            Assert.assertTrue(Calc.quot(x, y)==x/y);
        }
    }
