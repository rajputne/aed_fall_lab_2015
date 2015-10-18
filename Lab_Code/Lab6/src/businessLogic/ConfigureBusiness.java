 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

/**
 *
 * @author Bala
 */
public class ConfigureBusiness {
    public static Business initializeBusiness(){
        Business business = Business.getInstance();
        Employee employee = business.getEmployeeDirectory().AddEmployee();
        employee.setFirstName("Admin");
        employee.setLastName("Admin");
        employee.setOrganization("NEU");
        UserAccount userAccount = business.getUserAccountDirectory().AddUserAccount();
        userAccount.setUserName("admin");
        userAccount.setPassword("admin");
        userAccount.setPerson(employee);
        userAccount.setRole(UserAccount.ADMIN_ROLE);
        userAccount.setIsActive("Yes");
        return business;
    }
}
