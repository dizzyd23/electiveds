package Rowan;

public class Smartphones {

    private int SmartphonesNumber;
    private  String name;
    private int manu;


    public Smartphones(Builder builder) {
        smartphonesNumber=builder.smartphonesNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int smartphonesNumber;
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


        public Builder smartphonesNumber(int value){
            this.carNumber=value;
            return this;
        }

        public Smartphones build(){
            return new Smartphones(this);
        }

    }

    public int getSmartphonesNumber() {
        return smartphonesNumber;
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
        if (!(o instanceof Smartphones)) return false;

        Smartphones student = (Smartphones) o;

        return smartphonesNumber == student.smartphonesNumber;
    }

    @Override
    public int hashCode() {
        return smartphonesNumber;
    }

}
