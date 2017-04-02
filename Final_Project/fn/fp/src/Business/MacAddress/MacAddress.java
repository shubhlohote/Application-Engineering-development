/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MacAddress;

import Business.Employee.Employee;
import Business.Network.Customer;
import Business.Role.Role;
import Business.Workqueue.WorkQueue;

/**
 *
 * @author admin01
 */
public class MacAddress {
    private String macAddress;
    private long vpnCode;
    
    
    public MacAddress()
    {
        
    }
    @Override
    public String toString() {
        return macAddress;
    }

    public long getVpnCode() {
        return vpnCode;
    }

    public void setVpnCode(long vpnCode) {
        this.vpnCode = vpnCode;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    
    
    
    
}
