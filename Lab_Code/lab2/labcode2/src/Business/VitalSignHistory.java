/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignHistory() {
        this.vitalSignList = new ArrayList<>();
    }
    
    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign();
        vitalSignList.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        vitalSignList.remove(vitalSign);
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
}
