package com.example.project;

public class Triangle {
    // array of Point objects
    private Point[] vertices;
   
    // Constructor: initializes the vertices array
    // to contain the three Point objects
    public Triangle(Point p1, Point p2, Point p3) {
      vertices=new Point[] {p1,p2,p3};
    }
   
    // Returns the perimeter of the Triangle
    // HINT: use the distanceTo method that you wrote in the Point class
    public double perimeter() {
      double perimeter=0;

      for(int i =1; i<vertices.length;i++){
        perimeter += vertices[i-1].distanceTo(vertices[i]);
        if(i+1 == vertices.length){
          perimeter += vertices[2].distanceTo(vertices[0]);
          break;
        }
      }
      return perimeter;
    }
 
    // Returns a String with the three vertices that make up the Triangle;
    // if the vertices are the points (6, 10), (11, 15), and (18, 7),
    // this method should return: "[(6, 10), (11, 15), (18, 7)]"
    public String triangleInfo() {
      String str = "[";
     
      for (Point p: vertices) {
        str+= p.pointInfo()+", ";
      }
      str=str.substring(0, str.length()-2);
      str += "]";
      return str;
    }


    public void shift(int amount){
      for (int index = 0; index < vertices.length; index++) {
        vertices[index].shift(amount);
      }
    }

    public Point[] getVertices(){
      return vertices;
    }
  }
