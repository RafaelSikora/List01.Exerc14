import java.util.Scanner;
//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
// o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
// peixes maior que o estabelecido pelo regulamento de pesca do estado 
//de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo
//excedente. João precisa que você faça um programa que leia a variável
// peso (peso de peixes) e calcule o excesso. Gravar na variável excesso//
//a quantidade de quilos além do limite e na variável multa o valor da 
//multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
class Main {
public static void main(String[] args){
//Declaração de variáveis
double peso;
double multa;
double excesso;
final double limitePeso = 50;
final double valorMulta = 4;
//Fazer a entrada de dados
Scanner teclado = new Scanner (System.in);
System.out.println("Digite o peso total dos peixes pescados hoje: ");
peso = teclado.nextDouble();
//Fazer o calculo e tomada de decisões
  if (peso > limitePeso){
  excesso = peso - limitePeso;
  multa = excesso * valorMulta;
  System.out.println("João Papo-de-Pescador terá que pagar uma multa de R$ " + multa + " por ter excedido o limite de peso em " + excesso + " kg.");
}
  else {
  System.out.println("João Papo-de-Pescador não terá que pagar nenhuma multa, pois não excedeu o limite de peso.");
  }
  teclado.close();
  }
}