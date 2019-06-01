import java.util.ArrayList;
import java.util.Collection;

public class Livro {

    private Long id;
    private String ISBN;
    private String titulo;
    private Long ano;
    private Editora editora;
    private Categoria categoria;
    private Collection<Copia> copias = new ArrayList<>();
    private Autor autor;

}
