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
    private Point point;
    private static ArrayList<Point>coordinates=null;


    @Override
    public Point point(int x, int y) {
        return point;
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

    private RestaurantShop(double sqr_meters, double overhead, double revenue, double base_rent, int x, int y) {
        setBase_rent(base_rent);
        setOverhead(overhead);
        setRevenue(revenue);
        setSqr_meters(sqr_meters);
        setPoint(x, y);
    }
    public  String getCoordinates(){
        return this.point.toString();
    }
//    private void getDistance(Shop other){
//        this.point.distance((Point2D) other);
//    }

    private void shortestDistance(Shop other1, Shop other2, Shop other3){
        Point origin = new Point();
        Double origin_1 = origin.distance((Point2D)other1);
        Double origin_2 = origin.distance((Point2D)other2);
        Double origin_3 = origin.distance((Point2D)other3);
        Double other1_2 = origin.distance((Point2D)other2);
        Double other1_3 = origin.distance((Point2D)other3);
        Double other2_3 = origin.distance((Point2D)other3);


    }
    private void setPoint(int x, int y) {
        if ((x<10)&&(y<10)){
            System.out.println("Coordinates must be under 10.");
            return;
        }
        if ((!(coordinates.contains(new Point(x,y))))&&((x<10)&&(y<10))){
        this.point = new Point(x, y);
        coordinates.add(this.point);}
        else{
            System.out.println("These coordinates are already used. Please set new coordinates");
        }
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
