package com.opet;


import com.opet.util.Reader;


public class Main
{

    // declara o �ndice idx como global
    static int idx = 0;
    // declara o array de alunos como global, para manipul�-lo de qualquer fun��o
    static Aluno []alunos = new Aluno[5];

    public static void main(String[] args) throws Exception
    {

        int op = -1;


        while(op != 0) {
            System.out.println("Digite a op��o desejada:");
            System.out.println("1 - Incluir novo aluno");
            System.out.println("2 - Excluir aluno");
            System.out.println("3 - Listar alunos");

            int opcao = Reader.readInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Cadastrando aluno.");
                    System.out.println("Digite o c�digo:");
                    int alunoCodigo = Reader.readInt();
                    System.out.println("Digite o nome:");
                    String alunoNome = Reader.readString();

                    inserirAluno(alunoCodigo, alunoNome);

                    break;
                case 2:
                    System.out.println("Excluir aluno.");
                    System.out.println("Digite o c�digo do aluno.");
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

    public static void inserirAluno(int Codigo, String nome)
    {
        alunos[idx] = new Aluno(nome, Codigo, "");
        idx = idx+1;

    }

    public static void listAlunos(Aluno []arrAlunos)
    {
        System.out.println("");
        System.out.println("Listagem de alunos inseridos");
        System.out.println("-----------------------------");
        /* varre o array global de alunos*/
        for (int i=0;i<arrAlunos.length;i++) {
            // verifica se a posi��o � nula, e imprime caso n�o seja nulo
            if (arrAlunos[i] != null)
                System.out.println(arrAlunos[i].nome);
        }
        System.out.println("");
    }

}
