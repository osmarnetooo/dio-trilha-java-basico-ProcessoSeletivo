import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeleivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"João","Paulo","Julia","Gigi","Mary"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu) 
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "° tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tetativas, " + tentativasRealizadas + " realizadas.");
        
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    /*static void imprimirSelecionados(){
        String [] candidatos = {"João","Paulo","Julia","Gigi","Mary"};
        System.out.println("Imprimindo a lista de candidatos informado seu indice do elemento: ");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de N° " + indice + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação FOR EACH!");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"João","Paulo","Julia","Gigi","Mary","Junior","Neto","Osmar"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendito = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendito + ".");
            if(salarioBase >= salarioPretendito){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendito){
            System.out.println("Ligar para o Candidato.");
        }else if (salarioBase == salarioPretendito) {
            System.out.println("Ligar para o Candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais Candidaos");
        }
    }*/

}
