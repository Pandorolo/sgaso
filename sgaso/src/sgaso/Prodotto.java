package sgaso;

public class Prodotto {
    String nome;
    int conto;
    String descrizione;
    int n_pezzi;
    String tag;
    int codice_prodotto;
    String condizione;
    int costo_spedizione;
    String pagamento;
    boolean spediozione_sgaso;
    boolean disponibile;

    Fornitore fornitore = new Fornitore();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConto() {
        return conto;
    }

    public void setConto(int conto) {
        this.conto = conto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getN_pezzi() {
        return n_pezzi;
    }

    public void setN_pezzi(int n_pezzi) {
        this.n_pezzi = n_pezzi;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getCodice_prodotto() {
        return codice_prodotto;
    }

    public void setCodice_prodotto(int codice_prodotto) {
        this.codice_prodotto = codice_prodotto;
    }

    public String getCondizione() {
        return condizione;
    }

    public void setCondizione(String condizione) {
        this.condizione = condizione;
    }

    public int getCosto_spedizione() {
        return costo_spedizione;
    }

    public void setCosto_spedizione(int costo_spedizione) {
        this.costo_spedizione = costo_spedizione;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isSpediozione_sgaso() {
        return spediozione_sgaso;
    }

    public void setSpediozione_sgaso(boolean spediozione_sgaso) {
        this.spediozione_sgaso = spediozione_sgaso;
    }

    public boolean isDisponibile(int n_pezzi) {
        if(n_pezzi == 0)
            return false;
        return true;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "nome=" + nome + ", conto=" + conto + ", descrizione=" + descrizione + ", n_pezzi=" + n_pezzi + ", tag=" + tag + ", codice_prodotto=" + codice_prodotto + ", condizione=" + condizione + ", costo_spedizione=" + costo_spedizione + ", pagamento=" + pagamento + ", spediozione_sgaso=" + spediozione_sgaso + ", disponibile=" + disponibile + ", fornitore=" + fornitore + '}';
    }
    
    
}
