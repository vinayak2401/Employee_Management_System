package JDBC.EMS;
import java.sql.SQLException;

import com.ems.dao.EmployeeDao;
import com.ems.dao.EmployeeDaoImpl;
import com.ems.entity.*;
/**
 * Hello world!
 
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Employee emp=new Employee(115,"Man","Singh",24,"Ece",65000.00,"2023-09-11");
        try {
        EmployeeDao dao=new EmployeeDaoImpl();
        boolean result=dao.addEmployee(emp);
        if(result==true) {
        	System.out.println("added");
        }else {
        	System.out.println("not added");
        }
        dao.getEmployeeList();
        dao.getEmployeeId(112);
        dao.deleteEmployeeById(10);
        dao.updateEmployeeById(113);
        dao.updateEmployeeByName("Ece");
        dao.displayAscendingOrder();
        dao.getEmployeeByAge20and30(20, 30);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
    }
}
