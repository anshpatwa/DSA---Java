public class boxes {
    static class box{
        double l;// if any of this is private then boxweight class won't be able to access it.
        double h;
        double w;
        box(double l, double h, double w) {
            this.l = l;
            this.h = h;
            this.w = w;
        }
        box(){
            this.l=-1;
            this.w=-1;
            this.h=-1;
        }
        box(box old){
            this.h=old.h;
            this.l=old.l;
            this.w=old.w;
        }
    }

    static class boxweight extends box{
        double boxweight;
        boxweight(){
            this.boxweight =-1;
        }
        boxweight(double l,double h,double w,double boxweight){
           
            super(l,h,w); // super imports only the constructor of direct above class only.
            // otherwise you can also use this.
             // this.l=l;  // wont give any error
            this.boxweight=boxweight;
        }
        boxweight(box other){
            super(other);
            this.boxweight=-1;
        }
        boxweight(boxweight other2){
            super(other2);
            boxweight=other2.boxweight;
        }
    }
    public static void main(String[] args) {
        box box1=new box();
        System.out.println("BOX 1: "+box1.l+" "+box1.w+" "+box1.h);

        box box2 = new box(10, 20, 30);
        System.out.println("BOX 2: "+box2.l+" "+box2.w+" "+box2.h);

        boxweight box3= new boxweight();
        System.out.println("BOX 3: "+box3.boxweight);

        boxweight box4 = new boxweight(5, 6, 7, 100);
        System.out.println("BOX 4: "+box4.l+" "+box4.w+" "+box4.h+" "+box4.boxweight);

        boxweight box5= new boxweight();
        System.out.println("BOX 5: "+box5.l+" "+box5.w+" "+box5.h+" "+box5.boxweight);

        box box6= new boxweight(44, 55,66, 77);// parent can refer to child.
        System.out.println("BOX 6: "+box6.w);
        // System.out.println("BOX 6: "+box6.boxweight);// parent canoot access the child class.
        // boxweight box6 = new box(1,2 , 03); // parent class has no idea what is happening in lower class.(neeche jooote chl rhe hai full)

        boxweight box7 = new boxweight(box5);
        System.out.println("BOX 7: "+box7.boxweight);

    }
}
