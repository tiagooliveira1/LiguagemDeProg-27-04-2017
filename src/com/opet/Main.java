package com.opet;


import com.opet.util.Reader;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        int op;
        while(op != 0) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Incluir novo aluno");
            System.out.println("2 - Excluir aluno");
            System.out.println("3 - Listar alunos");

            int opcao = Reader.readInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Cadastrando aluno.");
                    System.out.println("Digite o código:");
                    int alunoCodigo = Reader.readInt();
                    System.out.println("Digite o nome:");
                    String alunoNome = Reader.readString();


                    break;
                case 2:
                    System.out.println("Excluir aluno.");
                    System.out.println("Digite o código do aluno.");
                    break;

                default:
                    break;
            }

        }

    }

    public static Aluno inserirAluno(String []tiago, int Codigo, String nome)
    {
        Aluno alunoRegistro = new Aluno(nomeAluno, cpfAluno, sexoAluno);

        return alunoRegistro;
    }

}
