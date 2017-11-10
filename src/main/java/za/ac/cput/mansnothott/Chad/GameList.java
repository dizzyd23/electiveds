package Chad;



public class GameList {

    private String model;
    private int syncnum;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSyncNum() {
        return syncnum;
    }

    public void setSyncNum(int syncnum) {
        this.syncnum = syncnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameList gamelist = (GameList) o;

        return syncnum == gamelist.syncnum;
    }

    @Override
    public int hashCode() {
        return syncnum;
    }
}
