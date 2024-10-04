public class price extends weight{
    double price;

    public price(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }
    public price(){
        super();
        this.price=0;
    }

    public price(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
