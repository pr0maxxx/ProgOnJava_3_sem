package ru.maksim.ikbo2021.new_pracs.prac_6.ex_1_2;

class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Radius: " + radius + "\nCenter:\n" + center.toString();
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
        center.moveDown();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    public void moveRight(){
        center.moveRight();
    }
}