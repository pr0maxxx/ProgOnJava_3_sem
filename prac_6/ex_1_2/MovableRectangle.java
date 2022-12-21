package ru.maksim.ikbo2021.new_pracs.prac_6.ex_1_2;

class MovableRectangle implements Movable{
    private MovablePoint LeftUp;
    private MovablePoint RightDown;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        LeftUp = new MovablePoint(x1, y1, xSpeed, ySpeed);
        RightDown = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp(){
        LeftUp.moveUp();
        RightDown.moveUp();
    }

    public void moveDown(){
        LeftUp.moveDown();
        RightDown.moveDown();
    }

    public void moveLeft(){
        LeftUp.moveLeft();
        RightDown.moveLeft();
    }

    public void moveRight(){
        LeftUp.moveRight();
        RightDown.moveRight();
    }

    public boolean checkForSameSpeed(){
        return ((LeftUp.getXSpeed() == RightDown.getXSpeed())&&(LeftUp.getYSpeed() == RightDown.getYSpeed()));
    }

    public String toString(){
        return "Left Up point:\n" + LeftUp.toString() + "\nRight Down point:\n" +RightDown.toString();
    }
}