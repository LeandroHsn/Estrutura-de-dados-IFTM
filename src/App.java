import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(5);
        Vetor vetorLastIndexOf  = new Vetor(5);
        Vetor vetorRemove = new Vetor(5);
        Vetor vetorClear = new Vetor(5);

        vetor.adiciona("Leandro");
        vetor.adiciona("Roberto");
        vetor.adiciona("Joaquim");
        vetor.adiciona("Fernando");

        // Implemente um método contém, semelhante ao método contains da classe ArrayList;
        System.out.println("\nExercício 1.\n ");

        vetor.contem("Leandro"); // True
        vetor.contem("Leandru"); // False
        vetor.contem("Fernando"); // True
        vetor.contem("Joaquim"); // True

        // Implemente um método semelhante ao método lastIndexOf da classe ArrayList;
        System.out.println("\nExercício 2.\n ");

        vetorLastIndexOf.adiciona("Leandro");       // 0
        vetorLastIndexOf.adiciona("Alessandro");    // 1
        vetorLastIndexOf.adiciona("Roberto");       // 2
        vetorLastIndexOf.adiciona("Fofão");         // 3

        vetorLastIndexOf.lastIndexOf("Fofão");       // Return 3
        vetorLastIndexOf.lastIndexOf("Leandro");     // Return 0
        vetorLastIndexOf.lastIndexOf("Fofinho");     // Return -1

        // Implemente o método remove(T elemento), onde será possível remover um elemento da lista passando o mesmo como parâmetro.
        System.out.println("\nExercício 3.\n ");

        vetorRemove.adiciona("Astolfo");
        vetorRemove.adiciona("Rodolfo");
        vetorRemove.adiciona("Maldolfo");
        vetorRemove.adiciona("Juliana");

        System.out.println("Vetor com Rodolfo: " + vetorRemove);        // Vetor completo
        vetorRemove.remove("Rodolfo");   // Removendo Rodolfo
        System.out.println("Vetor sem Rodolfo: " + vetorRemove);        // Vetor sem Rodolfo
        vetorRemove.remove("Jaqueline"); // Elemento inválido
        vetorRemove.remove("Juliana");   // Removendo Juliana
        System.out.println("Vetor sem Rodolfo e Juliana: " + vetorRemove);        // Vetor sem Rodolfo

        // Implemente o método limpar, onde todos os elementos da lista são removidos. Esse método é semelhante ao método clear da classe ArrayList;
        System.out.println("\nExercício 4.\n ");

        vetorClear.adiciona("Joaquim");
        vetorClear.adiciona("Francisco");
        vetorClear.adiciona("Marcio");
        vetorClear.adiciona("Helena");

        System.out.println(vetorClear); // Vetor completo
        vetorClear.clear();             // Limpando todo o vetor
        System.out.println(vetorClear); // Vetor limpo

        //  Utilizando a classe Lista e a classe contato e desenvolva os seguintes itens abaixo:
        System.out.println("\nExercício 5.\n ");

        // Crie uma Lista com capacidade para 20 contatos;

        Lista<Contato> listaContatos = new Lista<>(20);

        //Insira 30 contatos na lista;
        Contato contato01 = new Contato("Contato 1", "19-01", "contato01@gmail.com");
        Contato contato02 = new Contato("Contato 2", "19-02", "contato02@gmail.com");
        Contato contato03 = new Contato("Contato 3", "19-03", "contato03@gmail.com");
        Contato contato04 = new Contato("Contato 4", "19-04", "contato04@gmail.com");
        Contato contato05 = new Contato("Contato 5", "19-05", "contato05@gmail.com");
        Contato contato06 = new Contato("Contato 6", "19-06", "contato06@gmail.com");
        Contato contato07 = new Contato("Contato 7", "19-07", "contato07@gmail.com");
        Contato contato08 = new Contato("Contato 8", "19-08", "contato08@gmail.com");
        Contato contato09 = new Contato("Contato 9", "19-09", "contato09@gmail.com");
        Contato contato10 = new Contato("Contato 10", "19-10", "contato10@gmail.com");
        Contato contato11 = new Contato("Contato 11", "19-11", "contato11@gmail.com");
        Contato contato12 = new Contato("Contato 12", "19-12", "contato12@gmail.com");
        Contato contato13 = new Contato("Contato 13", "19-13", "contato13@gmail.com");
        Contato contato14 = new Contato("Contato 14", "19-14", "contato14@gmail.com");
        Contato contato15 = new Contato("Contato 15", "19-15", "contato15@gmail.com");
        Contato contato16 = new Contato("Contato 16", "19-16", "contato16@gmail.com");
        Contato contato17 = new Contato("Contato 17", "19-17", "contato17@gmail.com");
        Contato contato18 = new Contato("Contato 18", "19-18", "contato18@gmail.com");
        Contato contato19 = new Contato("Contato 19", "19-19", "contato19@gmail.com");
        Contato contato20 = new Contato("Contato 20", "19-20", "contato20@gmail.com");
        Contato contato21 = new Contato("Contato 10", "19-21", "contato21@gmail.com");
        Contato contato22 = new Contato("Contato 11", "19-22", "contato22@gmail.com");
        Contato contato23 = new Contato("Contato 12", "19-23", "contato23@gmail.com");
        Contato contato24 = new Contato("Contato 13", "19-24", "contato24@gmail.com");
        Contato contato25 = new Contato("Contato 14", "19-25", "contato25@gmail.com");
        Contato contato26 = new Contato("Contato 15", "19-26", "contato26@gmail.com");
        Contato contato27 = new Contato("Contato 16", "19-27", "contato27@gmail.com");
        Contato contato28 = new Contato("Contato 17", "19-28", "contato28@gmail.com");
        Contato contato29 = new Contato("Contato 18", "19-29", "contato29@gmail.com");
        Contato contato30 = new Contato("Contato 19", "19-30", "contato30@gmail.com");

        //  imprima todos os elementos da lista;

        listaContatos.adiciona(contato01);
        listaContatos.adiciona(contato02);
        listaContatos.adiciona(contato03);
        listaContatos.adiciona(contato04);
        listaContatos.adiciona(contato05);
        listaContatos.adiciona(contato06);
        listaContatos.adiciona(contato07);
        listaContatos.adiciona(contato08);
        listaContatos.adiciona(contato09);
        listaContatos.adiciona(contato10);
        listaContatos.adiciona(contato11);
        listaContatos.adiciona(contato12);
        listaContatos.adiciona(contato13);
        listaContatos.adiciona(contato14);
        listaContatos.adiciona(contato15);
        listaContatos.adiciona(contato16);
        listaContatos.adiciona(contato17);
        listaContatos.adiciona(contato18);
        listaContatos.adiciona(contato19);
        listaContatos.adiciona(contato20);
        listaContatos.adiciona(contato21);
        listaContatos.adiciona(contato22);
        listaContatos.adiciona(contato23);
        listaContatos.adiciona(contato24);
        listaContatos.adiciona(contato25);
        listaContatos.adiciona(contato26);
        listaContatos.adiciona(contato27);
        listaContatos.adiciona(contato28);
        listaContatos.adiciona(contato29);
        listaContatos.adiciona(contato30);

        System.out.println(listaContatos);

        // Utilizando a classe LinkedList refaça todos os itens da questão 5;
        System.out.println("\nExercício 6.\n ");

        LinkedList<Contato> linkedListContatos = new LinkedList<>();

        linkedListContatos.add(contato01);
        linkedListContatos.add(contato02);
        linkedListContatos.add(contato03);
        linkedListContatos.add(contato04);
        linkedListContatos.add(contato05);
        linkedListContatos.add(contato06);
        linkedListContatos.add(contato07);
        linkedListContatos.add(contato08);
        linkedListContatos.add(contato09);
        linkedListContatos.add(contato10);
        linkedListContatos.add(contato11);
        linkedListContatos.add(contato12);
        linkedListContatos.add(contato13);
        linkedListContatos.add(contato14);
        linkedListContatos.add(contato15);
        linkedListContatos.add(contato16);
        linkedListContatos.add(contato17);
        linkedListContatos.add(contato18);
        linkedListContatos.add(contato19);
        linkedListContatos.add(contato20);
        linkedListContatos.add(contato21);
        linkedListContatos.add(contato22);
        linkedListContatos.add(contato23);
        linkedListContatos.add(contato24);
        linkedListContatos.add(contato25);
        linkedListContatos.add(contato26);
        linkedListContatos.add(contato27);
        linkedListContatos.add(contato28);
        linkedListContatos.add(contato29);
        linkedListContatos.add(contato30);

        System.out.println(linkedListContatos);
    }
}
