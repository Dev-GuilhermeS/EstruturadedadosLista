public class Vetor {
    
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Exercicio 1 - Lista

    public void verificar(Object verifica) {
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (verifica == this.elementos[i]) {
                cont++;
                break;
            }
        }
        if(cont != 0){
            System.out.println("Existente");
        } else {
            System.out.println("Não Existente");
        }
    }

    // Exercicio 2 - Lista

    public void lastIndexOf (Object verifica) {
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (verifica == this.elementos[i]) {
                cont = i;
                break;
            } else {
                cont = -1;
            }
        }
        if( cont != -1){
            System.out.println(cont);
        } else {
            System.out.println("-1");
        }
    }

    // Exercicio 3 - Lista
    public void remover(Object verifica) {
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (verifica == this.elementos[i]){
                cont = i;
                break;
            } else {
                cont = -1;
            }
        }
        if (cont == -1){
            System.out.println("O elemento está inválido");
        } else {
            if (this.tamanho - 1 - cont >= 0)
                System.arraycopy(this.elementos, cont + 1,
                        this.elementos, cont, this.tamanho - 1 - cont);
            this.tamanho--;
        }
    }

    // Exercicio 4 - Lista
    public void limpar() throws IllegalAccessException{
        if(!(tamanho >=0) ){
            throw new IllegalAccessException("Esta inválido");
        }
        this.tamanho = 0;
    }

    //adiciona o elemento no final
    public boolean adicionar(String elemento){
        this.aumentaCapacidade();
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public int tamanho(){
        return this.tamanho;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }

        }
        return -1;
    }

    public void remover(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        
        return s.toString();
    }
}