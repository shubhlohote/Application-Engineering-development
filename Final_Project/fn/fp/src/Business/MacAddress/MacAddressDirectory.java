/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MacAddress;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.Useraccount;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class MacAddressDirectory {
    private ArrayList<MacAddress> macAddressList;
    public MacAddressDirectory()
    {
        macAddressList= new ArrayList<>();
    }

    public ArrayList<MacAddress> getMacAddressList() {
        return macAddressList;
    }
    public MacAddress authenticateMac(String macAddress)
    {
        for (MacAddress ma:macAddressList)
        {
            if(ma.getMacAddress().equals(macAddress))
            {
                return ma;
            }
        }
        return null;
    }
    
    public MacAddress createMacAddress(String macAddress,long  vpn)
    {
        MacAddress ma=new MacAddress();
        ma.setMacAddress(macAddress);
        ma.setVpnCode(vpn);
        //ma.setEmployee(employee);
        //ma.setRole(role);
        macAddressList.add(ma);
        return ma;
    }
    
}
