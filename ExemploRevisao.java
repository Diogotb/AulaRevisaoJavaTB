package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        //1. ler 1º nota
        System.out.println("Informe a 1º nota do Aluno");
        int nota1 = sc.nextInt();
        //2. ler 2º nota
        System.out.println("Informe a 2º nota do Aluno");
        int nota2 = sc.nextInt();
        //3. calcular média
        double media = (nota1+nota2)/2;
        //4. mostra a media
        System.out.println("a média do ALuno é "+media);
        //5. ler o total de aulas da disciplina
        System.out.println("Informe o Total de Aulas da Disciplina");
        int aulasDadas = sc.nextInt();
        //6. ler a quantidade faltas do aluno
        System.out.println("Informe o total de Faltas do Aluno");
        int totalFaltas = sc.nextInt();
        //7. calcular a porcentagem de frequencia
        double frequencia = (aulasDadas-totalFaltas)*100/aulasDadas;
        //8. mostrar a frequencia
        System.out.println(" A frequencia do Aluno é "+frequencia+"%");
        //9. se media>=50 e Frequencia>=75% entao Aprovado
        if (media>=50 && frequencia>=75){
            System.out.println("Aluno Aprovado");
        }else if(media<50 && frequencia>=75){
            System.out.println("Aluno de Recuperação");
        }else{//10. senao mostre reprovado
            System.out.println("Aluno Reprovado");
        }
    }   
}
