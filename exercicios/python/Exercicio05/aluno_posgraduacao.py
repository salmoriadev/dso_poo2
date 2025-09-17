from aluno import Aluno
class AlunoPosGraduacao(Aluno):
    def __init__ (self, cpf:int, dias_de_emprestimo:int, matricula:int):
        super().__init__(cpf, dias_de_emprestimo,matricula)
        self.__elaborando_tese = False

    @property
    def elaborando_tese(self):
        return self.__elaborando_tese
    
    @elaborando_tese.setter
    def elaborando_tese(self, elaborando_tese: bool):
        self.__elaborando_tese = elaborando_tese

    def emprestar (self, titulo_do_livro:str):
        prazo = self.dias_de_emprestimo
        if self.__elaborando_tese:
            return "Aluno " + super().emprestar(titulo_do_livro) + str(prazo * 2) + ' dias de prazo'
        else:
            return "Aluno " + super().emprestar(titulo_do_livro) + str(prazo) + ' dias de prazo'