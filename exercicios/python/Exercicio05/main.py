from aluno_posgraduacao import AlunoPosGraduacao
from aluno import Aluno
from professor import Professor
from administrativo import Administrativo

a1 = AlunoPosGraduacao(12345678900, 7, 2021001)
a1.elaborando_tese = True
print(a1.emprestar("Introdução à Programação"))

p1 = Professor("Matemática", 98765432100)
print(p1.emprestar("Cálculo I"))

adm = Administrativo("Recursos Humanos", 12345678901)
print(adm.emprestar("Manual de Procedimentos"))

print(a1.devolver("Introdução à Programação"))
print(p1.devolver("Cálculo I"))
print(adm.devolver("Manual de Procedimentos"))
from funcionario import Funcionario

f1 = Funcionario("TI", 11122233344, 15)
print(f1.emprestar("Redes de Computadores"))
print(f1.devolver("Redes de Computadores"))