from enum import Enum


class TabelaDeSimbolos:
    class TipoLA(Enum):
        INTEIRO = 1
        REAL = 2
        LITERAL = 3
        LOGICO = 4
        INVALIDO = 5
        TIPO = 6
        IDENT = 7

    class EntradaTabelaDeSimbolos:
        def __init__(self, nome, tipo):
            self.nome = nome
            self.tipo = tipo

    def __init__(self):
        self.tabelaDeSimbolos = {}

    def adicionar(self, nome, tipo):
        etds = TabelaDeSimbolos.EntradaTabelaDeSimbolos(nome, tipo)
        self.tabelaDeSimbolos[nome] = etds

    def existe(self, nome):
        return nome in self.tabelaDeSimbolos

    def verificar(self, nome):
        return self.tabelaDeSimbolos.get(nome).tipo
