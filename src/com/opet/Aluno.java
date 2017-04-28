package com.opet;

public class Aluno
{

  public String nome = "";
  public long cpf = 0;
  public String sexo="";
  public Double Nota1 = 0.0;
  public Double Nota2 = 0.0;

  /* construtor */
  Aluno(
                  String nomeAluno,
                  long cpfAluno,
                  String sexoAluno) {
      {
          nome = nomeAluno;
          cpf = cpfAluno;
          sexo = sexoAluno;

      }
  }

  public Boolean Aprovado()
  {
      Double media = (Nota1+Nota2)/2;
      if(media >7)
          return true;
      else
          return false;

  }

  public void setNota(Double vNota)
  {
      //listNotas[listNotas.length] = new Nota(vNota);
  }

}