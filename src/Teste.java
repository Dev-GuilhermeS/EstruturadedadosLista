import java.util.LinkedList;

public class Teste {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(4);
        Vetor ultimoIndice  = new Vetor(4);
        Vetor vetRemover = new Vetor(4);
        Vetor vetLimpar = new Vetor(4);

        vetor.adicionar("Iara");
        vetor.adicionar("Guilherme");
        vetor.adicionar("Carlos");
        vetor.adicionar("Livia");
        vetor.adicionar("Juliana");
        System.out.println("------>Exercicio 1<------");

        // Exercicio 1 - Lista

        vetor.verificar("Robert");
        vetor.verificar("Livia");
        System.out.println("------>Exercicio 2<------");
        // Exercicio 2 - Lista

        ultimoIndice.adicionar("Iara");
        ultimoIndice.adicionar("Leonardo");
        ultimoIndice.adicionar("Guilherme");
        ultimoIndice.adicionar("Lucas");

        ultimoIndice.lastIndexOf("Lucas");
        ultimoIndice.lastIndexOf("Mateus");
        System.out.println("------>Exercicio 3<------");

        // Exercicio 3 - Lista

        vetRemover.adicionar("Elen");
        vetRemover.adicionar("João");
        vetRemover.adicionar("Wendel");
        vetRemover.adicionar("Iago");
        vetRemover.adicionar("Vitória");

        System.out.println(vetRemover);
        vetRemover.remover("Wendel");
        System.out.println(vetRemover);
        vetRemover.remover("Vitória");
        System.out.println(vetRemover);
        System.out.println("------>Exercicio 4<------");

        // Exercicio 4 - Lista

        vetLimpar.adicionar("Arthur");
        vetLimpar.adicionar("Rubens");
        vetLimpar.adicionar("Caroline");
        vetLimpar.adicionar("Rafaela");
        vetLimpar.adicionar("Beatriz");

        System.out.println(vetLimpar);
        vetLimpar.limpar();
        System.out.println(vetLimpar);
        System.out.println("------>Exercicio 5<------");

        // Exercicio 5 Lista

        Lista<Contato> listaDeContatos = new Lista<>(20);

        Contato C01 = new Contato("Contato A", "01-02", "C01@email.com");
        Contato C02 = new Contato("Contato B", "03-04", "C02@email.com");
        Contato C03 = new Contato("Contato C", "05-06", "C03@email.com");
        Contato C04 = new Contato("Contato D", "07-08", "C04@email.com");
        Contato C05 = new Contato("Contato E", "09-10", "C05@email.com");
        Contato C06 = new Contato("Contato F", "11-12", "C06@email.com");
        Contato C07 = new Contato("Contato G", "13-14", "C07@email.com");
        Contato C08 = new Contato("Contato H", "15-16", "C08@email.com");
        Contato C09 = new Contato("Contato I", "17-18", "C09@email.com");
        Contato C10 = new Contato("Contato J", "19-20", "C10@email.com");
        Contato C11 = new Contato("Contato K", "21-22", "C11@email.com");
        Contato C12 = new Contato("Contato L", "23-24", "C12@email.com");
        Contato C13 = new Contato("Contato M", "25-26", "C13@email.com");
        Contato C14 = new Contato("Contato N", "27-28", "C14@email.com");
        Contato C15 = new Contato("Contato O", "29-30", "C15@email.com");
        Contato C16 = new Contato("Contato P", "31-32", "C16@email.com");
        Contato C17 = new Contato("Contato Q", "33-34", "C17@email.com");
        Contato C18 = new Contato("Contato R", "35-36", "C18@email.com");
        Contato C19 = new Contato("Contato S", "37-38", "C19@email.com");
        Contato C20 = new Contato("Contato T", "39-40", "C20@email.com");
        Contato C21 = new Contato("Contato U", "41-42", "C21@email.com");
        Contato C22 = new Contato("Contato V", "43-44", "C22@email.com");
        Contato C23 = new Contato("Contato W", "45-46", "C23@email.com");
        Contato C24 = new Contato("Contato X", "47-48", "C24@email.com");
        Contato C25 = new Contato("Contato Y", "49-50", "C25@email.com");
        Contato C26 = new Contato("Contato Z", "51-52", "C26@email.com");
        Contato C27 = new Contato("Contato AA", "53-54", "C27@email.com");
        Contato C28 = new Contato("Contato BB", "55-56", "C28@email.com");
        Contato C29 = new Contato("Contato CC", "57-58", "C29@email.com");
        Contato C30 = new Contato("Contato DD", "59-60", "C30@email.com");

        // lista

        listaDeContatos.adiciona(C02);
        listaDeContatos.adiciona(C01);
        listaDeContatos.adiciona(C03);
        listaDeContatos.adiciona(C04);
        listaDeContatos.adiciona(C05);
        listaDeContatos.adiciona(C06);
        listaDeContatos.adiciona(C07);
        listaDeContatos.adiciona(C08);
        listaDeContatos.adiciona(C09);
        listaDeContatos.adiciona(C10);
        listaDeContatos.adiciona(C11);
        listaDeContatos.adiciona(C12);
        listaDeContatos.adiciona(C13);
        listaDeContatos.adiciona(C14);
        listaDeContatos.adiciona(C15);
        listaDeContatos.adiciona(C16);
        listaDeContatos.adiciona(C17);
        listaDeContatos.adiciona(C18);
        listaDeContatos.adiciona(C19);
        listaDeContatos.adiciona(C20);
        listaDeContatos.adiciona(C21);
        listaDeContatos.adiciona(C22);
        listaDeContatos.adiciona(C23);
        listaDeContatos.adiciona(C24);
        listaDeContatos.adiciona(C25);
        listaDeContatos.adiciona(C26);
        listaDeContatos.adiciona(C28);
        listaDeContatos.adiciona(C29);
        listaDeContatos.adiciona(C30);

        System.out.println(listaDeContatos);
        System.out.println("------>Exercicio 6<------");

        // Exercicio 6 - Lista

        LinkedList<Contato> linkedListContatos = new LinkedList<>();

        linkedListContatos.add(C01);
        linkedListContatos.add(C02);
        linkedListContatos.add(C03);
        linkedListContatos.add(C04);
        linkedListContatos.add(C05);
        linkedListContatos.add(C06);
        linkedListContatos.add(C07);
        linkedListContatos.add(C08);
        linkedListContatos.add(C09);
        linkedListContatos.add(C10);
        linkedListContatos.add(C11);
        linkedListContatos.add(C12);
        linkedListContatos.add(C13);
        linkedListContatos.add(C14);
        linkedListContatos.add(C15);
        linkedListContatos.add(C16);
        linkedListContatos.add(C17);
        linkedListContatos.add(C18);
        linkedListContatos.add(C19);
        linkedListContatos.add(C20);
        linkedListContatos.add(C21);
        linkedListContatos.add(C22);
        linkedListContatos.add(C23);
        linkedListContatos.add(C24);
        linkedListContatos.add(C25);
        linkedListContatos.add(C26);
        linkedListContatos.add(C27);
        linkedListContatos.add(C28);
        linkedListContatos.add(C29);
        linkedListContatos.add(C30);

        System.out.println(linkedListContatos);
    }
}