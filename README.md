# DesafioCapgemini
Questão 1

Foi pedido na questão 1 uma lista de números com elementos ímpares e um algorítimo para encontrar a mediana. Realizei o método While para descobrir se o número colocado seria par ou ímpar. Nessa condição coloquei pra o número ser dividido por 2, caso o restante dele fosse igual a 0, o indivíduo teria que colocar um novo valor, até ser colocado um número ímpar. Após isso, fiz um vetor que recebe o valor colocado na lista. Logo após, utilizei o comando Arrays.sort para colocar os elementos do vetor em ordem crescente, depois utilizei o método de mediana para números ímpares que é: (n+1) / 2, depois disso eu tirei no system.out para poder imprimir a posição certa da mediana.


Questão 2 

Na segunda questão, foi pedido um vetor com valor N inteiro e um número com valor também inteiro X, para ser usado como a diferença no vetor. Comecei o meu código pedindo para colocar o tamanho do vetor e depois comecei um loop para que acrescentassem o número de elementos compatíveis com o tamanho do vetor. Logo após fiz um outro loop para que todos os elementos do vetor rodassem entre si, subtraindo um com os outros e salvando a diferença pedida no X. Depois eu imprimi quantas vezes aconteceu a diferença do X no loop.


Questão 3

Na terceira questão, foi pedido um texto encripitado, removendo seus espaços, pegando sua raiz por números de letras, transformando o texto no número de colunas e linhas com base no resultado da raiz.Depois disso pegar a primeira, segunda, terceira, quarta ou quantas houver e formar palavras. (Exemplo: "tenha um bom dia" que se transforma em tenh aumb omdi a 1-t 1-a 1-o 1-a= taoa / 2-e 2-u 2-m = eum / 3-n 3-m 3-d= nmd / 4-h 4-b 4-i= hbi). No meu programa coloquei a frase que queria encripitar, logo após peguei a raiz quadrada da quantidade de caracteres e adicionei os caracteres do texto em uma lista para facilitar a manipulação. Fui mapear a matriz e removi o primeiro da lista, iterei a matriz de forma inversa, colunas primeiro e depois adicionei o caractere de cada coluna e depois retornei o texto encripitado. 
