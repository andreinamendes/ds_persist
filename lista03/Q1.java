package lista03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q1 {
  // 1. Crie uma aplicação em Java que recebe via linha de comando: 
  //   a. O nome de um arquivo CSV; 
  //   b. O delimitador usado para separar os campos do arquivo; 
  //   c. Uma lista de nomes das colunas do arquivo CSV que serão processados. 
  // Considere que o arquivo CSV:
  //   -> Deva ter um cabeçalho com os nomes das colunas em sua primeira linha e que não tenha internamente colunas com Strings contendo o mesmo caractere usado como delimitador 
  //   -> A aplicação deve exibir a soma e a média das colunas selecionadas caso tenham dados numéricos. 
  //   -> Se não tiverem dados numéricos, somente exibir que aquela coluna não é numérica. 
  //   -> Não usar bibliotecas externas para resolver esta questão (usar Java puro).
  //   -> Sugere-se navegar apenas uma única vez em cada linha do arquivo CSV. 
  // Fazer a aplicação de modo que ela possa processar arquivos CSV extremamente grandes, mesmo que não caibam na memória RAM.
  // Dica: usar o método split da classe String para separar os valores das colunas em cada linha do arquivo CSV.

  public static void main(String[] args) throws IOException {
    InputStream is = System.in;
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);

    String file = br.readLine();
    String delimiter = br.readLine();
    String[] columns = br.readLine().split(delimiter);
    float[] sum_values = new float[columns.length+1];

    is = new FileInputStream(file);
    isr = new InputStreamReader(is);
    br = new BufferedReader(isr);
    String s = br.readLine();
    int count_rows = 1;

    while(s != null){
      String[] values = s.split(delimiter);

      for(int a = 0; a < columns.length; a++){
        try{
          sum_values[a] += Float.parseFloat(values[a]);
        }catch(NumberFormatException e){
          sum_values[a] = (float) 0;
        }catch(NullPointerException e){
          sum_values[a] += 0;
        }
      }
      
      s = br.readLine();
      count_rows++;
    }

    for(int a = 0; a < columns.length; a++){
      if(sum_values[a] != 0){
        System.out.println("Row " + columns[a] + ":\n\tSum values: " + sum_values[a] + "\n\tMean values: " + sum_values[a]/count_rows);
      }else{
        System.out.println("Row " + columns[a] + " is not a numbered values columnn.");
      }
    }

    br.close();
  }
}
