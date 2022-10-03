
package manipula_ficheiros;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import static javafx.scene.input.KeyCode.C;



class Ficheiro {

    static void criaFicheiro() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar :");
        nome = Manipula_Ficheiros.ler.nextLine();
        nome = Manipula_Ficheiros.ler.next();
        File ficheiro = new File (nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                 ex.printStackTrace();
            }
            }
        }

    static void verificaSeExiste() {
        String nome;
        System.out.println("Insira o nome do ficheiro a criar");
        
        nome = Manipula_Ficheiros.ler.nextLine();
        nome = Manipula_Ficheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            
                System.out.println("O ficheiro não existe");
            }else{
                    System.out.println("O ficheiro existe");
                    }
       
    }

    static void adicionaAoFicheiro() {
    }

    static void escreveFicheiroNovo() {
       
    }

    static void mostraConteudoFicheiro() {
     
    }

    static void mostraListaFicheiros() {
    File ficheiro = new File ("C:\\Users\\DBugalho\\Desktop\\Ficheiros\\M_Ficheiros\\Ficheiros\\Manipula_Ficheiros");
    File [] lista = ficheiro.listFiles();
    System.out.println(">>> Lista de Ficheiros <<<");
    for (int x=0; x<lista.length; x++){
            System.out.println(lista[x].getName());
        }
        
    }
}
