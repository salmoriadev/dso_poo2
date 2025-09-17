from abc import ABC, abstractmethod
from usuario_bu import UsuarioBU

class Funcionario(UsuarioBU):

    @abstractmethod
    def __init__ (self, departamento:str, cpf:int, dias_de_emprestimo:int):
        super().__init__(cpf, dias_de_emprestimo)
        self.__departamento = departamento

    @property
    def departamento(self):
        return self.__departamento
    
    @departamento.setter
    def departamento(self, departamento):
        self.__departamento = departamento
    
    def emprestar (self, titulo_do_livro:str):
        return 'do departamento "' + self.__departamento + super().emprestar(titulo_do_livro)  + str(self.dias_de_emprestimo) + ' dias de prazo'

    def devolver (self, titulo_do_livro:str):
        return 'do departamento "' + self.__departamento + super().devolver(titulo_do_livro)
