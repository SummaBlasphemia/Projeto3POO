import java.io.*;
import java.util.*;

public class Exercicio3 {
    public static String complementar(String fita) {
        StringBuilder comp = new StringBuilder();
        for (char base : fita.toCharArray()) {
            switch (base) {
                case 'A': comp.append('T'); break;
                case 'T': comp.append('A'); break;
                case 'C': comp.append('G'); break;
                case 'G': comp.append('C'); break;
                default: return null; 
            }
        }
        return comp.toString();
    }
    public static void processarArquivo(String entrada, String saida) {
        int total = 0;
        int validas = 0;
        int invalidas = 0;
        List<String> fitasInvalidas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(entrada));
             PrintWriter pw = new PrintWriter(new FileWriter(saida))) {

            String linha;
            int numLinha = 0;
            while ((linha = br.readLine()) != null) {
                numLinha++;
                String fita = linha.trim().toUpperCase();
                if (fita.isEmpty()) continue;

                total++;
                String comp = complementar(fita);

                if (comp == null) {
                    pw.println("****FITA INVALIDA - " + fita);
                    invalidas++;
                    fitasInvalidas.add("Linha " + numLinha + ": " + fita);
                } else {
                    pw.println(comp);
                    validas++;
                }
            }
            System.out.println("Arquivo: " + entrada);
            System.out.println("Total de fitas: " + total);
            System.out.println("Fitas válidas: " + validas);
            System.out.println("Fitas inválidas: " + invalidas);
            if (!fitasInvalidas.isEmpty()) {
                System.out.println("Lista de fitas inválidas:");
                for (String inv : fitasInvalidas) {
                    System.out.println("  " + inv);
                }
            }
            System.out.println("-----------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String[] arquivos = {
            "dna-0.txt", "dna-1.txt", "dna-2.txt", "dna-3.txt",
            "dna-4.txt", "dna-5.txt", "dna-6.txt", "dna-7.txt", "dna-8.txt"
        };

        for (String arq : arquivos) {
            String saida = arq.replace(".txt", "-out.txt");
            processarArquivo(arq, saida);
        }
    }
}
