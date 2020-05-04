public class animal {
    String species="dog";
    private Double weight;

    public animal() {
        this.weight = 12.0;
    }

    void feed(){

        weight+=3;

    }
    void takeForAWalk(){

        if(weight>0) {
            weight -= 3;
            System.out.println("-3kg");

            System.out.println("waze"+weight);
        }else{
            System.out.println("dyntka");
        }
    }public String toString(){
        return species+" "+weight;
    }

}

