package sgaso;

public class Fornitore {
    String luogo;

    public Fornitore() {}

    public Fornitore(String luogo) {
        this.luogo = luogo;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    @Override
    public String toString() {
        return "Fornitore{" + "luogo=" + luogo + '}';
    }
}
