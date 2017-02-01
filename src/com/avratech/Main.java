package com.avratech;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Mall m = new Mall("Kobe's mall", new Owner(), new Location(City.JERUSALEM, "", 1));
    RestaurantShop m = new RestaurantShop(1,1,1,1,5,5);
        RestaurantShop n = new RestaurantShop(1,1,1,1,7,9);
        RestaurantShop o = new RestaurantShop(1,1,1,1,4,9);
        RestaurantShop p = new RestaurantShop(1,1,1,1,1,2);
        RestaurantShop q = new RestaurantShop(1,1,1,1,7,5);
        RestaurantShop r = new RestaurantShop(1,1,1,1,3,1);
        RestaurantShop s = new RestaurantShop(1,1,1,1,8,2);
        RestaurantShop t = new RestaurantShop(1,1,1,1,0,2);


        ShortestRoute shortestRoute = new ShortestRoute();
        shortestRoute.tsp(shortestRoute.createMatrix(m,n,o,p,q,r,s,t));
    }
}
