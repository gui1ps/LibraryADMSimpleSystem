import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Livraria novaLivros=new Livraria();

        int opcao;
        do{
            System.out.println("1-CADASTRAR NOVO LIVRO"+"\n2-LISTAR LIVROS"+"\n3-LISTAR LIVROS POR GÊNERO"+"\n4-LISTAR LIVROS POR CÓDIGO"+"\n5-LISTAR LIVROS POR NOME"+"\n6-CARREGAR PARA ARQUIVO"+"\n7-CARREGAR DO ARQUIVO PARA A LISTA"+"\n8-SAIR");
            opcao=scan.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("NOME:");
                    String nome= scan2.nextLine();
                    System.out.println("GÊNERO:");
                    String gen= scan2.nextLine();
                    System.out.println("CÓDIGO:");
                    String cod= scan2.nextLine();

                    novaLivros.insereLivro(nome,gen,cod);
                    break;

                case 2:
                    System.out.println("--------------------------------------");
                    novaLivros.getLivros();
                    System.out.println("--------------------------------------");
                    break;
                
                case 3:
                    System.out.println("GÊNERO:");
                    String gen0= scan2.nextLine();
                    System.out.println("--------------------------------------");
                    novaLivros.getPGenero(gen0);
                    System.out.println("--------------------------------------");
                    break;
                
                case 4:
                    System.out.println("CÓDIGO:");
                    String cod0= scan2.nextLine();
                    System.out.println("--------------------------------------");
                    novaLivros.getPCod(cod0);
                    System.out.println("--------------------------------------");
                    break;

                case 5:
                    System.out.println("NOME:");
                    String nome0= scan2.nextLine();
                    System.out.println("--------------------------------------");
                    novaLivros.getPCod(nome0);
                    System.out.println("--------------------------------------");
                    break;

                case 6:
                    System.out.println("CARREGANDO PARA O ARQUIVO");
                    novaLivros.carregaArquivo();
                    System.out.println("CARREGADO!");
                    break;
                
                case 7:
                    System.out.println("CARREGANDO DO ARQUIVO PARA A LISTA");
                    novaLivros.carregaDados();
                    System.out.println("CARREGADO!");
                    break;
                case 8:
                    System.out.println("SAINDO");
                    break;

                default:
                    System.out.println("COMANDO INVÁLIDO");
                    
            }

        }while(opcao!=8);

    }
}
