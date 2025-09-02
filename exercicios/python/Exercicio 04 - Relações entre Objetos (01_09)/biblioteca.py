from livro import Livro

class Biblioteca:
    def __init__(self):
        self.__livros = []

    def incluir_livro(self, livro: Livro):
        if isinstance(livro,Livro):
            for possivel_livro in self.__livros:
                if possivel_livro == livro:
                    return
            self.__livros.append(livro)

    def excluir_livro(self, livro: Livro):
        self.__livros.remove(livro)

    @property
    def livros(self):
        return self.__livros
