package Chedia;

public class Cat {

    private String catColour;
    private  String breed;
    private int skeem;


    public Cat(Builder builder) {
        catColour=builder.catColour;
        breed=builder.breed;
        skeem=builder.skeem;

    }

    public static class Builder{
        private String catColour;
        private  String breed;
        private int skeem;

        public Builder breed(String value){
            this.breed=value;
            return this;
        }

        public Builder skeem(int value){
            this.skeem=value;
            return this;
        }


        public Builder catColour(String value){
            this.catColour=value;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }

    }

    public int getCatColour() {
        return catColour;
    }

    public String getBreed() {
        return breed;
    }

    public int getSkeem() {
        return skeem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat kittie = (Cat) o;

        return catColour == kittie.catColour;
    }

    @Override
    public int hashCode() {
        return catColour;
    }

}
