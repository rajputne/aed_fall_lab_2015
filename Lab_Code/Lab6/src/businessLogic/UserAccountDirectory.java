/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessLogic;

import java.util.ArrayList;

/**
 *
 * @author Bala
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }

    /**
     * @return the userAccountList
     */
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    /**
     * @param userAccountList the userAccountList to set
     */
    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
     public UserAccount AddUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
            
}
