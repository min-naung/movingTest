public class GraphicsOperation {
    public boolean grid = false;

    public boolean getGrid() {
        return grid;
    }

    public void setGrid( boolean grid ) {
        this.grid = grid;
    }

    void setGridOn()  {
        grid = true;
    }

    void setGridOff() {
        grid = false;
    }
}
