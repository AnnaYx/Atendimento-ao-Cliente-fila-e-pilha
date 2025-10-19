public class Pilha {
    private No topo;

    public void insere(Elemento e) {
        No novo = new No(e);
        novo.proximo = topo;
        topo = novo;
    }

    public Elemento remove() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return null;
        }
        Elemento valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public void imprime() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("\n--- Histórico de Solicitações ---");
        No atual = topo;
        while (atual != null) {
            atual.valor.exibir();
            atual = atual.proximo;
        }
    }

    public boolean estaVazia() {
        return topo == null;
    }
}
