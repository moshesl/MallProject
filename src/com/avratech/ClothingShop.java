package com.avratech;

import java.awt.*;

/**
 * Created by stu on 25/01/17.
 */
public class ClothingShop implements Shop {
    private double sqr_meters;
    private double overhead;
    private double revenue;
    private double base_rent;

    @Override
    public double x(double x) {
        return 0;
    }

    @Override
    public double y(double y) {
        return 0;
    }

    @Override
    public double size(double sqr_meters) {
        return sqr_meters;
    }

    @Override
    public double store_expenses(double overhead) {
        return overhead;
    }

    @Override
    public double gross_sales(double revenue) {
        return revenue;
    }

    @Override
    public double base_rent(double rent) {
        return rent;
    }

    private ClothingShop(double sqr_meters, double overhead, double revenue, double base_rent) {
        setBase_rent(base_rent);
        setOverhead(overhead);
        setRevenue(revenue);
        setSqr_meters(sqr_meters);
    }

    public double getSqr_meters() {
        return sqr_meters;
    }

    public double getOverhead() {
        return overhead;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getBase_rent() {
        return base_rent;
    }

    private void setSqr_meters(double sqr_meters) {
        this.sqr_meters = sqr_meters;
    }

    private void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    private void setBase_rent(double base_rent) {
        this.base_rent = base_rent;
    }
    private void setOverhead(double overhead) {
        this.overhead = overhead;
    }



}
