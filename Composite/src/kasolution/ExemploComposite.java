package kasolution;

public class ExemploComposite {
    public static void main(String[] args) {
        Componente pasta1 = new Pasta("Documentos");
        Componente pasta2 = new Pasta("Imagens");

        Componente arquivo1 = new Arquivo("Relatorio.docx");
        Componente arquivo2 = new Arquivo("Foto1.jpg");
        Componente arquivo3 = new Arquivo("Foto2.jpg");

        ((Pasta) pasta1).adicionarComponente(arquivo1);
        ((Pasta) pasta2).adicionarComponente(arquivo2);
        ((Pasta) pasta2).adicionarComponente(arquivo3);

        Componente pastaPrincipal = new Pasta("Meus Documentos");
        ((Pasta) pastaPrincipal).adicionarComponente(pasta1);
        ((Pasta) pastaPrincipal).adicionarComponente(pasta2);

        pastaPrincipal.imprimir();
     // Saída:
        // Pasta: Meus Documentos
        // Pasta: Documentos
        // Arquivo: Relatorio.docx
        // Pasta: Imagens
        // Arquivo: Foto1.jpg
        // Arquivo: Foto2.jpg
    }
}
