package com.avratech;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by stu on 31/01/17.
 */
public class ShortestRoute {
    private Point point;
    int number_of_nodes;


    public double[][]createMatrix(Shop...other) {
        Point origin = new Point();
        number_of_nodes = other.length;
        double[][] matrix = new double[0][];
        for (Shop s : other
                ) {
            int i = 1;
            i++;
            for (Shop t : other
                    ) {
                int j = 1;
                j++;
                matrix = new double[other.length][other.length];
                matrix[i][j] = ((Point2D) s).distance((Point2D) t);
            }

        }
        return matrix;
    }





    public class TSPNearestNeighbour {
        private int numberOfNodes;
        private Stack<Integer> stack;

        public TSPNearestNeighbour() {
            stack = new Stack<Integer>();
        }

        public void tsp(int adjacencyMatrix[][]) {
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
                min = Integer.MAX_VALUE;
                while (i <= numberOfNodes) {
                    if (adjacencyMatrix[element][i] > 1 && visited[i] == 0) {
                        if (min > adjacencyMatrix[element][i]) {
                            min = adjacencyMatrix[element][i];
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
    }
}

