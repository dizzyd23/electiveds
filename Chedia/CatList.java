package Chedia;



public class CatList {

    private String breed;
    private String colour;

    public String getBreed() {
        return type;
    }

    public void setBreed(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CatList catlist = (CatList) o;

        return colour == catlist.colour;
    }

    @Override
    public int hashCode() {
        return colour;
    }
}
