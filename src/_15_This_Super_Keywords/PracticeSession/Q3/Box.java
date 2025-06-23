package _15_This_Super_Keywords.PracticeSession;

public class Box {
    int length;
    int width;
    int height;

    Box(int length, int width, int height){
        this.height=height;
        this.width=width;
        this.length=length;
    }

    public  int calculateVolume(){
        int volume=0;
        volume=this.length*this.width*this.height;
        return volume;
    }
    public static void main(String[] args){
        Box b= new Box(9,4,6);
       System.out.println( b.calculateVolume());
    }

}
