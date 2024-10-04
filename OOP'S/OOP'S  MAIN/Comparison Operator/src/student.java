public class student implements Comparable<student> {
    int roll_no;
    float marks;
    public student(int roll_no,float marks){
        this.roll_no=roll_no;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(student o) {
        int diff =(int)(this.marks- o.marks);
        // if diff ==0 : means both are equal
        // if diff<-: means 0 is bigger or smaller.
        return diff;
    }
}
