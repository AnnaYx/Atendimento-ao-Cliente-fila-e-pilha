public class Fila {
    private No inicio;
    private No fim;

    public void insere(Elemento e) {
        No novo = new No(e);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public Elemento remove() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }
        Elemento valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return valor;
    }

    public void imprime() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("\n--- Fila de Atendimento ---");
        No atual = inicio;
        while (atual != null) {
            atual.valor.exibir();
            atual = atual.proximo;
        }
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
