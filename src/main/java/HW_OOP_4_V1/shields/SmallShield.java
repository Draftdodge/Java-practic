package HW_OOP_4_V1.shields;

public class SmallShield implements Shield {
    @Override
    public int protect() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("SmallShield, Protect: %d",protect());
    }
}
