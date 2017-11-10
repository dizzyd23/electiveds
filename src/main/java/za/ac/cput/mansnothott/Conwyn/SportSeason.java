package Conwyn;

public class SportsSeason {

    private int SportSeasonNumber;
    private  String name;
    private int manu;


    public SportSeason(Builder builder) {
        SportSeasonNumber=builder.SportSeasonNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int SportSeasonNumber;
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


        public Builder SportSeasonNumber(int value){
            this.SportSeasonNumber=value;
            return this;
        }

        public SportSeason build(){
            return new SportSeason(this);
        }

    }

    public int getSportSeasonNumber() {
        return SportSeasonNumber;
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
        if (!(o instanceof SportSeason)) return false;

        SportSeason student = (SportSeason) o;

        return SportSeasonNumber == student.SportSeasonNumber;
    }

    @Override
    public int hashCode() {
        return SportSeasonNumber;
    }

}
