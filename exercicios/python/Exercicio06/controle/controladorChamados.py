from .abstractControladorChamados import AbstractControladorChamados
from entidade.tipoChamado import TipoChamado
from entidade.chamado import Chamado
from datetime import date as Date
from entidade.cliente import Cliente
from entidade.tecnico import Tecnico
from collections import defaultdict

class ControladorChamados(AbstractControladorChamados):
	def __init__(self):
		super().__init__()
		self.__chamados = []
		self.__tipos_chamados = []

	def total_chamados_por_tipo(self, tipo: TipoChamado) -> int:
		return sum(1 for c in self.__chamados if c.tipo == tipo)

	def inclui_chamado(self, data: Date, cliente: Cliente, tecnico: Tecnico, titulo: str, descricao: str, prioridade: int, tipo: TipoChamado) -> Chamado:
		if not isinstance(data, Date) or not isinstance(cliente, Cliente) or not isinstance(tecnico, Tecnico) or not isinstance(tipo, TipoChamado):
			return None
		chamado = Chamado(data, cliente, tecnico, titulo, descricao, prioridade, tipo)
		for c in self.__chamados:
			if c.data == data and c.cliente == cliente and c.tecnico == tecnico and c.tipo == tipo:
				return None
		self.__chamados.append(chamado)
		return chamado

	def inclui_tipochamado(self, codigo: int, nome: str, descricao: str) -> TipoChamado:
		if not isinstance(codigo, int) or not isinstance(nome, str) or not isinstance(descricao, str):
			return None
		tipo = TipoChamado(codigo, nome, descricao)
		for t in self.__tipos_chamados:
			if t.codigo == codigo:
				return None
		self.__tipos_chamados.append(tipo)
		return tipo

	@property
	def tipos_chamados(self):
		return self.__tipos_chamados