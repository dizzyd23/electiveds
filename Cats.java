package Tanaka;

public class Cats {

    private int catsNumber;
    private  String name;
    private int manu;


    public Cats(Builder builder) {
        catsNumber=builder.catsNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int catsNumber;
        private  String name;
        private int manu;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder manu(int value){
            this.manu=value;
            return this;
        }


        public Builder catsNumber(int value){
            this.catsNumber=value;
            return this;
        }

        public Cats build(){
            return new Cats(this);
        }

    }

    public int getCatsNumber() {
        return catsNumber;
    }

    public String getName() {
        return name;
    }

    public int getManu() {
        return manu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cats)) return false;

        Cats student = (Cats) o;

        return carNumber == student.carNumber;
    }

    @Override
    public int hashCode() {
        return catsNumber;
    }

}
