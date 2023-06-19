package HW_OOP_4_V1.shields;

public class BigShield implements Shield{
    @Override
    public int protect() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("BigShield, Protect: %d",protect());
    }
}
