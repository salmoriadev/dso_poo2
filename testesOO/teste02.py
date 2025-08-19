class Circulo:
    def __init__ (self, raio: float):
        self._raio = raio
    
    @property
    def raio (self):
        return self._raio
    
    @raio.setter
    def raio (self, novo_raio: float):
        if novo_raio >= 0:
            self._raio = novo_raio
        else:
            raise ValueError
    
    def calcular_area (self):
        area = (self._raio ** 2) * 3.14
        return area
    
class Retangulo:
    def __init__ (self, altura: float, largura: float):
        self._altura = altura
        self._largura = largura
        
    @property
    def altura (self):
        return self._altura
    
    @altura.setter
    def altura (self, nova_altura: float):
        if nova_altura >= 0:
            self._altura = nova_altura
        else:
            raise ValueError    
    
    @property
    def largura (self):
        return self._largura
    
    @largura.setter
    def largura (self, nova_largura: float):
        if nova_largura >= 0:
            self._largura = nova_largura
        else:
            raise ValueError
    
    def calcular_area (self):
        area = self._largura * self._altura
        return area

class Quadrado:
    def __init__ (self, lado: float):
        self._lado = lado
        
    @property
    def lado (self):
        return self._lado
    
    @lado.setter
    def lado (self, novo_lado: float):
        if novo_lado >= 0:
            self._lado = novo_lado
        else:
            raise ValueError

    def calcular_area (self):
        area = self._lado ** 2
        return area
   
print("Quadrado")
q1 = Quadrado(9)
print(q1.lado)
q1.lado = 8
print(q1.lado)
print(q1.calcular_area())

print("Circulo")
c1 = Circulo(9)
print(c1.raio)
c1.raio = 8
print(c1.raio)
print(c1.calcular_area())

print("Retangulo")
r1 = Retangulo(9, 8)
print(r1.largura)
print(r1.altura)
print(r1.calcular_area())