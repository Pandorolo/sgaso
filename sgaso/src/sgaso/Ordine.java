package sgaso;

public class Ordine {
    int quantita;
    int n_ordine;
    String indirizzo;

    public Ordine() {}
    
    public Ordine(int quantita, int n_ordine, String indirizzo) {
        this.quantita = quantita;
        this.n_ordine = n_ordine;
        this.indirizzo = indirizzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public int getN_ordine() {
        return n_ordine;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setN_ordine(int n_ordine) {
        this.n_ordine = n_ordine;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Ordine{" + "quantita=" + quantita + ", n_ordine=" + n_ordine + ", indirizzo=" + indirizzo + '}';
    }
}
