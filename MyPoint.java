package Package;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(){}
    public MyPoint(int x , int t){
        this.x=x;
        this.y=y;


    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    private  int getY(){

        return y;
    }
    public void setY( int y ){
        this.y=y;
    }

    public int[] getXY() {
        int[] array = {1, 2};
        return array;

    }
    public void setxy(int x, int y){
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
