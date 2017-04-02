/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.Date;

/**
 *
 * @author admin01
 */
public class SessionTime {
    private  Date loginTime;
    private Date logoutTime;
    private static int sessionId;
    private int count=1;

    public SessionTime() {
        sessionId=count++;
        
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public static int getSessionId() {
        return sessionId;
    }

    public static void setSessionId(int sessionId) {
        SessionTime.sessionId = sessionId;
    }
    @Override
    public String toString()
    {
        return String.valueOf(this.getSessionId());
        
    }
    
    
    
}
