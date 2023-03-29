package Baralho;

import Cartas.Carta;
import Cartas.Naipe;
import Cartas.Valor;

import java.util.*;
public class Baralho {
     int ac = 0;//Acumulador faz a contagem de quantas vezes o usuario inserio cartas no baralho
     int fim = 10;//Delimita quantidade total de cartas que vao no baralho
     //Criando uma lista para que o usuário possa inserir suas cartas
     private List<Carta> carta = new ArrayList<>();
     public Scanner sc = new Scanner(System.in);
     //Metodo Contrutor
     public Baralho(){
          int op = 0;
         int inicio;
          Scanner sc = new Scanner(System.in);
          do {
               System.out.println();
               System.out.println("Menu - Baralho");
               System.out.println("=================");
               System.out.println("1. Montar........");
               System.out.println("2. Embaralhar....");
               System.out.println("3. Exibir........");
               System.out.println("4. Sair..........");
               System.out.println("=================");
               System.out.println("Escolha sua opcao");
               op =Integer.parseInt(sc.nextLine());
               switch (op){
                    case 1:
                         do{//Laco de repeticao para que ele conitinue inserindo cartas até o acumulador == fim
                              montar();
                              inicio = ac;
                         }while (inicio!=fim);

                         break;
                    case 2:
                         embaralhar();
                         break;
                    case 3:
                         exibir();
                         break;
                    case 4:
                         break;
                    default:
                         System.out.println("Opcao invalida!!");
               }
          }while (op!=6);


     }
     //Definindo os Metodos
     private void montar (){
          Carta cartas = new Carta();
               System.out.println();
               if(ac == fim){
                    //Tratemento de dados não permite que o usuario insira mais de um baralho
                    System.out.println("BARALHO JA CADASTRADO");
                    System.out.println("SELECIONE OUTRA OPCAO");
                    return;
               }
               System.out.println("CARTAS PARA INSERIR NO BARALHO " + fim);
               //toUpperCasse tranforma as letras o usuario, fiquem todas maiuscula sendo compativel com as do Enum
               //Entrada de Dados do usurio escolhendo o NAIPE e o VALOR
               System.out.println("Digite o Naipe: ");
               cartas.setNaipe(Naipe.valueOf(sc.nextLine ().toUpperCase()));
               System.out.println("Digite o Valor: ");
               cartas.setValor(Valor.valueOf(sc.nextLine().toUpperCase()));
                    if (carta.contains(cartas)){
                         /*NA TEORIA ERA PRA FAZER COM QUE NÃO POSSA HAVER CARTAS REPETIDAS NO BARALHO
                         * MAS APARENTEMENTE NAO ESTA FUNCIONANDO*/
                         System.out.println("ESSA CARTA JA EXISTE");
                    }
                    else {
                         carta.add(cartas);//Criando uma listas de cartas
                         ac++;
                         System.out.println("CARTA " + ac + " INSERIDAS!!");
               }




     }

     private void embaralhar(){
          System.out.println();
          if(ac == 0){//Tratamento para que usuario nao entre sem ter criado um baralho
               System.out.println();
               System.out.println("BARALHO NÃO ENCONTRADO");
               System.out.println("POR FAVOR MONTE SEU BARALHO");
               return;
          }
          System.out.println("Embaralhando Cartas...");
          for(Carta c: carta) {
               Collections.shuffle(carta);//Metodo que faz a lista ficar aleatória
          }
          System.out.println("Cartas embaralhadas!!!");
     }

     private void exibir(){
          System.out.println();
          if(ac == 0){//Tratamento para que usuario nao entre sem ter criado um baralho
               System.out.println();
               System.out.println("BARALHO NÃO ENCONTRADO");
               System.out.println("POR FAVOR MONTE SEU BARALHO");
               return;
          }
          System.out.println("Exibindo Cartas..");
          for(Carta c: carta){
               System.out.println(c.toString());//MOSTRA AS CARTAS PARA O USUARIO
          }
     }
}
