/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Collateral;

import java.util.Date;

/**
 *
 * @author admin01
 */
public class Collateral {
    private String collateralType;
    private double valuation;
    private String hazard;
    private String hazardDesciption;
    private double insuranceAmount;
    private Date ownershipDate;

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public double getValuation() {
        return valuation;
    }

    public void setValuation(double valuation) {
        this.valuation = valuation;
    }

    public String getHazard() {
        return hazard;
    }

    public void setHazard(String hazard) {
        this.hazard = hazard;
    }

    public String getHazardDesciption() {
        return hazardDesciption;
    }

    public void setHazardDesciption(String hazardDesciption) {
        this.hazardDesciption = hazardDesciption;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Date getOwnershipDate() {
        return ownershipDate;
    }

    public void setOwnershipDate(Date ownershipDate) {
        this.ownershipDate = ownershipDate;
    }
    
    
}
