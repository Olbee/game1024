package game1024.core;

public class Tile {
    private int value;
    private TileState state;

    public Tile(int value) {
        this.value = value;
        this.state = TileState.EMPTY;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.state = TileState.OCCUPIED;
    }

    public void setState(TileState state) {
        this.state = state;
    }

    public TileState getState() {
        return state;
    }

}