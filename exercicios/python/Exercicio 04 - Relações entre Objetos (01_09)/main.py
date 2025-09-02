from autor import Autor
from editora import Editora
from livro import Livro
from biblioteca import Biblioteca

a1 = Autor(1, "Machado de Assis")
a2 = Autor(2, "Ariano Suassuna")
ed1 = Editora(1, "Via Leitura")
l1 = Livro(42, "Dom Casmurro", 2015, ed1, a1, 1, "Do Título")
print(l1.codigo, l1.titulo, l1.ano, l1.editora.nome, l1.autores[0].nome, l1.capitulos[0].titulo)
l1.codigo = 1
l1.titulo = "Memórias Póstumas de Brás Cubas"
l1.ano = 2010
l1.incluir_autor(a2)
for autor in l1.autores:
    print(autor.nome)
biblio = Biblioteca()
biblio.incluir_livro(l1)
for livro in biblio.livros:
    print(livro.titulo)
