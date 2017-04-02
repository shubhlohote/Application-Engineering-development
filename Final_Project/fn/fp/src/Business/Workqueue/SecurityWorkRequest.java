/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

/**
 *
 * @author admin01
 */
public class SecurityWorkRequest extends WorkRequest{
    private String macAddress;
    private long vpn;
    private  String userName;
    private String password;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public long getVpn() {
        return vpn;
    }

    public void setVpn(long vpn) {
        this.vpn = vpn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
