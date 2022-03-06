interface Interface{
    void getArea(float w,float h);
}

class InterfaceClass implements Interface{
    public void getArea(float w,float h){
        System.out.println("The area of space is "+ (w*h));
    }
}

class Main{
    public static void main(String[] args) {
        InterfaceClass n=new InterfaceClass();
        n.getArea(5, 6);
    }
}