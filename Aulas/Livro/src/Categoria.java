import java.util.ArrayList;
import java.util.Collection;

public class Categoria {

    private Long id;
    private Long codigo;
    private String descricao;
    private Collection<Livro> livros = new ArrayList<>();
}
