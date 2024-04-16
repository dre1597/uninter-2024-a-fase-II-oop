package livro;

public class LivroFisico extends Livro{
  private int tiragem;
  private int peso;

  public LivroFisico() {

  }

  public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso) {
    super(titulo, autor, genero, edicao);
    this.tiragem = tiragem;
    this.peso = peso;
  }

  @Override
  void info() {
    super.info();
    System.out.println("Tiragem: " + tiragem);
    System.out.println("Peso: " + peso);
  }

  public int getTiragem() {
    return tiragem;
  }

  public void setTiragem(int tiragem) {
    this.tiragem = tiragem;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }
}
