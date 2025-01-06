package com.example.project;
public class Point {
    private int x;
    private int y;
   
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX(){
      return x;
    }

    public int getY(){
      return y;
    }


    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
        double a=Math.pow((x-other.x),2.0);
        double b=Math.pow((y-other.y),2.0);
       
      return (Math.sqrt(a+b));
    }
 
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "("+x+", "+y+")";
    }


    public void shift(int amount){
      x+=amount;
      y+=amount;
    }

}