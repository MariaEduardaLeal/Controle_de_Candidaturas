package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }

    public static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JULIA"};

        int candidatosSelecionados = 0; //Controla quantos candidatos já foram selecionados.
        int candidatoAtual = 0; //Controla a posição do candidato na matriz de candidatos.
        double salarioBase = 2000.0;//Defini o máximo que o candidato pode pedir para a vaga

        // ArrayList para armazenar candidatos selecionados
        ArrayList<String> candidatosSelecionadosList = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            //A primeira verificação é se o número de candidatos selecionados é menor que 5 e a segunda verificação é que o candidato
            //atual seja menor que o comprimento do array candidatos
            String candidato = candidatos[candidatoAtual]; //Obtém o nome do candidato atual na posição candidatoAtual da matriz candidatos
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido){//Faz a verificação se o salário base é maior que o salário pretendido
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionadosList.add(candidato); // Adiciona o candidato à lista de selecionados
                candidatosSelecionados++;
            }
            candidatoAtual++; //Incrementa o cantador para subir para o próximo candidato
        }
        // Imprime a lista de candidatos selecionados
        System.out.println("Candidatos selecionados: " + candidatosSelecionadosList);
        for (int indice = 0; indice < candidatosSelecionadosList.size(); indice++){
            //No loop for, utilizamos candidatosSelecionadosList.size() para determinar o tamanho do ArrayList

            String candidatoSelecionado = candidatosSelecionadosList.get(indice);

            entrandoEmContato(candidatoSelecionado);

            /*candidatosSelecionadosList.get(indice) para obter cada candidato selecionado individualmente.
            Isso imprimirá a lista de candidatos selecionados após o loop while.
             */
        }
    }

    public static double valorPretendido(){
     return ThreadLocalRandom.current().nextDouble(1800, 2200); //Gera um número aleatório entre 1800 e 2200
    }

    //método auxiliar
    //O método atender servirá para criarmos uma tentativa de ligação
    public static boolean atender(){
        /*
        A classe Random pode gerar números aleatórios e,
        com base no valor gerado retorna um valor booleano( verdadeiro ou falso)
         A parte nextInt(3) significa que gerará um número aleatório
         não negativo menor que o valor especificado(3). No caso o método gerará
         os númeors 0,1 ou 2
         */
        return new Random().nextInt(3)==1;
        //O método retornará como `true` quando o valor aleatório for igual a 1

    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while (continuarTentando && tentativasRealizadas <=3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato+ " DEPOIS DE " +tentativasRealizadas + " TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE LIGAÇÕES REALIZADAS");
        }
    }
}
