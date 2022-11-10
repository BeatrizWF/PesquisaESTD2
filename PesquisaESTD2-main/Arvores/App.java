import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Result.csv")));

        int numeral = 1000;
        int QuantRepeticao = 10;
        writer.write("Numeral;ColunaDaArvoreAVL_Tipo_Ordenada;ColunaDaArvoreAVL_Tipo_Aleatoria,ColunaDaArvoreFlamenguista_Tipo_Ordenada, ColunaDaArvoreFlamenguista_Tipo_AleatoriaArvoreBinaria-Ordenada-1;ArvoreBinariaAleatoria-1;ArvoreBinariaOrdenada-5;ArvoreBinariaAleatoria-5;ArvoreBinariaOrdenada-10;ArvoreBinariaAleatoria-10;\n");

        for (int a = 1; a <= numeral; a++) { 
            int agregaArvoreAVLOrdenada = 0;
            int agregaArvoreAvlAleatoria = 0;
            int agregaArvoreFlamenguistaOrdenada = 0;
            int agregaArvoreFlamenguistaAleatoria = 0;

            int agregaArvoreBinariaOrdenada1 = 0;
            int agregaArvoreBinariaAleatoria1 = 0;
            
            int agregaArvoreBinariaOrdenada5 = 0;
            int agregaArvoreBinariaAleatoria5 = 0;
            
            int agregaArvoreBinariaOrdenada10 = 0;
            int agregaArvoreBinariaAleatoria10 = 0;


            for (int b = 0; b < QuantRepeticao; b++) {
                ArvoreAvlOrdenada.vetorOrdenado(a);
                ArvoreAvlAleatoria.vetorAleatorio(a);

                ArvoreRubroNegraOrdenada.vetorOrdenado(a);
                ArvoreRubroNegraAleatoria.vetorAleatorio(a);
                
                ArvoreBinariaOrdenada1.vetorOrdenado(a, 1);
                ArvoreBinariaAleatoria1.vetorAleatorio(a, 1);
                
                ArvoreBinariaOrdenada5.vetorOrdenado(a, 5);
                ArvoreBinariaAleatoria5.vetorAleatorio(a, 5);
                
                ArvoreBinariaOrdenada10.vetorOrdenado(a, 10);
                ArvoreBinariaAleatoria10.vetorAleatorio(a, 10);   
                
                agregaArvoreAVLOrdenada += ArvoreAvlOrdenada.contador;
                agregaArvoreAvlAleatoria += ArvoreAvlAleatoria.contador;
                
                agregaArvoreFlamenguistaOrdenada += ArvoreRubroNegraOrdenada.contador;
                agregaArvoreFlamenguistaAleatoria += ArvoreRubroNegraAleatoria.contador;

                agregaArvoreBinariaOrdenada1 += ArvoreBinariaOrdenada1.contador;
                agregaArvoreBinariaAleatoria1 += ArvoreBinariaAleatoria1.contador;

                agregaArvoreBinariaOrdenada5 += ArvoreBinariaOrdenada5.contador;
                agregaArvoreBinariaAleatoria5 += ArvoreBinariaAleatoria5.contador;

                agregaArvoreBinariaOrdenada10 += ArvoreBinariaOrdenada10.contador;
                agregaArvoreBinariaAleatoria10 += ArvoreBinariaAleatoria10.contador;


            }        
            writer.write(a + ";" + 
            (agregaArvoreAVLOrdenada) + ";" + ( agregaArvoreAvlAleatoria / QuantRepeticao) + ";" + 
            (agregaArvoreFlamenguistaOrdenada ) + ";" +  (agregaArvoreFlamenguistaAleatoria / QuantRepeticao) + 
            (agregaArvoreBinariaOrdenada1) + ";" +(agregaArvoreBinariaAleatoria1 / QuantRepeticao) + ";" +
            (agregaArvoreBinariaOrdenada5) + ";" +(agregaArvoreBinariaAleatoria5 / QuantRepeticao) + ";" +
            (agregaArvoreBinariaOrdenada10) + ";" +(agregaArvoreBinariaAleatoria10 / QuantRepeticao) + ";" +
            "\n");
            
            
            
            ArvoreAvlOrdenada.contador = 0;
            ArvoreAvlAleatoria.contador = 0;
            ArvoreRubroNegraOrdenada.contador = 0;
            ArvoreRubroNegraAleatoria.contador = 0;
            ArvoreBinariaOrdenada1.contador = 0;
            ArvoreBinariaAleatoria1.contador = 0;

            ArvoreBinariaOrdenada5.contador = 0;
            ArvoreBinariaAleatoria5.contador = 0;

            ArvoreBinariaOrdenada10.contador = 0;
            ArvoreBinariaAleatoria10.contador = 0;
        }

        
        writer.close();
    }
}
