/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhojava;

/**
 *
 * @author ulisses
 */
import java.util.Scanner;
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculoMedia Aluno = new calculoMedia();
        Scanner ler = new Scanner(System.in);
        String op;

        System.out.println("MENU");
        System.out.println("1 - Media de disciplina Pratica");
        System.out.println("2 - Media de Disciplina Teorica");
        System.out.println("3 - Media de Disciplina Regular");
        System.out.println("4 - Media de Disciplina Regular 3 Ano");
        System.out.print("Escolha a opcao: ");
        op = ler.nextLine();
        System.out.print("");

            switch(op){
                case "1":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosPratica();;
                break;
                case "2":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosTeorica();;
                break;
                case "3":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosRegular();;
                break;
                case "4":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosTerceiro();;
                break;
        }
    }
}
     