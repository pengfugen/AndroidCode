package pfg.com.server;

public class Frame {
    public byte[] mData;
    public int offset;
    public int length;

    public Frame(byte[] data, int offset, int size) {
        mData = data;
        this.offset = offset;
        this.length = size;
    }

    public void setFrame(byte[] data, int offset, int size) {
        mData = data;
        this.offset = offset;
        this.length = size;
    }
}
