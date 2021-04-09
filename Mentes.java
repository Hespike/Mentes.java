public class Mentes {
    private int gameSave = 0;

    public void completeLevel(int index) {
        gameSave = gameSave | (1 << index);
    }

    public boolean isCompleted(int index) {
        return (gameSave & (1 << index)) != 0;
    }

    public void reset() {
        gameSave = 0;
    }
}
