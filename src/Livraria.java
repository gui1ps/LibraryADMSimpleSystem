import java.util.ArrayList;
import java.io.*;

public class Livraria{
    ArrayList<Livros> estoque;
    File f = new File("Livros.txt");

    Livraria(){
        estoque=new ArrayList<>();
    }

    void insereLivro(String n, String g, String cod){
        Livros book = new Livros(n, g, cod);
        int cont=0;
        if (estoque.isEmpty()){estoque.add(book);}
        else{
            for(Livros l : this.estoque){
                if(l.getCod().equals(book.getCod())){cont++;}
            }
            if(cont==0){estoque.add(book);}
            else{System.out.println("JÁ EXISTE UM LIVRO COM ESTE CÓDIGO CADASTRADO!");}
        }
    }

    void insereLivroCSV(Livros l01){
        int cont=0;

        if (estoque.isEmpty()){estoque.add(l01);}
        else{
            for(Livros l : this.estoque){
                if(l.getCod().equals(l01.getCod())){cont++;}
            }
            if(cont==0){estoque.add(l01);}
            else{System.out.println("JÁ EXISTE UM LIVRO COM ESTE CÓDIGO CADASTRADO!");}
        }
    }

    public void getLivros(){
        for(Livros l:this.estoque){
            System.out.println("--------------------------------------");
            System.out.println(l);
            System.out.println("--------------------------------------");
        }
    }

    public void getPGenero (String gen){
        for(Livros l: this.estoque){
            if(l.getGen().equals(gen)){
                System.out.println("--------------------------------------");
                System.out.println(l);
                System.out.println("--------------------------------------");
            }
        }
    }

    public void getPCod (String cod){
        for(Livros l: this.estoque){
            if(l.getCod().equals(cod)){
                System.out.println("--------------------------------------");
                System.out.println(l);
                System.out.println("--------------------------------------");
            }
        }
    }
    
    public void getPNome (String name){
        for(Livros l: this.estoque){
            if(l.getNome().equals(name)){
                System.out.println("--------------------------------------");
                System.out.println(l);
                System.out.println("--------------------------------------");
            }
        }
    }

    public void carregaArquivo()throws IOException{
        FileWriter fw = new FileWriter(f);
        PrintWriter pw= new PrintWriter(fw);

        for (Livros l: this.estoque){
            pw.println(l.getLivroCSV());
        }
        pw.close();
        fw.close();
    }

    public void carregaDados() throws IOException{
        FileReader fr= new FileReader(f);
        BufferedReader br= new BufferedReader(fr);
        String linha=null;
        while((linha=br.readLine())!=null){
            Livros nl=new Livros();
            nl.setLivroCSV(linha);
            this.insereLivroCSV(nl);
        }
        br.close();
    }
    
}
