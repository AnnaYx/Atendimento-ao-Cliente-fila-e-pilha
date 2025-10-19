public class Elemento {
    String id;
    String nomeOuDescricao;
    String motivoOuDataHora;

    // Construtor usado tanto para clientes (fila) quanto para solicitações (pilha)
    public Elemento(String id, String nomeOuDescricao, String motivoOuDataHora) {
        this.id = id;
        this.nomeOuDescricao = nomeOuDescricao;
        this.motivoOuDataHora = motivoOuDataHora;
    }

    public void exibir() {
        System.out.println("ID: " + id + " | " + nomeOuDescricao + " | " + motivoOuDataHora);
    }
}
