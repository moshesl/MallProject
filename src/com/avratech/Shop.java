package com.avratech;

import java.awt.*;

/*
 * Created by stu on 25/01/17.
 */
public interface Shop {
    double size(double sqr_meters);
    double store_expenses(double overhead);
    double gross_sales(double revenue);
    double base_rent(double rent);
    double x(double x);
    double y(double y);

}
