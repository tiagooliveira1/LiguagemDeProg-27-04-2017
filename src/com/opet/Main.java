package com.opet;


import com.opet.util.Reader;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        int op = -1;
        Aluno []alunos = new Aluno[2];
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
                    alunos[alunos.length-1] = inserirAluno(alunoCodigo, alunoNome);


                    break;
                case 2:
                    System.out.println("Excluir aluno.");
                    System.out.println("Digite o código do aluno.");
                    break;
                case 3:
                    System.out.println("== Listando alunos == .");
                    listAlunos(alunos);
                    break;

                default:
                    break;
            }

        }

    }

    public static Aluno inserirAluno(int Codigo, String nome)
    {
        Aluno alunoRegistro = new Aluno(nome, Codigo, "");

        return alunoRegistro;
    }

    public static void listAlunos(Aluno []arrAlunos)
    {
        System.out.println("");
        System.out.println("Listagem de alunos inseridos");
        System.out.println("-----------------------------");
        for (int i=0;i<arrAlunos.length;i++) {
            System.out.println(arrAlunos[i].nome);
        }
        System.out.println("");

    }

}
