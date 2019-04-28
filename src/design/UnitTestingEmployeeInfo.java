package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(10000,8),20000);
        Assert.assertEquals(EmployeeInfo.calculateEmployeePension(5000),1000);

        Assert.assertEquals(200,200);

    }
}
