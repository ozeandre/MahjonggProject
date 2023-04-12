public class Piece {
    String categorie;
    int numero;
    public Piece(String categorie, int numero) {
        this.categorie = categorie;
        this.numero = numero;
    }
    public String getCategorie() {
        return this.categorie;
    }
    public int getNumero() {
        return this.numero;
    }
    public String toString() {
        return this.categorie.toUpperCase() + this.numero;
    }
}