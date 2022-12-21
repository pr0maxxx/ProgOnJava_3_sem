package ru.maksim.ikbo2021.new_pracs.prac_6.ex_1_2;

class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed(){
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public String toString(){
        return "Coord =x: " + x + " y: " + y +
                "\nSpeed = x: " + xSpeed + " y: " + ySpeed;
    }

    public void moveUp(){
        y += ySpeed;
    }

    public void moveDown(){
        y -= ySpeed;
    }

    public void moveLeft(){
        x -= xSpeed;
    }

    public void moveRight(){
        x += xSpeed;
    }

}