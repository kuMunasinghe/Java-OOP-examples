class Enu {
    //
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}

class Enureturn{

    public static void main(String[] args) {

        Enu nameget =new Enu();

        nameget.setName("Kasun Munasinghe");
    
        System.out.println(nameget.getName());
    }


}
