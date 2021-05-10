public class Vetor {
    
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Implemente um método contém, semelhante ao método contains da classe ArrayList;

    public void contem(Object contem) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (contem == this.elementos[i]) {
                contador++;
                break;
            }
        }
        if(contador != 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // Implemente um método semelhante ao método lastIndexOf da classe ArrayList;

    public void lastIndexOf (Object contem) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (contem == this.elementos[i]) {
                contador = i;
                break;
            } else {
                contador = -1;
            }
        }
        if( contador != -1){
            System.out.println(contador);
        } else {
            System.out.println("-1");
        }
    }

    // Implemente o método remove(T elemento), onde será possível remover um elemento da lista passando o mesmo como parâmetro.

    public void remove(Object contem) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (contem == this.elementos[i]){
                contador = i;
                break;
            } else {
                contador = -1;
            }
        }
        if (contador == -1){
            System.out.println("Elemento inválido");
            //throw new IllegalAccessException("Elemento inválido");
        } else {
            if (this.tamanho - 1 - contador >= 0)
                System.arraycopy(this.elementos, contador + 1,
                        this.elementos, contador, this.tamanho - 1 - contador);
            this.tamanho--;
        }
    }

    // Implemente o método limpar, onde todos os elementos da lista são removidos. Esse método é semelhante ao método clear da classe ArrayList;

    public void clear() throws IllegalAccessException{
        if(!(tamanho >=0) ){
            throw new IllegalAccessException("Vetor inválido!");
        }
        this.tamanho = 0;
    }

    //adiciona o elemento no final
    public boolean adiciona(String elemento){
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