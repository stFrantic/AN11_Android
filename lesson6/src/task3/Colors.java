package task3;

public enum Colors {
    RED((byte)255,(byte)0, (byte)0),
    GREEN((byte)0,(byte)255, (byte)0),
    BLUE((byte)0,(byte)0, (byte)255);
    private byte x;
    private byte y;
    private byte z;
    Colors(byte x, byte y, byte z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public byte getX() {
        return x;
    }

    public byte getY() {
        return y;
    }

    public byte getZ() {
        return z;
    }
}
