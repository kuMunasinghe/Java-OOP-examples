 class Standard{

    public void draw(){
        System.out.println("Draw");
    }

    public void write(){
        System.out.println("Write");
    }
 }

class Pro extends Standard{

    protected void useEffects(){
        System.out.println("Using Effects");
    }

    protected void changeResolution(){
        System.out.println("Change Resolution");
    }

    
}

public class Main_Sololearn{
    public static void main (String[] args){
        Standard standard1= new Standard();
        Pro pro1=new Pro();

        standard1.draw();
        standard1.write();

        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();

    }
}