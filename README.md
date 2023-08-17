<h1>Projeto de Seleção de Candidatos</h1>
Este é um projeto Java que simula um processo seletivo de candidatos para uma vaga, utilizando critérios de salário pretendido e tentativas de contato telefônico.

<h2>Funcionamento</h2>
O programa realiza a seleção de candidatos com base em seus salários pretendidos. Os candidatos são armazenados em um array, e o programa verifica se o salário pretendido pelo candidato é menor ou igual ao salário base estabelecido (R$ 2000,00). Caso o candidato atenda a esse critério, ele é selecionado para a vaga e adicionado a uma lista de candidatos selecionados.

Após a seleção, o programa tenta entrar em contato com cada candidato selecionado. Ele simula tentativas de chamadas telefônicas aleatórias, utilizando o método atender(). O método atender() gera um resultado booleano aleatório com base em uma probabilidade de 1 em 3, simulando a resposta do candidato ao telefone.

<h2>Classes e Métodos</h2>
<h3>ProcessoSeletivo</h3>
A classe principal que contém o método main() e coordena a seleção de candidatos e as tentativas de contato.

Métodos
<ul>
<li>selecaoCandidatos(): Realiza a seleção dos candidatos com base no salário pretendido e armazena os selecionados em um ArrayList.</li>
<li>>valorPretendido(): Gera um número aleatório entre 1800 e 2200, representando o salário pretendido pelo candidato.</li
<li>atender(): Gera um resultado booleano aleatório simulando se o candidato atendeu ou não à chamada.</li>
<li>entrandoEmContato(String candidato): Realiza tentativas de contato com o candidato e exibe o resultado.</li>
  
<h3>Principais Conceitos</h3>
<li>ArrayList: Uma estrutura de dados que armazena uma lista dinâmica de elementos.</li>
<li>Random: Uma classe para geração de números aleatórios.</li>
<li>ThreadLocalRandom: Uma classe para geração de números aleatórios em threads.</li>
<li>Loop While: Um loop que executa repetidamente enquanto uma condição é verdadeira.</li>
<li>Loop For: Um loop que executa um número fixo de vezes.</li>
</ul>
