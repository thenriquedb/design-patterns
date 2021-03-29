package behavioral.iterator;

class Animal {
    private String name;

    private String _class;

    public Animal(String name, String _class) {
        this.name = name;
        this._class = _class;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclass() {
        return this._class;
    }

    public void setclass(String _class) {
        this._class = _class;
    }
}

