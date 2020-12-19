package prototype;

import java.util.Hashtable;

public class SheetMusic {
    private static Hashtable<String, MusicalNote> mapNotes = new Hashtable<String, MusicalNote>();

    public static void loadNotes() {
        mapNotes.put("Do", new Do());
        mapNotes.put("Re", new Re());
        mapNotes.put("Mi", new Mi());
        mapNotes.put("Fa", new Fa());
        mapNotes.put("Sol", new Sol());
        mapNotes.put("La", new La());
        mapNotes.put("Si", new Si());
    }

    public static MusicalNote getNote(String name) {
        MusicalNote note = mapNotes.get(name);
        return note.clone();
    }
}
