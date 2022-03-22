package Direct_7;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //List notas = new ArrayList(); //antes do java 5
        //List<Double> notas = new ArrayList<>(); //Generics (jdk 5) - Diamonte operator(jdk 7)
        //ArrayList<Double> notas = new ArrayList<>(); // instanciar a variavel com a implementação;
        // --- instanciar a ArrayList , passando dentro o argumento "(Arrays.asList)" os elementos que que for adicionar no ArrayList
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
       /* List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Passando direto pra dentro da List o "Arrays.asList"
        notas.add(10d);
        System.out.println(notas);
        //imultavel
        */

        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // imultavel
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Criando uma lista e adicione as 7 notas: ");
        List<Double> notas = new ArrayList<>(); //Generics (jdk 5) - Diamonte operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); // ou System.out.println(notas);

        System.out.println("Exibindo a posição da nota 5.0: " + notas.indexOf(5d)); // chamando a nota na posção em que ele se emcontra;


        System.out.println("Adicionando na lista a nota 8.0, na posição 4: ");
        notas.add(4,8d); // adicionando a nota na posição com o (int i, double e), ou seja (a posição tem que ser int , e numero double)
        System.out.println(notas);

        System.out.println("substituindo a nota 5.0, pela nota 6.0: ");
        // Encontrando a posição com o notas.IndexOf( numero que vai ser substituido, tem que ser double "5d"), e colocando a nota desejada 6.0
        notas.set(notas.indexOf(5d), 6.0 );
        System.out.println(notas);

        System.out.println("conferindo se a nota 5.0 esta na lista: " + notas.contains(5d)); // passando o objeto onde vai ser conferido (notas.contains(5d));
        // irá retornar false pq a nota 5.0 foi substituida pela nota 6.0;

        //System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //for ( Double nota : notas ) System.out.println(nota);

        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2)); // procurando a posição e exibindo a nota da determinada posição
        System.out.println(notas.toString());

        System.out.println("Exibindo a menor nota: " + Collections.min(notas)); // Exibindo a menor nota com o "Collections.min" ele faz a comparação de tamanho ( onde vai ser procurado " notas ")

        System.out.println("Exibindo a maior nota: " + Collections.max(notas)); // Exibindo a maior nota com o "Collections.max" ele faz a comparação de tamanho ( onde vai ser procurado " notas ")

        // para fazer a soma de dentro da lista deve-se chamar o metodo iterator, e interando dentro da lista

        Iterator<Double> iterator = notas.iterator();   // criando a variavel iterator com o mouse em cima de (notas)  e apertando "Ctrl + alt + V "
        double soma = 0d; // variavel onde vai ser armazenado a soma
        // laço de repetição que vai pergutando se tem "próximo"
        while (iterator.hasNext()) {
            // colocando dentro de uma variavel o mouse em cima do iterator "Ctrl + alt + V"
            Double next = iterator.next();   // pegando o proximo elemento, colocando na variavel "next"
            soma += next; // somando a variavel armazenada em "next" com a  variavel "soma"
            // Será true enquanto tiver proximo na lista, quando não tiver, será false
        }
        System.out.println("Exibindo a soma dos valores: " + soma);

        // A media é soma de tudo dividido pela quantidade de elementos que tenho na minha lista
        System.out.println("Exibindo a média das notas: " + soma/notas.size()); // metodo "size" vai retornar int, vai medar quantidade de elementos que eu tenho na lista

        System.out.println("Removendo a nota 0: ");
        notas.remove(0d); // podendo passar tanto o objeto quanto a posição, lembrando de que é o objeto é double, se não fica int, e vai remover da posição 0
        System.out.println(notas);

        System.out.println("Removendo a nota da posição 0: ");
        notas.remove(0); // fica int, e vai remover o numero da posição 0
        System.out.println(notas);

        System.out.println("Removendo as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); // criando a variavel igual o exemplo de antes
        while(iterator1.hasNext()){
            Double next = iterator1.next(); // criando outra variavel seguindo o exemplo de antes
            if(next < 7) iterator1.remove(); //  Toamda de decisão, vai remover as notas menores que 7
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista: ");
        notas.clear(); // vai limpar/apagar toda a lista
        System.out.println(notas);

        // método que vai retornar true se for vazia e false se não for vazia
        System.out.println("Conferindo se a lista está vazia: " + notas.isEmpty());

    }
}
