package Dominic;



public class FishList {

    private String type;
    private int datnum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return datnum;
    }

    public void setNum(int datnum) {
        this.datnum = datnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FishList fishlist = (FishList) o;

        return datnum == fishlist.datnum;
    }

    @Override
    public int hashCode() {
        return datnum;
    }
}
