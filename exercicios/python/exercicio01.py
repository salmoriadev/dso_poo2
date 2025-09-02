class Ordenacao():
    def ordena(self, array_para_ordenar:[]):
        """Realiza a ordenacao do conteudo do array recebido como parâmetro;
        preferi fazer um quicksort pela menor complexidade do algoritmo (O(n log n));
        no caso médio. Eliminei os casos do array já estar ordenado ou ao contrario;
        o que diminui os casos de O(n²) junto com o pivo sendo o meio do array.
        não era necessario tudo isso e poderia ser um código mais legivel e curto, porém assim;
        diminui os piores casos.
        """
        lista_maior = []
        lista_menor = []
        if len(array_para_ordenar) <= 1:
            return array_para_ordenar
        else:
            for i in range (len(array_para_ordenar)):
                if not array_para_ordenar[i] >= array_para_ordenar[i-1] and i != 0:
                    break
                elif i == len(array_para_ordenar) - 1:
                    return array_para_ordenar
            for i in range (len(array_para_ordenar)):
                if not array_para_ordenar[i] <= array_para_ordenar[i-1] and i != 0:
                    break
                elif i == len(array_para_ordenar) - 1:
                    array_para_ordenar.reverse()
                    return array_para_ordenar
            pivo = array_para_ordenar[len(array_para_ordenar) // 2]
            array_para_ordenar.remove(pivo)
            for i in range (len(array_para_ordenar)):
                if array_para_ordenar[i] >= pivo:
                    lista_maior.append(array_para_ordenar[i])
                else:
                    lista_menor.append(array_para_ordenar[i])
        return self.ordena(lista_menor) + [pivo] + self.ordena(lista_maior)

    def to_string(self, array_ordenado:[]):
        """Converte o conteudo do array em String formatado; 
        estava colocando espaço depois da virgula e só percebi depois da aula em casa
     """
        saida_string = ''
        for i in range (len(array_ordenado)-1):
            saida_string += str(array_ordenado[i]) + ','
        saida_string += str(array_ordenado[-1])
        return saida_string