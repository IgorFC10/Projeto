// Generated from TypeExpression.g4 by ANTLR 4.4

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, NUMBER=11, TEXT=12, ATTR=13, SUM=14, SUB=15, OPREL=16, ID=17, 
		VIRG=18, PF=19, AP=20, FP=21, BLANK=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "NUMBER", "TEXT", "ATTR", "SUM", "SUB", "OPREL", "ID", "VIRG", 
		"PF", "AP", "FP", "BLANK"
	};


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private char operator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idAtribuido;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}
		
		public void runInterpreter(){
			program.run();
		}


	public TypeExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TypeExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\6\fr\n\f\r\f\16\fs\3\r\3"+
		"\r\7\rx\n\r\f\r\16\r{\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0092"+
		"\n\21\3\22\3\22\7\22\u0096\n\22\f\22\16\22\u0099\13\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30\3\2\7\3\2\62;\b\2\13\13\"#//\62;C\\c|\3\2c|\5\2\62;C\\"+
		"c|\5\2\13\f\17\17\"\"\u00ae\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2\13H\3"+
		"\2\2\2\rN\3\2\2\2\17W\3\2\2\2\21]\3\2\2\2\23b\3\2\2\2\25k\3\2\2\2\27q"+
		"\3\2\2\2\31u\3\2\2\2\33~\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0093\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2"+
		"+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\60\7h\2\2\60\61\7k\2\2\61\62\7o\2\2\62"+
		"\63\7u\2\2\63\64\7g\2\2\64\4\3\2\2\2\65\66\7g\2\2\66\67\7u\2\2\678\7e"+
		"\2\289\7t\2\29:\7g\2\2:;\7x\2\2;<\7c\2\2<\6\3\2\2\2=>\7u\2\2>?\7g\2\2"+
		"?\b\3\2\2\2@A\7K\2\2AB\7P\2\2BC\7V\2\2CD\7G\2\2DE\7I\2\2EF\7G\2\2FG\7"+
		"T\2\2G\n\3\2\2\2HI\7u\2\2IJ\7g\2\2JK\7p\2\2KL\7c\2\2LM\7q\2\2M\f\3\2\2"+
		"\2NO\7h\2\2OP\7k\2\2PQ\7o\2\2QR\7r\2\2RS\7t\2\2ST\7q\2\2TU\7i\2\2UV\7"+
		"\60\2\2V\16\3\2\2\2WX\7g\2\2XY\7p\2\2YZ\7v\2\2Z[\7c\2\2[\\\7q\2\2\\\20"+
		"\3\2\2\2]^\7T\2\2^_\7G\2\2_`\7C\2\2`a\7N\2\2a\22\3\2\2\2bc\7r\2\2cd\7"+
		"t\2\2de\7q\2\2ef\7i\2\2fg\7t\2\2gh\7c\2\2hi\7o\2\2ij\7c\2\2j\24\3\2\2"+
		"\2kl\7n\2\2lm\7g\2\2mn\7k\2\2no\7c\2\2o\26\3\2\2\2pr\t\2\2\2qp\3\2\2\2"+
		"rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\30\3\2\2\2uy\7$\2\2vx\t\3\2\2wv\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2\2}\32\3\2"+
		"\2\2~\177\7<\2\2\177\u0080\7?\2\2\u0080\34\3\2\2\2\u0081\u0082\7-\2\2"+
		"\u0082\36\3\2\2\2\u0083\u0084\7/\2\2\u0084 \3\2\2\2\u0085\u0092\7@\2\2"+
		"\u0086\u0087\7@\2\2\u0087\u0092\7?\2\2\u0088\u0092\7>\2\2\u0089\u008a"+
		"\7>\2\2\u008a\u0092\7?\2\2\u008b\u008c\7?\2\2\u008c\u0092\7?\2\2\u008d"+
		"\u008e\7>\2\2\u008e\u0092\7@\2\2\u008f\u0090\7#\2\2\u0090\u0092\7?\2\2"+
		"\u0091\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u0089"+
		"\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0097\t\4\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098$\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7.\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7\60\2\2\u009d(\3\2\2\2\u009e\u009f\7*\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7+\2\2\u00a1,\3\2\2\2\u00a2\u00a3\t\6\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\b\27\2\2\u00a5.\3\2\2\2\t\2swy\u0091\u0095\u0097\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}