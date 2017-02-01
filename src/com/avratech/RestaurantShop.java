package com.avratech;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Created by stu on 25/01/17.
 */
public class RestaurantShop implements Shop {

    private double sqr_meters;
    private double overhead;
    private double revenue;
    private double base_rent;
    public Point point=new Point();
    private static ArrayList<Point> coordinates= new ArrayList<>();


    @Override
    public Point point() {
        return point;
    }

    @Override
    public double size() {
        return sqr_meters;
    }

    @Override
    public double store_expenses() {
        return overhead;
    }

    @Override
    public double gross_sales() {
        return revenue;
    }

    @Override
    public double base_rent() {
        return base_rent;
    }

    public RestaurantShop(double sqr_meters, double overhead, double revenue, double base_rent, int x, int y) {
        setBase_rent(base_rent);
        setOverhead(overhead);
        setRevenue(revenue);
        setSqr_meters(sqr_meters);
        setPoint(x, y);
    }

    public String getCoordinates() {
        return this.point.toString();
    }

    private void setPoint(int x, int y) {
        this.point = new Point(x, y);
        //this.point = my;
//        if (!(x < 10) && (y < 10)) {
//            System.out.println("Coordinates must be under 10.");
//            return;
//        }
//            for (Point p : coordinates)
//                if (p.getLocation() != (this.point = new Point(x, y)).getLocation()) {
//                    this.point = new Point(x, y);
//                    coordinates.add(this.point);
//                } else {
//                    this.point = null;
//                    System.out.println("Please set new coordinates");
//                }
    }

    public Point getPoint() {
        return point;
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
