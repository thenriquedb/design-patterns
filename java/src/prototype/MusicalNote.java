package prototype;

public abstract class MusicalNote implements Cloneable{
    @Override
    public MusicalNote clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (MusicalNote) clone;
    }

    public abstract void draw();
}
