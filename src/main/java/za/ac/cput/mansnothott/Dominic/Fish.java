package Dominic;

public class Dominic {

    private int fishNumber;
    private  String type;
    private int skeem;


    public Fish(Builder builder) {
        fishNumber=builder.fishNumber;
        type=builder.type;
        skeem=builder.skeem;

    }

    public static class Builder{
        private int fishNumber;
        private  String type;
        private int skeem;

        public Builder type(String value){
            this.type=value;
            return this;
        }

        public Builder skeem(int value){
            this.skeem=value;
            return this;
        }


        public Builder fishNumber(int value){
            this.fishNumber=value;
            return this;
        }

        public Fish build(){
            return new Fish(this);
        }

    }

    public int getFishNumber() {
        return fishNumber;
    }

    public String getType() {
        return type;
    }

    public int getSkeem() {
        return skeem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;

        Fish student = (Fish) o;

        return fishNumber == student.fishNumber;
    }

    @Override
    public int hashCode() {
        return fishNumber;
    }

}
