public class boxes {
    double l;
    double h;
    double w;
//    double side;

    public boxes(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public boxes(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public boxes(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

}
