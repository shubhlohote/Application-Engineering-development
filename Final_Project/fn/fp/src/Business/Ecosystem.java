/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Department.Department;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class Ecosystem extends Department {
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    public static Ecosystem getInstance()
    {
        if(business == null)
        {
            business= new Ecosystem();
            
        }
        return business;
    }
    private Ecosystem()
    {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

   public Network createAndAddNetwork()
   {
       Network network =new Network();
       networkList.add(network);
        return network;
   }
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AdminRole());
        return roleList;
    }

    
    
    
    
}
