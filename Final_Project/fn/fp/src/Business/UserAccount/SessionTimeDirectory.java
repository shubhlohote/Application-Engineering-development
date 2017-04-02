/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin01
 */
public class SessionTimeDirectory {
    private ArrayList<SessionTime> sessionList;

    public SessionTimeDirectory() {
        sessionList = new ArrayList<>();
    }

    public ArrayList<SessionTime> getSessionList() {
        return sessionList;
    }
public SessionTime createSessionTime(Date login,Date logout)
{
    SessionTime sessionTime=new SessionTime();
    sessionTime.setLoginTime(login);
    sessionTime.setLogoutTime(logout);
    sessionList.add(sessionTime);
    return  sessionTime;
}
    public void setSessionList(ArrayList<SessionTime> sessionList) {
        this.sessionList = sessionList;
    }
    
    
}
