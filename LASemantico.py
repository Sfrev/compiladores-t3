from LAParser import LAParser
from LAVisitor import LAVisitor
from TabelaDeSimbolos import TabelaDeSimbolos
from LASemanticoUtils import LASemanticoUtils
from Escopos import Escopo


class LASemantico(LAVisitor):
    escopos = Escopo()

    def visitPrograma(self, ctx: LAParser.ProgramaContext):
        return super().visitPrograma(ctx)

    def visitDeclaracao_constante(self, ctx: LAParser.Declaracao_constanteContext):
        escopoAtual = LASemantico.escopos.obterEscopoAtual()

        if escopoAtual.existe(ctx.IDENT().getText()):
            LASemanticoUtils.adicionarErroSemantico(token=ctx.start,
                                                    mensagem=f'constante {ctx.IDENT().getText()} ja declarado '
                                                             f'anteriormente')
        else:
            tipo = TabelaDeSimbolos.TipoLA.INTEIRO
            if ctx.tipo_basico().getText() == 'literal':
                tipo = TabelaDeSimbolos.TipoLA.LITERAL
            elif ctx.tipo_basico().getText() == 'real':
                tipo = TabelaDeSimbolos.TipoLA.REAL
            elif ctx.tipo_basico().getText() == 'logico':
                tipo = TabelaDeSimbolos.TipoLA.LOGICO
            elif ctx.tipo_basico().getText() == 'inteiro':
                tipo = TabelaDeSimbolos.TipoLA.INTEIRO

            escopoAtual.adicionar(ctx.IDENT().getText(), tipo)

        return super().visitDeclaracao_constante(ctx)

    def visitDeclaracao_tipo(self, ctx: LAParser.Declaracao_tipoContext):

        escopoAtual = LASemantico.escopos.obterEscopoAtual()

        if escopoAtual.existe(ctx.IDENT().getText()):
            LASemanticoUtils.adicionarErroSemantico(token=ctx.start,
                                                    mensagem=f'tipo {ctx.IDENT().getText()} declarado duas vezes num '
                                                             f'mesmo escopo')
        else:
            escopoAtual.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.TipoLA.TIPO)

        return super().visitDeclaracao_tipo(ctx)

    def visitDeclaracao_variavel(self, ctx: LAParser.Declaracao_variavelContext):
        escopoAtual = LASemantico.escopos.obterEscopoAtual()

        for identificador in ctx.variavel().identificador():
            if escopoAtual.existe(identificador.getText()):
                LASemanticoUtils.adicionarErroSemantico(identificador.start,
                                                        f'identificador {identificador.getText()} ja declarado '
                                                        f'anteriormente')
            else:
                tipo = TabelaDeSimbolos.TipoLA.INTEIRO
                if ctx.variavel().tipo().getText() == 'literal':
                    tipo = TabelaDeSimbolos.TipoLA.LITERAL
                elif ctx.variavel().tipo().getText() == 'real':
                    tipo = TabelaDeSimbolos.TipoLA.REAL
                elif ctx.variavel().tipo().getText() == 'logico':
                    tipo = TabelaDeSimbolos.TipoLA.LOGICO
                elif ctx.variavel().tipo().getText() == 'inteiro':
                    tipo = TabelaDeSimbolos.TipoLA.INTEIRO

                escopoAtual.adicionar(identificador.getText(), tipo)

        return super().visitDeclaracao_variavel(ctx)

    def visitDeclaracao_global(self, ctx: LAParser.Declaracao_globalContext):
        escopoAtual = LASemantico.escopos.obterEscopoAtual()

        if escopoAtual.existe(ctx.IDENT().getText()):
            LASemanticoUtils.adicionarErroSemantico(ctx.start, f'{ctx.IDENT().getText()} ja declarado anteriormente')
        else:
            escopoAtual.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.TipoLA.TIPO)

        return super().visitDeclaracao_global(ctx)

    def visitTipo_basico_ident(self, ctx: LAParser.Tipo_basico_identContext):

        if ctx.IDENT() is not None:
            for escopo in LASemantico.escopos.obterPilha():
                if not escopo.existe(ctx.IDENT().getText()):
                    LASemanticoUtils.adicionarErroSemantico(ctx.start, f'tipo {ctx.IDENT().getText()} nao declarado')
                    break

        return super().visitTipo_basico_ident(ctx)

    def visitIdentificador(self, ctx: LAParser.IdentificadorContext):
        for escopo in LASemantico.escopos.obterPilha():
            if not escopo.existe(ctx.IDENT(0).getText()):
                LASemanticoUtils.adicionarErroSemantico(ctx.start, f'identificador {ctx.IDENT(0).getText()} nao '
                                                                   f'declarado')
                break
        return super().visitIdentificador(ctx)

    def visitCmdAtribuicao(self, ctx: LAParser.CmdAtribuicaoContext):
        tipoExpressao = LASemanticoUtils.verificarTipoExpressao(escopos=LASemantico.escopos, ctx=ctx.expressao())
        error = False
        nomeVar = ctx.identificador().getText()
        if tipoExpressao != TabelaDeSimbolos.TipoLA.INVALIDO:
            for escopo in LASemantico.escopos.obterPilha():
                if escopo.existe(nomeVar):
                    tipoVar = LASemanticoUtils.verificarTipoNomeVar(escopos=LASemantico.escopos, nomeVar=nomeVar)
                    varNumeric = tipoVar == TabelaDeSimbolos.TipoLA.INTEIRO or tipoVar == TabelaDeSimbolos.TipoLA.REAL
                    expNumeric = tipoExpressao == TabelaDeSimbolos.TipoLA.INTEIRO or tipoExpressao == TabelaDeSimbolos.TipoLA.REAL
                    if not (
                            varNumeric and expNumeric) and tipoVar != tipoExpressao and tipoExpressao != TabelaDeSimbolos.TipoLA.INVALIDO:
                        error = True
        else:
            error = True

        if error:
            LASemanticoUtils.adicionarErroSemantico(ctx.identificador().start, f'atribuicao nao compativel para {nomeVar}')

        return super().visitCmdAtribuicao(ctx)
