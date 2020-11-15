package com.pokemon;



public class Coordenadas {
    //Since we use a grid, the best option for me here was to get some 2D coordinates to set Ash in a specific position everytime he moves
    int x;
    int y;

    //Also we could use a boolean variable to know if that coordinate has a pokemon on it or not,
    // but since I needed to store every Coordinates that Ash went,
    // I can use a hashSet to store the visited coordinates
    // and for that I don't need to have one more variable in every "Coordenadas" Object and save a little more memory

    Coordenadas(int x, int y){
        this.x=x;
        this.y=y;
    }

    //setters and getters to set new coordinates or to get his own coordinates be aware of encapsulation

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //simple toString method
    @Override
    public String toString() {
        return x +","+ y;
    }


    //override equals method so I can compare 2 objects since they most probably will have different memory addresses
    @Override
    public boolean equals(Object that){
        Coordenadas thatPeople = (Coordenadas) that; // than we can cast it to Coordinate safely
        return this.x == thatPeople.getX() && this.y == thatPeople.getY();// if they have the same x and same y, then the 2 objects are equal unless they're pointing to different memory addresses
    }


    //also override hashcode because when using a
    //hashtable like I do here "visitedCords",
    //this hashcode when the objects are equal it does return the same hashcode,
    //so it is one more validation to compare objects
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;

    }

}
