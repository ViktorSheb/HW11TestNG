import homeworkEight2.Employee;
import homeworkEight2.EmployeeUtils;
import homeworkEight2.Worker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {

    @Test
    public void findByNameTest(){
        Assert.assertEquals(EmployeeUtils.findByName(EmployeeData.name, EmployeeData.getEmployeesData()), 1);

    }

    @Test
    public static void findBySubNameTest(){
        Assert.assertEquals(EmployeeUtils.findBySubName(EmployeeData.subName ,
                                EmployeeData.findBySubName()), 0);

    }

    @Test
    public static void salarySum(){

        Assert.assertEquals(EmployeeUtils.salarySum(EmployeeData.salarySum()), 1000);
    }
    @Test
    public static void findSumOfSalaries(){
       // Assert.assertEquals();

    }

    @Test
    public static void findMaxSalary(){
        Assert.assertEquals(EmployeeUtils.findMaxSalary(EmployeeData.salaryMaxSum()),1500);
    }

    @Test
    public static void findMinSalary(){
        Assert.assertEquals(EmployeeUtils.findMinSalary(EmployeeData.salaryMinSum()), 3000);
    }

    @Test
    public static void findMinNumberOfSubordinates(){
        Assert.assertEquals(EmployeeUtils.findMinNumberOfSubordinates(EmployeeData.findMinNumberOfSubordinates()),
                1);
    }


}
