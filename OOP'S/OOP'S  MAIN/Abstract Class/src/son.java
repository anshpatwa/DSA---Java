public class son extends parent{
    public son(String career,String name) {
        this.career=career;
        this.name=name;
    }

    @Override
    void career(){
        System.out.println("i am going to be a "+career);
    }
    @Override
     void partner(){
        System.out.println("I love "+name);
    }
}
