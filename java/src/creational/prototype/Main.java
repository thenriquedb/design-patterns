package creational.prototype;

public class Main {
    public static void main(String[] args) {
        SheetMusic.loadNotes();

        MusicalNote note1 = SheetMusic.getNote("Do");
        MusicalNote note2 = SheetMusic.getNote("Re");
        MusicalNote note3 = SheetMusic.getNote("Re");
        MusicalNote note4 = SheetMusic.getNote("Mi");
        MusicalNote note5 = SheetMusic.getNote("Fa");
        MusicalNote note6 = SheetMusic.getNote("Fa");


        note1.draw();
        note2.draw();
        note3.draw();
        note4.draw();
        note5.draw();
        note6.draw();
    }
}
