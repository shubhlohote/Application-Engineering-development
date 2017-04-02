/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author admin01
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
        
        
    }
    

