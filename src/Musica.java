import java.sql.Time;
import java.time.LocalDate;

public class Musica {
    public String titulo;
    public String artista;
    private double duracao;
    public String album;
    public LocalDate lancamento;
    public String letra;
    public GeneroFav genero;
    public String descricao;
    public int id;
    public int reproducoes;

    // metodo get
    public double getDuracao(){
        return duracao;
    }

    // metodo set || musica.setDuracao(3);
    public void setDuracao(double duracao){
        if (duracao > 0){
            this.duracao = duracao;
        }else{
            IO.println("A duração não pode ser negativa");
        }
    }
}
