// Generated from c:\\Repositorio\\Compiladores\\Trabalho2\\LA.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LA extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DECLARE=2, LITERAL=3, ESCREVA=4, INTEIRO=5, REAL=6, LEIA=7, 
		FIM_ALGORITMO=8, SE=9, ENTAO=10, FIM_SE=11, SENAO=12, FIM_SENAO=13, ENQUANTO=14, 
		FIM_ENQUANTO=15, PARA=16, FACA=17, FIM_PARA=18, ATE=19, CONSTANTE=20, 
		TIPO=21, REGISTRO=22, FIM_REGISTRO=23, PROCEDIMENTO=24, FIM_PROCEDIMENTO=25, 
		VAR=26, FUNCAO=27, FIM_FUNCAO=28, RETORNE=29, LOGICO=30, CASO=31, SEJA=32, 
		FIM_CASO=33, DOISPONTOS=34, E=35, OU=36, NAO=37, MENOR=38, MAIOR=39, IGUAL=40, 
		DIFERENTE=41, MENORIGUAL=42, MAIORIGUAL=43, MAIS=44, MENOS=45, MULT=46, 
		DIV=47, ABRECOL=48, FECHACOL=49, DELIM=50, ABREPAR=51, FECHAPAR=52, VIRGULA=53, 
		ATRIBUICAO=54, PONTO=55, TIL=56, FECHA_CHAVE=57, SIFRAO=58, MODULO=59, 
		PONTEIRO=60, E_COMERCIAL=61, FALSO=62, VERDADEIRO=63, NUM_INT=64, NUM_REAL=65, 
		IDENT=66, CADEIA=67, COMENTARIO=68, CADEIA_NAO_FECHADA=69, COMENTARIO_NAO_FECHADO=70, 
		WS=71, ERRO=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "DECLARE", "LITERAL", "ESCREVA", "INTEIRO", "REAL", "LEIA", 
			"FIM_ALGORITMO", "SE", "ENTAO", "FIM_SE", "SENAO", "FIM_SENAO", "ENQUANTO", 
			"FIM_ENQUANTO", "PARA", "FACA", "FIM_PARA", "ATE", "CONSTANTE", "TIPO", 
			"REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", "VAR", 
			"FUNCAO", "FIM_FUNCAO", "RETORNE", "LOGICO", "CASO", "SEJA", "FIM_CASO", 
			"DOISPONTOS", "E", "OU", "NAO", "MENOR", "MAIOR", "IGUAL", "DIFERENTE", 
			"MENORIGUAL", "MAIORIGUAL", "MAIS", "MENOS", "MULT", "DIV", "ABRECOL", 
			"FECHACOL", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA", "ATRIBUICAO", 
			"PONTO", "TIL", "FECHA_CHAVE", "SIFRAO", "MODULO", "PONTEIRO", "E_COMERCIAL", 
			"FALSO", "VERDADEIRO", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'literal'", "'escreva'", "'inteiro'", 
			"'real'", "'leia'", "'fim_algoritmo'", "'se'", "'entao'", "'fim_se'", 
			"'senao'", "'fim_senao'", "'enquanto'", "'fim_enquanto'", "'para'", "'faca'", 
			"'fim_para'", "'ate'", "'constante'", "'tipo'", "'registro'", "'fim_registro'", 
			"'procedimento'", "'fim_procedimento'", "'var'", "'funcao'", "'fim_funcao'", 
			"'retorne'", "'logico'", "'caso'", "'seja'", "'fim_caso'", "'..'", "'e'", 
			"'ou'", "'nao'", "'<'", "'>'", "'='", "'<>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'['", "']'", "':'", "'('", "')'", "','", "'<-'", 
			"'.'", "'~'", "'}'", "'$'", "'%'", "'^'", "'&'", "'falso'", "'verdadeiro'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DECLARE", "LITERAL", "ESCREVA", "INTEIRO", "REAL", 
			"LEIA", "FIM_ALGORITMO", "SE", "ENTAO", "FIM_SE", "SENAO", "FIM_SENAO", 
			"ENQUANTO", "FIM_ENQUANTO", "PARA", "FACA", "FIM_PARA", "ATE", "CONSTANTE", 
			"TIPO", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"VAR", "FUNCAO", "FIM_FUNCAO", "RETORNE", "LOGICO", "CASO", "SEJA", "FIM_CASO", 
			"DOISPONTOS", "E", "OU", "NAO", "MENOR", "MAIOR", "IGUAL", "DIFERENTE", 
			"MENORIGUAL", "MAIORIGUAL", "MAIS", "MENOS", "MULT", "DIV", "ABRECOL", 
			"FECHACOL", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA", "ATRIBUICAO", 
			"PONTO", "TIL", "FECHA_CHAVE", "SIFRAO", "MODULO", "PONTEIRO", "E_COMERCIAL", 
			"FALSO", "VERDADEIRO", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LA(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0246\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?"+
		"\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\6A\u01f2\nA\rA\16A\u01f3"+
		"\3B\6B\u01f7\nB\rB\16B\u01f8\3B\3B\6B\u01fd\nB\rB\16B\u01fe\5B\u0201\n"+
		"B\3C\6C\u0204\nC\rC\16C\u0205\3C\7C\u0209\nC\fC\16C\u020c\13C\3C\7C\u020f"+
		"\nC\fC\16C\u0212\13C\3D\3D\3D\7D\u0217\nD\fD\16D\u021a\13D\3D\3D\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3F\7F\u0227\nF\fF\16F\u022a\13F\3F\3F\3F\3F\3G\3G"+
		"\3G\7G\u0233\nG\fG\16G\u0236\13G\3G\3G\3H\3H\7H\u023c\nH\fH\16H\u023f"+
		"\13H\3I\3I\3I\3I\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089\2\u008bF\u008dG\u008fH\u0091I\u0093J\3\2\b\4\2C\\c|\4\2//aa\5"+
		"\2\62;C\\c|\5\2\f\f$$^^\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\2\u0253"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u009f\3\2\2\2\7\u00a7"+
		"\3\2\2\2\t\u00af\3\2\2\2\13\u00b7\3\2\2\2\r\u00bf\3\2\2\2\17\u00c4\3\2"+
		"\2\2\21\u00c9\3\2\2\2\23\u00d7\3\2\2\2\25\u00da\3\2\2\2\27\u00e0\3\2\2"+
		"\2\31\u00e7\3\2\2\2\33\u00ed\3\2\2\2\35\u00f7\3\2\2\2\37\u0100\3\2\2\2"+
		"!\u010d\3\2\2\2#\u0112\3\2\2\2%\u0117\3\2\2\2\'\u0120\3\2\2\2)\u0124\3"+
		"\2\2\2+\u012e\3\2\2\2-\u0133\3\2\2\2/\u013c\3\2\2\2\61\u0149\3\2\2\2\63"+
		"\u0156\3\2\2\2\65\u0167\3\2\2\2\67\u016b\3\2\2\29\u0172\3\2\2\2;\u017d"+
		"\3\2\2\2=\u0185\3\2\2\2?\u018c\3\2\2\2A\u0191\3\2\2\2C\u0196\3\2\2\2E"+
		"\u019f\3\2\2\2G\u01a2\3\2\2\2I\u01a4\3\2\2\2K\u01a7\3\2\2\2M\u01ab\3\2"+
		"\2\2O\u01ad\3\2\2\2Q\u01af\3\2\2\2S\u01b1\3\2\2\2U\u01b4\3\2\2\2W\u01b7"+
		"\3\2\2\2Y\u01ba\3\2\2\2[\u01bc\3\2\2\2]\u01be\3\2\2\2_\u01c0\3\2\2\2a"+
		"\u01c2\3\2\2\2c\u01c4\3\2\2\2e\u01c6\3\2\2\2g\u01c8\3\2\2\2i\u01ca\3\2"+
		"\2\2k\u01cc\3\2\2\2m\u01ce\3\2\2\2o\u01d1\3\2\2\2q\u01d3\3\2\2\2s\u01d5"+
		"\3\2\2\2u\u01d7\3\2\2\2w\u01d9\3\2\2\2y\u01db\3\2\2\2{\u01dd\3\2\2\2}"+
		"\u01df\3\2\2\2\177\u01e5\3\2\2\2\u0081\u01f1\3\2\2\2\u0083\u01f6\3\2\2"+
		"\2\u0085\u0203\3\2\2\2\u0087\u0213\3\2\2\2\u0089\u021d\3\2\2\2\u008b\u0220"+
		"\3\2\2\2\u008d\u022f\3\2\2\2\u008f\u0239\3\2\2\2\u0091\u0240\3\2\2\2\u0093"+
		"\u0244\3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7i\2"+
		"\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7o\2\2\u009d\u009e\7q\2\2\u009e\4\3\2\2\2\u009f\u00a0"+
		"\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\6\3\2\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\b\3\2"+
		"\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\n\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7q\2\2"+
		"\u00be\f\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c"+
		"\2\2\u00c2\u00c3\7n\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7c\2\2\u00c8\20\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7a\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5"+
		"\7o\2\2\u00d5\u00d6\7q\2\2\u00d6\22\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\24\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7q\2\2\u00df\26\3\2\2\2\u00e0\u00e1"+
		"\7h\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7a\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\30\3\2\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7q\2\2"+
		"\u00ec\32\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7"+
		"o\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7q\2\2\u00f6\34\3\2\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7s\2\2\u00fa\u00fb\7w\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7q\2\2"+
		"\u00ff\36\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7k\2\2\u0102\u0103\7"+
		"o\2\2\u0103\u0104\7a\2\2\u0104\u0105\7g\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7s\2\2\u0107\u0108\7w\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010a"+
		"\u010b\7v\2\2\u010b\u010c\7q\2\2\u010c \3\2\2\2\u010d\u010e\7r\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7t\2\2\u0110\u0111\7c\2\2\u0111\"\3\2\2\2\u0112"+
		"\u0113\7h\2\2\u0113\u0114\7c\2\2\u0114\u0115\7e\2\2\u0115\u0116\7c\2\2"+
		"\u0116$\3\2\2\2\u0117\u0118\7h\2\2\u0118\u0119\7k\2\2\u0119\u011a\7o\2"+
		"\2\u011a\u011b\7a\2\2\u011b\u011c\7r\2\2\u011c\u011d\7c\2\2\u011d\u011e"+
		"\7t\2\2\u011e\u011f\7c\2\2\u011f&\3\2\2\2\u0120\u0121\7c\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7g\2\2\u0123(\3\2\2\2\u0124\u0125\7e\2\2\u0125\u0126"+
		"\7q\2\2\u0126\u0127\7p\2\2\u0127\u0128\7u\2\2\u0128\u0129\7v\2\2\u0129"+
		"\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2"+
		"\u012d*\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7k\2\2\u0130\u0131\7r\2"+
		"\2\u0131\u0132\7q\2\2\u0132,\3\2\2\2\u0133\u0134\7t\2\2\u0134\u0135\7"+
		"g\2\2\u0135\u0136\7i\2\2\u0136\u0137\7k\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b.\3\2\2\2\u013c\u013d"+
		"\7h\2\2\u013d\u013e\7k\2\2\u013e\u013f\7o\2\2\u013f\u0140\7a\2\2\u0140"+
		"\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143\7i\2\2\u0143\u0144\7k\2\2"+
		"\u0144\u0145\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148"+
		"\7q\2\2\u0148\60\3\2\2\2\u0149\u014a\7r\2\2\u014a\u014b\7t\2\2\u014b\u014c"+
		"\7q\2\2\u014c\u014d\7e\2\2\u014d\u014e\7g\2\2\u014e\u014f\7f\2\2\u014f"+
		"\u0150\7k\2\2\u0150\u0151\7o\2\2\u0151\u0152\7g\2\2\u0152\u0153\7p\2\2"+
		"\u0153\u0154\7v\2\2\u0154\u0155\7q\2\2\u0155\62\3\2\2\2\u0156\u0157\7"+
		"h\2\2\u0157\u0158\7k\2\2\u0158\u0159\7o\2\2\u0159\u015a\7a\2\2\u015a\u015b"+
		"\7r\2\2\u015b\u015c\7t\2\2\u015c\u015d\7q\2\2\u015d\u015e\7e\2\2\u015e"+
		"\u015f\7g\2\2\u015f\u0160\7f\2\2\u0160\u0161\7k\2\2\u0161\u0162\7o\2\2"+
		"\u0162\u0163\7g\2\2\u0163\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165\u0166"+
		"\7q\2\2\u0166\64\3\2\2\2\u0167\u0168\7x\2\2\u0168\u0169\7c\2\2\u0169\u016a"+
		"\7t\2\2\u016a\66\3\2\2\2\u016b\u016c\7h\2\2\u016c\u016d\7w\2\2\u016d\u016e"+
		"\7p\2\2\u016e\u016f\7e\2\2\u016f\u0170\7c\2\2\u0170\u0171\7q\2\2\u0171"+
		"8\3\2\2\2\u0172\u0173\7h\2\2\u0173\u0174\7k\2\2\u0174\u0175\7o\2\2\u0175"+
		"\u0176\7a\2\2\u0176\u0177\7h\2\2\u0177\u0178\7w\2\2\u0178\u0179\7p\2\2"+
		"\u0179\u017a\7e\2\2\u017a\u017b\7c\2\2\u017b\u017c\7q\2\2\u017c:\3\2\2"+
		"\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2\u017f\u0180\7v\2\2\u0180\u0181"+
		"\7q\2\2\u0181\u0182\7t\2\2\u0182\u0183\7p\2\2\u0183\u0184\7g\2\2\u0184"+
		"<\3\2\2\2\u0185\u0186\7n\2\2\u0186\u0187\7q\2\2\u0187\u0188\7i\2\2\u0188"+
		"\u0189\7k\2\2\u0189\u018a\7e\2\2\u018a\u018b\7q\2\2\u018b>\3\2\2\2\u018c"+
		"\u018d\7e\2\2\u018d\u018e\7c\2\2\u018e\u018f\7u\2\2\u018f\u0190\7q\2\2"+
		"\u0190@\3\2\2\2\u0191\u0192\7u\2\2\u0192\u0193\7g\2\2\u0193\u0194\7l\2"+
		"\2\u0194\u0195\7c\2\2\u0195B\3\2\2\2\u0196\u0197\7h\2\2\u0197\u0198\7"+
		"k\2\2\u0198\u0199\7o\2\2\u0199\u019a\7a\2\2\u019a\u019b\7e\2\2\u019b\u019c"+
		"\7c\2\2\u019c\u019d\7u\2\2\u019d\u019e\7q\2\2\u019eD\3\2\2\2\u019f\u01a0"+
		"\7\60\2\2\u01a0\u01a1\7\60\2\2\u01a1F\3\2\2\2\u01a2\u01a3\7g\2\2\u01a3"+
		"H\3\2\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7w\2\2\u01a6J\3\2\2\2\u01a7\u01a8"+
		"\7p\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7q\2\2\u01aaL\3\2\2\2\u01ab\u01ac"+
		"\7>\2\2\u01acN\3\2\2\2\u01ad\u01ae\7@\2\2\u01aeP\3\2\2\2\u01af\u01b0\7"+
		"?\2\2\u01b0R\3\2\2\2\u01b1\u01b2\7>\2\2\u01b2\u01b3\7@\2\2\u01b3T\3\2"+
		"\2\2\u01b4\u01b5\7>\2\2\u01b5\u01b6\7?\2\2\u01b6V\3\2\2\2\u01b7\u01b8"+
		"\7@\2\2\u01b8\u01b9\7?\2\2\u01b9X\3\2\2\2\u01ba\u01bb\7-\2\2\u01bbZ\3"+
		"\2\2\2\u01bc\u01bd\7/\2\2\u01bd\\\3\2\2\2\u01be\u01bf\7,\2\2\u01bf^\3"+
		"\2\2\2\u01c0\u01c1\7\61\2\2\u01c1`\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3b\3"+
		"\2\2\2\u01c4\u01c5\7_\2\2\u01c5d\3\2\2\2\u01c6\u01c7\7<\2\2\u01c7f\3\2"+
		"\2\2\u01c8\u01c9\7*\2\2\u01c9h\3\2\2\2\u01ca\u01cb\7+\2\2\u01cbj\3\2\2"+
		"\2\u01cc\u01cd\7.\2\2\u01cdl\3\2\2\2\u01ce\u01cf\7>\2\2\u01cf\u01d0\7"+
		"/\2\2\u01d0n\3\2\2\2\u01d1\u01d2\7\60\2\2\u01d2p\3\2\2\2\u01d3\u01d4\7"+
		"\u0080\2\2\u01d4r\3\2\2\2\u01d5\u01d6\7\177\2\2\u01d6t\3\2\2\2\u01d7\u01d8"+
		"\7&\2\2\u01d8v\3\2\2\2\u01d9\u01da\7\'\2\2\u01dax\3\2\2\2\u01db\u01dc"+
		"\7`\2\2\u01dcz\3\2\2\2\u01dd\u01de\7(\2\2\u01de|\3\2\2\2\u01df\u01e0\7"+
		"h\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7n\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4"+
		"\7q\2\2\u01e4~\3\2\2\2\u01e5\u01e6\7x\2\2\u01e6\u01e7\7g\2\2\u01e7\u01e8"+
		"\7t\2\2\u01e8\u01e9\7f\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7f\2\2\u01eb"+
		"\u01ec\7g\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7q\2\2"+
		"\u01ef\u0080\3\2\2\2\u01f0\u01f2\4\62;\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u0082\3\2\2\2\u01f5"+
		"\u01f7\4\62;\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0200\3\2\2\2\u01fa\u01fc\7\60\2\2\u01fb"+
		"\u01fd\4\62;\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fa\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0084\3\2\2\2\u0202\u0204\t\2\2\2\u0203\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u020a\3\2\2\2\u0207\u0209\t\3\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0210\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u020f\t\4\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0086\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0218\7$\2\2\u0214\u0217\5\u0089E\2\u0215\u0217\n"+
		"\5\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u021c\7$\2\2\u021c\u0088\3\2\2\2\u021d\u021e\7^\2\2\u021e\u021f"+
		"\7$\2\2\u021f\u008a\3\2\2\2\u0220\u0228\7}\2\2\u0221\u0222\7^\2\2\u0222"+
		"\u0227\7\177\2\2\u0223\u0224\7^\2\2\u0224\u0227\7}\2\2\u0225\u0227\n\6"+
		"\2\2\u0226\u0221\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0225\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\177\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\bF\2\2\u022e\u008c\3\2\2\2\u022f\u0234\7$\2\2\u0230\u0233\5\u0089"+
		"E\2\u0231\u0233\n\5\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\f\2\2\u0238\u008e\3\2\2\2\u0239"+
		"\u023d\7}\2\2\u023a\u023c\t\7\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0090\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\t\7\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bI"+
		"\2\2\u0243\u0092\3\2\2\2\u0244\u0245\13\2\2\2\u0245\u0094\3\2\2\2\21\2"+
		"\u01f3\u01f8\u01fe\u0200\u0205\u020a\u0210\u0216\u0218\u0226\u0228\u0232"+
		"\u0234\u023d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}