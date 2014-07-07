/* This file was generated by SableCC (http://www.sablecc.org/). */

package expression.analysis;

import expression.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStartStart(AStartStart node);
    void caseAIdIdentficador(AIdIdentficador node);
    void caseAComandoSimplesBlocoComando(AComandoSimplesBlocoComando node);
    void caseABlocoComandosBlocoComando(ABlocoComandosBlocoComando node);
    void caseAExpressaoLogicaSimplesBlocoExpressao(AExpressaoLogicaSimplesBlocoExpressao node);
    void caseABlocoEspressoesLogicaBlocoExpressao(ABlocoEspressoesLogicaBlocoExpressao node);
    void caseAVariavelSimplesBlocoVariavel(AVariavelSimplesBlocoVariavel node);
    void caseABlocoVariaveisBlocoVariavel(ABlocoVariaveisBlocoVariavel node);
    void caseACasoSimplesBlocoCaso(ACasoSimplesBlocoCaso node);
    void caseABlocoCasosBlocoCaso(ABlocoCasosBlocoCaso node);
    void caseADeclaracaoSimplesBlocoDeclaracao(ADeclaracaoSimplesBlocoDeclaracao node);
    void caseABlocoDeclaracaoBlocoDeclaracao(ABlocoDeclaracaoBlocoDeclaracao node);
    void caseAProgramaInstanciaPrograma(AProgramaInstanciaPrograma node);
    void caseADeclaracaoVariavelDeclaracao(ADeclaracaoVariavelDeclaracao node);
    void caseADeclaracaoConstDeclaracao(ADeclaracaoConstDeclaracao node);
    void caseARealTipo(ARealTipo node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseACaractereTipo(ACaractereTipo node);
    void caseAVariavelVariavel(AVariavelVariavel node);
    void caseAVariavelVetorVariavel(AVariavelVetorVariavel node);
    void caseAValorRealValor(AValorRealValor node);
    void caseAValorInteiroValor(AValorInteiroValor node);
    void caseAValorCaractereValor(AValorCaractereValor node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseAFuncoesComando(AFuncoesComando node);
    void caseASeComando(ASeComando node);
    void caseASeNaoComando(ASeNaoComando node);
    void caseASeEntaoComando(ASeEntaoComando node);
    void caseASeNaoEntaoComando(ASeNaoEntaoComando node);
    void caseAAvalieComando(AAvalieComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaPassoComando(AParaPassoComando node);
    void caseAAtribuicaoAtribuicoes(AAtribuicaoAtribuicoes node);
    void caseALeiaFuncoes(ALeiaFuncoes node);
    void caseAEscrevaFuncoes(AEscrevaFuncoes node);
    void caseASenaoSenaoEstruturas(ASenaoSenaoEstruturas node);
    void caseAPassoPassoEstruturas(APassoPassoEstruturas node);
    void caseAAteAteEstrutura(AAteAteEstrutura node);
    void caseASeSeEstruturas(ASeSeEstruturas node);
    void caseASeNaoSeEstruturasNao(ASeNaoSeEstruturasNao node);
    void caseASeSenaoSeSenaoEstruturas(ASeSenaoSeSenaoEstruturas node);
    void caseASeNaoSenaoSeSenaoEstruturasNao(ASeNaoSenaoSeSenaoEstruturasNao node);
    void caseAAvalieAvalieEstruturas(AAvalieAvalieEstruturas node);
    void caseAEnquantoEnquantoEstruturas(AEnquantoEnquantoEstruturas node);
    void caseARepitaRepitaEstruturas(ARepitaRepitaEstruturas node);
    void caseAParaParaEstruturas(AParaParaEstruturas node);
    void caseAParaPassoParaPassoEstruturas(AParaPassoParaPassoEstruturas node);
    void caseANaoSinalLogicoNao(ANaoSinalLogicoNao node);
    void caseAVezesMultiplicacao(AVezesMultiplicacao node);
    void caseADivididoMultiplicacao(ADivididoMultiplicacao node);
    void caseARestoMultiplicacao(ARestoMultiplicacao node);
    void caseAMaisSoma(AMaisSoma node);
    void caseAMenosSoma(AMenosSoma node);
    void caseAMaiorIgualSinalRelacional(AMaiorIgualSinalRelacional node);
    void caseAMenorIgualSinalRelacional(AMenorIgualSinalRelacional node);
    void caseAMaiorSinalRelacional(AMaiorSinalRelacional node);
    void caseAMenorSinalRelacional(AMenorSinalRelacional node);
    void caseAIgualdadeSinalIgualdade(AIgualdadeSinalIgualdade node);
    void caseADiferencaSinalIgualdade(ADiferencaSinalIgualdade node);
    void caseAESinalLogicoE(AESinalLogicoE node);
    void caseAOuSinalLogicoOu(AOuSinalLogicoOu node);
    void caseAXorSinalLogicoOu(AXorSinalLogicoOu node);
    void caseASomasExpressao(ASomasExpressao node);
    void caseATermoExpressao(ATermoExpressao node);
    void caseAMultiplicacoesTermo(AMultiplicacoesTermo node);
    void caseAFatorTermo(AFatorTermo node);
    void caseAParentesesFator(AParentesesFator node);
    void caseAValorFator(AValorFator node);
    void caseAVarFator(AVarFator node);
    void caseAExpressaoLogicaExpressaoLogica(AExpressaoLogicaExpressaoLogica node);
    void caseATermoLogicoExpressaoLogica(ATermoLogicoExpressaoLogica node);
    void caseATermoLogicoTermoLogico(ATermoLogicoTermoLogico node);
    void caseAExpressaoRelacionalTermoLogico(AExpressaoRelacionalTermoLogico node);
    void caseAExpressaoRelacionalExpressaoRelac(AExpressaoRelacionalExpressaoRelac node);
    void caseATermoRelacExpressaoRelac(ATermoRelacExpressaoRelac node);
    void caseATermoRelacionalTermoRelac(ATermoRelacionalTermoRelac node);
    void caseANegacaoTermoRelac(ANegacaoTermoRelac node);
    void caseANegacaoNegacao(ANegacaoNegacao node);
    void caseANegacao(ANegacao node);
    void caseAParentesesParenteses(AParentesesParenteses node);

    void caseTBranco(TBranco node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentario(TComentario node);
    void caseTComentarioFinal(TComentarioFinal node);
    void caseTComentarioCorpo(TComentarioCorpo node);
    void caseTRecebe(TRecebe node);
    void caseTPontovirgula(TPontovirgula node);
    void caseTVirgula(TVirgula node);
    void caseTPonto(TPonto node);
    void caseTDoispontos(TDoispontos node);
    void caseTACochete(TACochete node);
    void caseTFCochete(TFCochete node);
    void caseTAParenteses(TAParenteses node);
    void caseTFParenteses(TFParenteses node);
    void caseTAChave(TAChave node);
    void caseTFChave(TFChave node);
    void caseTMenos(TMenos node);
    void caseTMais(TMais node);
    void caseTVezes(TVezes node);
    void caseTDividido(TDividido node);
    void caseTResto(TResto node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTNao(TNao node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTMenorigual(TMenorigual node);
    void caseTMaiorigual(TMaiorigual node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTConstante(TConstante node);
    void caseTRetorne(TRetorne node);
    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFimPonto(TFimPonto node);
    void caseTProximo(TProximo node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTEscrevaln(TEscrevaln node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimSe(TFimSe node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTEnquanto(TEnquanto node);
    void caseTFaca(TFaca node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTRepita(TRepita node);
    void caseTAte(TAte node);
    void caseTPara(TPara node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTFimPara(TFimPara node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTReal(TReal node);
    void caseTNReal(TNReal node);
    void caseTNInteiro(TNInteiro node);
    void caseTNCaractere(TNCaractere node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
