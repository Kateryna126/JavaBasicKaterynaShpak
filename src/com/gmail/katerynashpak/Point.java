package com.gmail.katerynashpak;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToPoint(Point otherPoint) {
        int deltaX = this.x - otherPoint.getX();
        int deltaY = this.y - otherPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distanceBetweenPoints(Point point1, Point point2) {
        int deltaX = point1.getX() - point2.getX();
        int deltaY = point1.getY() - point2.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}