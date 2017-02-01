package com.avratech;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.decode;

public class ShortestRoute {
        private Point point;
        private int numberOfNodes;
        private Stack<Integer> stack;

        public ShortestRoute() {
            stack = new Stack<Integer>();
        }

        public void tsp(double adjacencyMatrix[][]) {
            numberOfNodes = adjacencyMatrix[1].length - 1;
            int[] visited = new int[numberOfNodes + 1];
            visited[1] = 1;
            stack.push(1);
            int element, dst = 0, i;
            int min = Integer.MAX_VALUE;
            boolean minFlag = false;
            System.out.print(1 + "\t");

            while (!stack.isEmpty()) {
                element = stack.peek();
                i = 1;
                min = MAX_VALUE;
                while (i <= numberOfNodes) {
                    if (adjacencyMatrix[element][i] > 1 && visited[i] == 0) {
                        if (min > adjacencyMatrix[element][i]) {
                            min = (int)adjacencyMatrix[element][i];
                            dst = i;
                            minFlag = true;
                        }
                    }
                    i++;
                }
                if (minFlag) {
                    visited[dst] = 1;
                    stack.push(dst);
                    System.out.print(dst + "\t");
                    minFlag = false;
                    continue;
                }
                stack.pop();
            }
        }
//        public double findDst(RestaurantShop shop1, RestaurantShop shop2){
//            return (shop1.);
//        }

        public double[][] createMatrix(RestaurantShop...other) {
            int i = 1;
            int j = 1;
           /* Point origin = new Point(); */
            numberOfNodes = other.length;
            double[][] adjacencyMatrix = new double[other.length][other.length];
            for (RestaurantShop s : other) {
                for (RestaurantShop t : other) {
                    adjacencyMatrix[i-1][j-1] = s.point.distance(t.point);
                    j++;
                }
                i++;
            }
            return adjacencyMatrix;
        }
    }


