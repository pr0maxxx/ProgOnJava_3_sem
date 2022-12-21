package ru.maksim.ikbo2021.new_pracs.prac_7.ex_1_3;

class MovablePoint implements Movable{ //класс с точкой конструктор , геттеры полей, перевод в строку, движение в 4 стороны
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "Coord (" + x + ", " + y +
                ")\nSpeed (" + xSpeed + ", " + ySpeed + ")";
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