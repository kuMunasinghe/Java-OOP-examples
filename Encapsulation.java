class Encapsulation {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Nameprinter {
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setName("KasunMunasinghe");
        System.out.println(s.getName());

    }
}

