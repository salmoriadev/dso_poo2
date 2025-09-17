from .abstractControladorPessoas import AbstractControladorPessoas
from entidade.cliente import Cliente
from entidade.tecnico import Tecnico

class ControladorPessoas(AbstractControladorPessoas):
    def __init__(self):
        self.__clientes = []
        self.__tecnicos = []

    def inclui_cliente(self, codigo: int, nome: str):
        cliente = Cliente(nome, codigo)
        for c in self.__clientes:
            if c.codigo == codigo:
                return None
        self.__clientes.append(cliente)
        return cliente

    def inclui_tecnico(self, codigo: int, nome: str):
        tecnico = Tecnico(nome, codigo)
        for t in self.__tecnicos:
            if t.codigo == codigo:
                return None
        self.__tecnicos.append(tecnico)
        return tecnico

    @property
    def clientes(self):
        return self.__clientes

    @property
    def tecnicos(self):
        return self.__tecnicos