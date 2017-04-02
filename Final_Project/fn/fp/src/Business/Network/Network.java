/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author admin01
 */
public class Network {
    private String name;
    private int id;
    private static int count=1;
    private String region;
    private EnterpriseDirectory enterpriseDirectory;
    private CustomerDirectory customerDirectory;

    public Network() {
        id=count++;
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
