package com.avratech;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;

/**
 * Created by stu on 25/01/17.
 */
public class RestaurantShop implements Shop {
    private double x,y;
    private double sqr_meters;
    private double overhead;
    private double revenue;
    private double base_rent;

    private static ArrayList<List>coordinates;

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

    public RestaurantShop(double sqr_meters, double overhead, double revenue, double base_rent, int x, int y) {
        setBase_rent(base_rent);
        setOverhead(overhead);
        setRevenue(revenue);
        setSqr_meters(sqr_meters);
        setX(x);
        setY(y);
    }

    public static ArrayList<List> getCoordinates() {
        return coordinates;
    }

    public static void setCoordinates(ArrayList<List> coordinates) {
        RestaurantShop.coordinates = coordinates;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
