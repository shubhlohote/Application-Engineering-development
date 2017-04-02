/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.UserAccount.Useraccount;
import java.util.Date;

/**
 *
 * @author admin01
 */
public abstract class WorkRequest {
    private String message;
    private Useraccount sender;
    private Useraccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Useraccount getSender() {
        return sender;
    }

    public void setSender(Useraccount sender) {
        this.sender = sender;
    }

    public Useraccount getReceiver() {
        return receiver;
    }

    public void setReceiver(Useraccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    public String toString()
    {
        return String.valueOf(this.getRequestDate());
    }
    
}
