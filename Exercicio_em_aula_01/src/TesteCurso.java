import java.util.Scanner;

public class TesteCurso {
    
    public static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Criando cursos com o construtor de 5 parâmetros
        Curso curso1 = new Curso("Física", 100, 20, "Marcelo", 2);
        Curso curso2 = new Curso("Culinária", 500, 1000, "Jaqin", 6);
        
        curso1.visualizar();
        curso2.visualizar();
        
        // Criando curso usando o construtor vazio (Agora funciona!)
        Curso novoCurso = new Curso(null, 0, 0, null, 0);
        
        System.out.println("\n--- Criação de novo curso ---");
        
        // Lendo os textos primeiro evita bugs de buffer no Scanner
        System.out.print("Digite o nome do curso: ");
        novoCurso.setNomeCurso(leia.nextLine());
        
        System.out.print("Digite o nome do professor: ");
        novoCurso.setNomeProfessor(leia.nextLine());
        
        // Lendo os números por último
        System.out.print("Digite o valor da mensalidade: ");
        novoCurso.setMensalidade(leia.nextFloat());
        
        System.out.print("Digite a quantidade de módulos: ");
        novoCurso.setModulos(leia.nextInt());
        
        System.out.print("Digite a quantidade total de horas: ");
        novoCurso.setTotalHoras(leia.nextInt());
        
        // Exibindo o novo curso criado dinamicamente
        novoCurso.visualizar();
        
        System.out.printf("\nMensalidade do curso 2: R$ %.2f\n", curso2.getMensalidade());
    }
}