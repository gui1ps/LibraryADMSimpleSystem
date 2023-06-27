import java.lang.reflect.Array;

public class Livros{

   private String nome;
   private String gen;
   private String cod;

    Livros(){

    }
    
    Livros(String n, String g, String cod){
        setNome(n);
        setGen(g);
        setCod(cod);
    
    }

    public void setNome(String name){
        this.nome=name;
    }
    public void setGen(String genero){
        this.gen=genero;
    }
    public void setCod(String codigo){
        this.cod=codigo;
    }

    public String getLivroCSV(){
        return this.nome+";"+this.gen+";"+this.cod;
    }

    public void setLivroCSV(String linha){

        String[] dados= new String[3];
        dados=linha.split(";");
        this.nome=dados[0];
        this.gen=dados[1];
        this.cod=dados[2];
    }

    String getNome(){return this.nome;}
    String getGen(){return this.gen;}
    String getCod(){return this.cod;}

    @Override
    public String toString(){return "Nome: "+this.nome+"\nGênero: "+this.gen+"\nCódigo: "+this.cod;}
}