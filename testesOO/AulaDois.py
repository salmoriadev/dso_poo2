class Aluno:
    def __init__ (self, nome:str, idade:int, matricula:int):
        if isinstance(nome, str) and isinstance(idade, int) and isinstance(matricula, int):
            self.__nome = nome
            self.__idade = idade
            self.__matricula = matricula
        else:
            raise TypeError

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def nome(self, nome):
        if isinstance(nome, str):
            self.__nome = nome
        else:
            raise TypeError

    @property
    def idade(self):
        return self.__idade
    
    @idade.setter
    def idade(self, idade):
        if isinstance(idade, int) and idade >= 0:
            self.__idade = idade
        else:
            raise TypeError
    
    @property
    def matricula(self):
        return self.__matricula
    
    @matricula.setter
    def matricula(self, matricula):
        if isinstance(matricula, int) and matricula > 0:
            self.__matricula = matricula
        else:
            raise TypeError

    def faz_aniversario(self, idade):
        self.idade += 1

    
    def mostra_dados(self):
        print(f"Nome: {self.__nome}, Idade: {self.__idade}, Matrícula: {self.__matricula}")

def main():
    aluno1 = Aluno("Arthur", 18, 12345)
    aluno1.mostra_dados()
    
    aluno1.faz_aniversario(aluno1.idade)
    aluno1.mostra_dados()
    
    aluno1.nome = "Luigi"
    aluno1.matricula = 54321
    aluno1.mostra_dados()
    aluno2 = Aluno(0, 67890, "Pedro")
    aluno2.mostra_dados()
main()
