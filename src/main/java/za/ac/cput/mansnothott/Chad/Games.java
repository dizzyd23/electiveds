package Chad;

public class Games {

    private int gameNumber;
    private  String name;
    private int manu;


    public Games(Builder builder) {
        gameNumber=builder.gameNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int gameNumber;
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


        public Builder gameNumber(int value){
            this.gameNumber=value;
            return this;
        }

        public Games build(){
            return new Games(this);
        }

    }

    public int getGameNumber() {
        return gameNumber;
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
        if (!(o instanceof Games)) return false;

        Games student = (Games) o;

        return gameNumber == student.gameNumber;
    }

    @Override
    public int hashCode() {
        return gameNumber;
    }

}
