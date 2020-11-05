package org.example;

public class Point {
    int x;
    int y;
    static int z=0;

   public Point (int x,int y){
       this.x=x;
       this.y=y;
   }
    public Point (){

    }
    public String toString(){
       return x +" "+ z;
    }
    public void setZ(int z){
        this.z=z;
    }
    public void setX(int x){
       this.x=x;
    }
}


