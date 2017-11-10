package Jeanan;

public class Movies {

    private int movieNumber;
    private  String name;
    private int manu;


    public Movies(Builder builder) {
        movieNumber=builder.movieNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int movieNumber;
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


        public Builder movieNumber(int value){
            this.movieNumber=value;
            return this;
        }

        public Movies build(){
            return new Movies(this);
        }

    }

    public int getMovieNumber() {
        return movieNumber;
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
        if (!(o instanceof Movies)) return false;

        Movies student = (Movies) o;

        return movieNumber == student.movieNumber;
    }

    @Override
    public int hashCode() {
        return movieNumber;
    }

}
