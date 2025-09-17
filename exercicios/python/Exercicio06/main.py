from entidade.tipoChamado import TipoChamado
from entidade.chamado import Chamado
from entidade.cliente import Cliente
from entidade.tecnico import Tecnico
from controle.controladorPessoas import ControladorPessoas
from controle.controladorChamados import ControladorChamados
from datetime import date as Date

tc = TipoChamado(1,1,"Bug")
print(tc.codigo,tc.descricao,tc.nome) # 1 1 Bug
c = Cliente("Cliente", 2)
print(c.nome,c.codigo) # Cliente 2
t = Tecnico("Tecnico", 2)
print(t.nome,t.codigo) # Tecnico 2
ch = Chamado(Date.today(), c, t, "titulo", "descricao", 4, tc)
print(ch.tipo.nome) # Bug

cp = ControladorPessoas()
cp.inclui_cliente(1, "cli")
cp.inclui_tecnico(1, "tec")
for c in cp.clientes: # cli
    print(c.nome)
for t in cp.tecnicos: # tec
    print(t.nome)

cc = ControladorChamados()
print(cc.total_chamados_por_tipo(tc)) # 0