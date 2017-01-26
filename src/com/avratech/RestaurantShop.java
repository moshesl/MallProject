package com.avratech;

/**
 * Created by stu on 25/01/17.
 */
public class RestaurantShop implements Shop {

    double sqr_meters = 0;
    double overhead = 0;
    double revenue = 0;
    double base_rent = 0;

    @Override
    public double size(double sqr_meters) {
        return 0;
    }

    @Override
    public double store_expenses(double overhead) {
        return 0;
    }

    @Override
    public double gross_sales(double revenue) {
        return 0;
    }

    @Override
    public double base_rent(double rent) {
        return 0;
    }

    private RestaurantShop(double sqr_meters, double overhead, double revenue, double base_rent) {
        this.sqr_meters = sqr_meters;
        this.overhead = overhead;
        this.revenue = revenue;
        this.base_rent = base_rent;
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

    public void setSqr_meters(double sqr_meters) {
        this.sqr_meters = sqr_meters;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setBase_rent(double base_rent) {
        this.base_rent = base_rent;
    }
    public void setOverhead(double overhead) {
        this.overhead = overhead;
    }



}
