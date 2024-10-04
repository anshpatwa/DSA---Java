public class weight extends boxes {
    double weight ;

    public weight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;
    }
    public weight(){
        super();
        this.weight=-100;
    }

    public weight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
