package Package;

public class Ball {

        private float x;
        private float y;
        private int radius;
        private float xDelta;
        private float yDelta;

    public Ball (){
        this.x=x;
        this.y=y;
        int radius = this.radius;
        float xDelta = this.xDelta;
        float yDelta1 = this.yDelta;



    }

    public  float getX () {
        return x;

    }
    public void setX(float x) {
        this.x=x;
    }



    public  float getY () {
        return y;

    }

    public void sety(float y) {
        this.x=x ;
    }



    public  int  getradius () {
        return radius;

    }
    public void setradius(int radius) {
        this.radius=radius;
    }



    public  float  getxDelta() {
        return xDelta;
    }
    public void setxDelta(float xDelta) {
        this.xDelta=xDelta;

    }



    public  float  getyDelta() {
        return yDelta;
    }
    public void setyDelta(float yDelta) {
        this.yDelta=yDelta;



    }
    public void move(){
        x=x+xDelta;
        y=y+yDelta;
    }


    public void refectHorizontal(){

        xDelta = -xDelta;

    }
    public void refectVertical (){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
