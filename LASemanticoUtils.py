from TabelaDeSimbolos import TabelaDeSimbolos
from LAParser import LAParser
from Escopos import Escopo


class LASemanticoUtils:

    errosSemanticos = []

    @staticmethod
    def adicionarErroSemantico(token, mensagem):

        linha = token.line
        LASemanticoUtils.errosSemanticos.append(f"Linha {linha}: {mensagem}")

    @staticmethod
    def verificarTipoExpressao(escopos: Escopo, ctx: LAParser.ExpressaoContext):

        ret = None

        for ta in ctx.termo_logico():
            aux = LASemanticoUtils.verificarTipoTermo_logico(escopos, ta)
            if ret is None:
                ret = aux
            elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                ret = TabelaDeSimbolos.TipoLA.INVALIDO

        return ret

    @staticmethod
    def verificarTipoTermo_logico(escopos: Escopo, ctx: LAParser.Termo_logicoContext):

        ret = None

        for ta in ctx.fator_logico():
            aux = LASemanticoUtils.verificarTipoFator_logico(escopos, ta)
            if ret is None:
                ret = aux
            elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                ret = TabelaDeSimbolos.TipoLA.INVALIDO

        return ret

    @staticmethod
    def verificarTipoFator_logico(escopos: Escopo, ctx: LAParser.Fator_logicoContext):

        return LASemanticoUtils.verificarTipoParcela_logica(escopos, ctx.parcela_logica())

    @staticmethod
    def verificarTipoParcela_logica(escopos, ctx: LAParser.Parcela_logicaContext):

        if ctx.exp_relacional() is not None:
            ret = LASemanticoUtils.verificarTipoExp_relacional(escopos, ctx.exp_relacional())
        else:
            ret = TabelaDeSimbolos.TipoLA.LOGICO

        return ret

    @staticmethod
    def verificarTipoExp_relacional(escopos: Escopo, ctx: LAParser.Exp_relacionalContext):

        ret = None

        if ctx.op_relacional() is not None:
            for ta in ctx.exp_aritmetica():
                aux = LASemanticoUtils.verificarTipoExp_aritmetica(escopos, ta)
                auxNumeric = aux == TabelaDeSimbolos.TipoLA.INTEIRO or aux == TabelaDeSimbolos.TipoLA.REAL
                retNumeric = ret == TabelaDeSimbolos.TipoLA.INTEIRO or ret == TabelaDeSimbolos.TipoLA.REAL
                if ret is None:
                    ret = aux
                elif not (auxNumeric and retNumeric) and aux != ret:
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO

            if ret != TabelaDeSimbolos.TipoLA.INVALIDO:
                ret = TabelaDeSimbolos.TipoLA.LOGICO

        else:
            ret = LASemanticoUtils.verificarTipoExp_aritmetica(escopos, ctx.exp_aritmetica(0))

        return ret

    @staticmethod
    def verificarTipoExp_aritmetica(escopos: Escopo, ctx: LAParser.Exp_aritmeticaContext):

        ret = None

        for ta in ctx.termo():
            aux = LASemanticoUtils.verificarTipoTermo(escopos, ta)
            if ret is None:
                ret = aux
            elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                ret = TabelaDeSimbolos.TipoLA.INVALIDO

        return ret

    @staticmethod
    def verificarTipoTermo(escopos: Escopo, ctx: LAParser.TermoContext):

        ret = None

        for ta in ctx.fator():
            aux = LASemanticoUtils.verificarTipoFator(escopos, ta)
            auxNumeric = aux == TabelaDeSimbolos.TipoLA.INTEIRO or aux == TabelaDeSimbolos.TipoLA.REAL
            retNumeric = ret == TabelaDeSimbolos.TipoLA.INTEIRO or ret == TabelaDeSimbolos.TipoLA.REAL
            if ret is None:
                ret = aux
            elif not (auxNumeric and retNumeric) and aux != ret:
                ret = TabelaDeSimbolos.TipoLA.INVALIDO

        return ret

    @staticmethod
    def verificarTipoFator(escopos: Escopo, ctx: LAParser.FatorContext):

        ret = None

        for ta in ctx.parcela():
            aux = LASemanticoUtils.verificarTipoParcela(escopos, ta)
            if ret is None:
                ret = aux
            elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                ret = TabelaDeSimbolos.TipoLA.INVALIDO

        return ret

    @staticmethod
    def verificarTipoParcela(escopos: Escopo, ctx: LAParser.ParcelaContext):

        ret = TabelaDeSimbolos.TipoLA.INVALIDO

        if ctx.parcela_nao_unario() is not None:
            ret = LASemanticoUtils.verificarTipoParcela_nao_unario(escopos, ctx.parcela_nao_unario())
        else:
            ret = LASemanticoUtils.verificarTipoParcela_unario(escopos, ctx.parcela_unario())
        return ret

    @staticmethod
    def verificarTipoParcela_nao_unario(escopos: Escopo, ctx: LAParser.Parcela_nao_unarioContext):
        
        if ctx.identificador() is not None:
            return LASemanticoUtils.verificarTipoIdentificador(escopos, ctx.identificador())

        return TabelaDeSimbolos.TipoLA.LITERAL

    @staticmethod
    def verificarTipoIdentificador(escopos: Escopo, ctx: LAParser.IdentificadorContext):

        nomeVar = ''
        ret = TabelaDeSimbolos.TipoLA.INVALIDO
        for i in range(len(ctx.IDENT())):
            nomeVar += ctx.IDENT(i).getText()

            if i != len(ctx.IDENT()) - 1:
                nomeVar += '.'

        for tabela in escopos.obterPilha():
            if tabela.existe(nomeVar):
                ret = LASemanticoUtils.verificarTipoNomeVar(escopos, nomeVar)

        return ret

    @staticmethod
    def verificarTipoParcela_unario(escopos: Escopo, ctx: LAParser.Parcela_unarioContext):
        
        if ctx.NUM_INT() is not None:
            return TabelaDeSimbolos.TipoLA.INTEIRO
        if ctx.NUM_REAL() is not None:
            return TabelaDeSimbolos.TipoLA.REAL
        if ctx.identificador() is not None:
            return LASemanticoUtils.verificarTipoIdentificador(escopos, ctx.identificador())
        if ctx.IDENT() is not None:
            ret = LASemanticoUtils.verificarTipoNomeVar(escopos, ctx.IDENT().getText())

            for expressaoContext in ctx.expressao():
                aux = LASemanticoUtils.verificarTipoExpressao(escopos, expressaoContext)

                if ret is None:
                    ret = aux
                elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO

            return ret
        else:
            ret = None

            for expressaoContext in ctx.expressao():
                aux = LASemanticoUtils.verificarTipoExpressao(escopos, expressaoContext)

                if ret is None:
                    ret = aux
                elif ret != aux and aux != TabelaDeSimbolos.TipoLA.INVALIDO:
                    ret = TabelaDeSimbolos.TipoLA.INVALIDO
            return ret


    @staticmethod
    def verificarTipoNomeVar(escopos: Escopo, nomeVar: str):
        tipo = None

        for tabela in escopos.obterPilha():
            tipo = tabela.verificar(nomeVar)
        return tipo
