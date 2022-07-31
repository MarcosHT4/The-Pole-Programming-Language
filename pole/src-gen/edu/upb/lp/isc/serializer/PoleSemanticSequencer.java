/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.pole.AsignacionVariable;
import edu.upb.lp.isc.pole.CaseSwitch;
import edu.upb.lp.isc.pole.Condicional;
import edu.upb.lp.isc.pole.CondicionalElseIf;
import edu.upb.lp.isc.pole.DeclVariables;
import edu.upb.lp.isc.pole.Division;
import edu.upb.lp.isc.pole.DoWhile;
import edu.upb.lp.isc.pole.Ejecucion;
import edu.upb.lp.isc.pole.ExpresionBooleanaSimple;
import edu.upb.lp.isc.pole.ExpresionConcatenacion;
import edu.upb.lp.isc.pole.ExpresionLongitudString;
import edu.upb.lp.isc.pole.ExpresionNegativo;
import edu.upb.lp.isc.pole.ExpresionSimpleAritmetica;
import edu.upb.lp.isc.pole.ExpresionSimpleString;
import edu.upb.lp.isc.pole.ExpresionSimpleXokas;
import edu.upb.lp.isc.pole.ExpresionStringVacio;
import edu.upb.lp.isc.pole.For;
import edu.upb.lp.isc.pole.Funciones;
import edu.upb.lp.isc.pole.Imprimir;
import edu.upb.lp.isc.pole.ImprimirSinSaltoDeLinea;
import edu.upb.lp.isc.pole.LlamadoFuncion;
import edu.upb.lp.isc.pole.LlamadoMetodo;
import edu.upb.lp.isc.pole.LlamadoVariable;
import edu.upb.lp.isc.pole.Modulo;
import edu.upb.lp.isc.pole.Multiplicacion;
import edu.upb.lp.isc.pole.OpComp;
import edu.upb.lp.isc.pole.OpNEG;
import edu.upb.lp.isc.pole.Operacion;
import edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion;
import edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacionAritmetica;
import edu.upb.lp.isc.pole.OperadoresLogicosBooleanos;
import edu.upb.lp.isc.pole.PolePackage;
import edu.upb.lp.isc.pole.Programa;
import edu.upb.lp.isc.pole.Resta;
import edu.upb.lp.isc.pole.Suma;
import edu.upb.lp.isc.pole.Switch;
import edu.upb.lp.isc.pole.While;
import edu.upb.lp.isc.services.PoleGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PoleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PoleGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PolePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PolePackage.ASIGNACION_VARIABLE:
				sequence_AsignacionVariable(context, (AsignacionVariable) semanticObject); 
				return; 
			case PolePackage.CASE_SWITCH:
				sequence_CaseSwitch(context, (CaseSwitch) semanticObject); 
				return; 
			case PolePackage.CONDICIONAL:
				sequence_Condicional(context, (Condicional) semanticObject); 
				return; 
			case PolePackage.CONDICIONAL_ELSE_IF:
				sequence_CondicionalElseIf(context, (CondicionalElseIf) semanticObject); 
				return; 
			case PolePackage.DECL_VARIABLES:
				if (rule == grammarAccess.getDeclVariables2Rule()) {
					sequence_DeclVariables2(context, (DeclVariables) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInstruccionRule()
						|| rule == grammarAccess.getDeclVariablesRule()) {
					sequence_DeclVariables(context, (DeclVariables) semanticObject); 
					return; 
				}
				else break;
			case PolePackage.DIVISION:
				sequence_Division(context, (Division) semanticObject); 
				return; 
			case PolePackage.DO_WHILE:
				sequence_DoWhile(context, (DoWhile) semanticObject); 
				return; 
			case PolePackage.EJECUCION:
				sequence_Ejecucion(context, (Ejecucion) semanticObject); 
				return; 
			case PolePackage.EXPRESION_BOOLEANA_SIMPLE:
				sequence_ExpresionBooleanaSimple(context, (ExpresionBooleanaSimple) semanticObject); 
				return; 
			case PolePackage.EXPRESION_CONCATENACION:
				sequence_ExpresionConcatenacion(context, (ExpresionConcatenacion) semanticObject); 
				return; 
			case PolePackage.EXPRESION_LONGITUD_STRING:
				sequence_ExpresionLongitudString(context, (ExpresionLongitudString) semanticObject); 
				return; 
			case PolePackage.EXPRESION_NEGATIVO:
				sequence_ExpresionNegativo(context, (ExpresionNegativo) semanticObject); 
				return; 
			case PolePackage.EXPRESION_SIMPLE_ARITMETICA:
				sequence_ExpresionSimpleAritmetica(context, (ExpresionSimpleAritmetica) semanticObject); 
				return; 
			case PolePackage.EXPRESION_SIMPLE_STRING:
				sequence_ExpresionSimpleString(context, (ExpresionSimpleString) semanticObject); 
				return; 
			case PolePackage.EXPRESION_SIMPLE_XOKAS:
				sequence_ExpresionSimpleXokas(context, (ExpresionSimpleXokas) semanticObject); 
				return; 
			case PolePackage.EXPRESION_STRING_VACIO:
				sequence_ExpresionStringVacio(context, (ExpresionStringVacio) semanticObject); 
				return; 
			case PolePackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case PolePackage.FUNCIONES:
				sequence_Funciones(context, (Funciones) semanticObject); 
				return; 
			case PolePackage.IMPRIMIR:
				sequence_Imprimir(context, (Imprimir) semanticObject); 
				return; 
			case PolePackage.IMPRIMIR_SIN_SALTO_DE_LINEA:
				sequence_ImprimirSinSaltoDeLinea(context, (ImprimirSinSaltoDeLinea) semanticObject); 
				return; 
			case PolePackage.LLAMADO_FUNCION:
				sequence_LlamadoFuncion(context, (LlamadoFuncion) semanticObject); 
				return; 
			case PolePackage.LLAMADO_METODO:
				sequence_LlamadoMetodo(context, (LlamadoMetodo) semanticObject); 
				return; 
			case PolePackage.LLAMADO_VARIABLE:
				sequence_LlamadoVariable(context, (LlamadoVariable) semanticObject); 
				return; 
			case PolePackage.MODULO:
				sequence_Modulo(context, (Modulo) semanticObject); 
				return; 
			case PolePackage.MULTIPLICACION:
				sequence_Multiplicacion(context, (Multiplicacion) semanticObject); 
				return; 
			case PolePackage.OP_COMP:
				sequence_OpComp(context, (OpComp) semanticObject); 
				return; 
			case PolePackage.OP_NEG:
				sequence_OpNEG(context, (OpNEG) semanticObject); 
				return; 
			case PolePackage.OPERACION:
				sequence_Operacion(context, (Operacion) semanticObject); 
				return; 
			case PolePackage.OPERACIONES_BOOLEANAS_DE_COMPARACION:
				sequence_OperacionesBooleanasDeComparacion(context, (OperacionesBooleanasDeComparacion) semanticObject); 
				return; 
			case PolePackage.OPERACIONES_BOOLEANAS_DE_COMPARACION_ARITMETICA:
				sequence_OperacionesBooleanasDeComparacionAritmetica(context, (OperacionesBooleanasDeComparacionAritmetica) semanticObject); 
				return; 
			case PolePackage.OPERADORES_LOGICOS_BOOLEANOS:
				sequence_OperadoresLogicosBooleanos(context, (OperadoresLogicosBooleanos) semanticObject); 
				return; 
			case PolePackage.PROGRAMA:
				sequence_Programa(context, (Programa) semanticObject); 
				return; 
			case PolePackage.RESTA:
				sequence_Resta(context, (Resta) semanticObject); 
				return; 
			case PolePackage.SUMA:
				sequence_Suma(context, (Suma) semanticObject); 
				return; 
			case PolePackage.SWITCH:
				sequence_Switch(context, (Switch) semanticObject); 
				return; 
			case PolePackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instruccion returns AsignacionVariable
	 *     AsignacionVariable returns AsignacionVariable
	 *
	 * Constraint:
	 *     (variable=[DeclVariables|ID] valor=Expresion)
	 */
	protected void sequence_AsignacionVariable(ISerializationContext context, AsignacionVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.ASIGNACION_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.ASIGNACION_VARIABLE__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.ASIGNACION_VARIABLE__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.ASIGNACION_VARIABLE__VALOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsignacionVariableAccess().getVariableDeclVariablesIDTerminalRuleCall_0_0_1(), semanticObject.eGet(PolePackage.Literals.ASIGNACION_VARIABLE__VARIABLE, false));
		feeder.accept(grammarAccess.getAsignacionVariableAccess().getValorExpresionParserRuleCall_2_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CaseSwitch returns CaseSwitch
	 *
	 * Constraint:
	 *     (e=Expresion instr+=Instruccion*)
	 */
	protected void sequence_CaseSwitch(ISerializationContext context, CaseSwitch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CondicionalElseIf returns CondicionalElseIf
	 *
	 * Constraint:
	 *     (exprELIF=Expresion instrELIF+=Instruccion*)
	 */
	protected void sequence_CondicionalElseIf(ISerializationContext context, CondicionalElseIf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns Condicional
	 *     Condicional returns Condicional
	 *
	 * Constraint:
	 *     (expr=Expresion instr+=Instruccion* casiTeam+=CondicionalElseIf* instrElse+=Instruccion*)
	 */
	protected void sequence_Condicional(ISerializationContext context, Condicional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclVariables2 returns DeclVariables
	 *
	 * Constraint:
	 *     (tipoDeDato=TipoDeDato name=ID)
	 */
	protected void sequence_DeclVariables2(ISerializationContext context, DeclVariables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.DECL_VARIABLES__TIPO_DE_DATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.DECL_VARIABLES__TIPO_DE_DATO));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.DECL_VARIABLES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.DECL_VARIABLES__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclVariables2Access().getTipoDeDatoTipoDeDatoParserRuleCall_0_0(), semanticObject.getTipoDeDato());
		feeder.accept(grammarAccess.getDeclVariables2Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns DeclVariables
	 *     DeclVariables returns DeclVariables
	 *
	 * Constraint:
	 *     (tipoDeDato=TipoDeDato name=ID valor=Expresion)
	 */
	protected void sequence_DeclVariables(ISerializationContext context, DeclVariables semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.DECL_VARIABLES__TIPO_DE_DATO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.DECL_VARIABLES__TIPO_DE_DATO));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.DECL_VARIABLES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.DECL_VARIABLES__NAME));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.DECL_VARIABLES__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.DECL_VARIABLES__VALOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclVariablesAccess().getTipoDeDatoTipoDeDatoParserRuleCall_1_0(), semanticObject.getTipoDeDato());
		feeder.accept(grammarAccess.getDeclVariablesAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeclVariablesAccess().getValorExpresionParserRuleCall_4_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Division
	 *     ExpresionDecimal returns Division
	 *     ExpresionAritmetica returns Division
	 *     Division returns Division
	 *
	 * Constraint:
	 *     op=Operacion
	 */
	protected void sequence_Division(ISerializationContext context, Division semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivisionAccess().getOpOperacionParserRuleCall_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns DoWhile
	 *     DoWhile returns DoWhile
	 *
	 * Constraint:
	 *     (name=ID instr+=Instruccion* expr=Expresion)
	 */
	protected void sequence_DoWhile(ISerializationContext context, DoWhile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ejecucion returns Ejecucion
	 *
	 * Constraint:
	 *     instr+=Instruccion+
	 */
	protected void sequence_Ejecucion(ISerializationContext context, Ejecucion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionBooleanaSimple
	 *     ExpresionBooleana returns ExpresionBooleanaSimple
	 *     ExpresionBooleanaSimple returns ExpresionBooleanaSimple
	 *
	 * Constraint:
	 *     (x='YIN' | x='YANG')
	 */
	protected void sequence_ExpresionBooleanaSimple(ISerializationContext context, ExpresionBooleanaSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionConcatenacion
	 *     ExpresionString returns ExpresionConcatenacion
	 *     ExpresionConcatenacion returns ExpresionConcatenacion
	 *
	 * Constraint:
	 *     (primero=Expresion segundo=Expresion)
	 */
	protected void sequence_ExpresionConcatenacion(ISerializationContext context, ExpresionConcatenacion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_CONCATENACION__PRIMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_CONCATENACION__PRIMERO));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_CONCATENACION__SEGUNDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_CONCATENACION__SEGUNDO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionConcatenacionAccess().getPrimeroExpresionParserRuleCall_1_0(), semanticObject.getPrimero());
		feeder.accept(grammarAccess.getExpresionConcatenacionAccess().getSegundoExpresionParserRuleCall_3_0(), semanticObject.getSegundo());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionLongitudString
	 *     ExpresionDecimal returns ExpresionLongitudString
	 *     ExpresionLongitudString returns ExpresionLongitudString
	 *
	 * Constraint:
	 *     llamado=Expresion
	 */
	protected void sequence_ExpresionLongitudString(ISerializationContext context, ExpresionLongitudString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_LONGITUD_STRING__LLAMADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_LONGITUD_STRING__LLAMADO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionLongitudStringAccess().getLlamadoExpresionParserRuleCall_1_0(), semanticObject.getLlamado());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionNegativo
	 *     ExpresionDecimal returns ExpresionNegativo
	 *     ExpresionNegativo returns ExpresionNegativo
	 *
	 * Constraint:
	 *     e=Expresion
	 */
	protected void sequence_ExpresionNegativo(ISerializationContext context, ExpresionNegativo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_NEGATIVO__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_NEGATIVO__E));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionNegativoAccess().getEExpresionParserRuleCall_1_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionSimpleAritmetica
	 *     ExpresionDecimal returns ExpresionSimpleAritmetica
	 *     ExpresionSimpleAritmetica returns ExpresionSimpleAritmetica
	 *
	 * Constraint:
	 *     x=INT
	 */
	protected void sequence_ExpresionSimpleAritmetica(ISerializationContext context, ExpresionSimpleAritmetica semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_SIMPLE_ARITMETICA__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_SIMPLE_ARITMETICA__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionSimpleAritmeticaAccess().getXINTTerminalRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionSimpleString
	 *     ExpresionString returns ExpresionSimpleString
	 *     ExpresionSimpleString returns ExpresionSimpleString
	 *
	 * Constraint:
	 *     x=STRING
	 */
	protected void sequence_ExpresionSimpleString(ISerializationContext context, ExpresionSimpleString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_SIMPLE_STRING__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_SIMPLE_STRING__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionSimpleStringAccess().getXSTRINGTerminalRuleCall_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionSimpleXokas
	 *     ExpresionDecimal returns ExpresionSimpleXokas
	 *     ExpresionSimpleXokas returns ExpresionSimpleXokas
	 *
	 * Constraint:
	 *     (x=INT y=INT z=INT?)
	 */
	protected void sequence_ExpresionSimpleXokas(ISerializationContext context, ExpresionSimpleXokas semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns ExpresionStringVacio
	 *     ExpresionBooleana returns ExpresionStringVacio
	 *     ExpresionOperacionesBooleanas returns ExpresionStringVacio
	 *     ExpresionStringVacio returns ExpresionStringVacio
	 *
	 * Constraint:
	 *     llamado=Expresion
	 */
	protected void sequence_ExpresionStringVacio(ISerializationContext context, ExpresionStringVacio semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_STRING_VACIO__LLAMADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_STRING_VACIO__LLAMADO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpresionStringVacioAccess().getLlamadoExpresionParserRuleCall_1_0(), semanticObject.getLlamado());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns For
	 *     For returns For
	 *
	 * Constraint:
	 *     (name=ID var=DeclVariables expr=ExpresionBooleana asig=AsignacionVariable instr+=Instruccion*)
	 */
	protected void sequence_For(ISerializationContext context, For semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns Funciones
	 *     Funciones returns Funciones
	 *
	 * Constraint:
	 *     (tipoDeDato=TipoDeDato name=ID param+=DeclVariables2* instr+=Instruccion* e=Expresion?)
	 */
	protected void sequence_Funciones(ISerializationContext context, Funciones semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns ImprimirSinSaltoDeLinea
	 *     ImprimirSinSaltoDeLinea returns ImprimirSinSaltoDeLinea
	 *
	 * Constraint:
	 *     (e=Expresion e1+=Expresion*)
	 */
	protected void sequence_ImprimirSinSaltoDeLinea(ISerializationContext context, ImprimirSinSaltoDeLinea semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns Imprimir
	 *     Imprimir returns Imprimir
	 *
	 * Constraint:
	 *     (e=Expresion e1+=Expresion*)
	 */
	protected void sequence_Imprimir(ISerializationContext context, Imprimir semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns LlamadoFuncion
	 *     LlamadoFuncion returns LlamadoFuncion
	 *
	 * Constraint:
	 *     (func=[Funciones|ID] args+=Expresion*)
	 */
	protected void sequence_LlamadoFuncion(ISerializationContext context, LlamadoFuncion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns LlamadoMetodo
	 *     LlamadoMetodo returns LlamadoMetodo
	 *
	 * Constraint:
	 *     (method=[Funciones|ID] args+=Expresion*)
	 */
	protected void sequence_LlamadoMetodo(ISerializationContext context, LlamadoMetodo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns LlamadoVariable
	 *     LlamadoVariable returns LlamadoVariable
	 *
	 * Constraint:
	 *     variable=[DeclVariables|ID]
	 */
	protected void sequence_LlamadoVariable(ISerializationContext context, LlamadoVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.LLAMADO_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.LLAMADO_VARIABLE__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLlamadoVariableAccess().getVariableDeclVariablesIDTerminalRuleCall_0_1(), semanticObject.eGet(PolePackage.Literals.LLAMADO_VARIABLE__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Modulo
	 *     ExpresionDecimal returns Modulo
	 *     ExpresionAritmetica returns Modulo
	 *     Modulo returns Modulo
	 *
	 * Constraint:
	 *     op=Operacion
	 */
	protected void sequence_Modulo(ISerializationContext context, Modulo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModuloAccess().getOpOperacionParserRuleCall_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Multiplicacion
	 *     ExpresionDecimal returns Multiplicacion
	 *     ExpresionAritmetica returns Multiplicacion
	 *     Multiplicacion returns Multiplicacion
	 *
	 * Constraint:
	 *     op=Operacion
	 */
	protected void sequence_Multiplicacion(ISerializationContext context, Multiplicacion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicacionAccess().getOpOperacionParserRuleCall_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OpComp returns OpComp
	 *
	 * Constraint:
	 *     (izq=Expresion der=Expresion)
	 */
	protected void sequence_OpComp(ISerializationContext context, OpComp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.OP_COMP__IZQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.OP_COMP__IZQ));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.OP_COMP__DER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.OP_COMP__DER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpCompAccess().getIzqExpresionParserRuleCall_0_0(), semanticObject.getIzq());
		feeder.accept(grammarAccess.getOpCompAccess().getDerExpresionParserRuleCall_2_0(), semanticObject.getDer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns OpNEG
	 *     ExpresionBooleana returns OpNEG
	 *     ExpresionOperacionesBooleanas returns OpNEG
	 *     OpNEG returns OpNEG
	 *
	 * Constraint:
	 *     expr=Expresion
	 */
	protected void sequence_OpNEG(ISerializationContext context, OpNEG semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.OP_NEG__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.OP_NEG__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOpNEGAccess().getExprExpresionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operacion returns Operacion
	 *
	 * Constraint:
	 *     (izq=Expresion der=Expresion)
	 */
	protected void sequence_Operacion(ISerializationContext context, Operacion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.OPERACION__IZQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.OPERACION__IZQ));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.OPERACION__DER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.OPERACION__DER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperacionAccess().getIzqExpresionParserRuleCall_1_0(), semanticObject.getIzq());
		feeder.accept(grammarAccess.getOperacionAccess().getDerExpresionParserRuleCall_3_0(), semanticObject.getDer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns OperacionesBooleanasDeComparacionAritmetica
	 *     ExpresionBooleana returns OperacionesBooleanasDeComparacionAritmetica
	 *     ExpresionOperacionesBooleanas returns OperacionesBooleanasDeComparacionAritmetica
	 *     OperacionesBooleanasDeComparacionAritmetica returns OperacionesBooleanasDeComparacionAritmetica
	 *
	 * Constraint:
	 *     ((x='LEGAL' | x='ILEGAL' | x='ALEGAL' | x='ANTILEGAL') op=OpComp)
	 */
	protected void sequence_OperacionesBooleanasDeComparacionAritmetica(ISerializationContext context, OperacionesBooleanasDeComparacionAritmetica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns OperacionesBooleanasDeComparacion
	 *     ExpresionBooleana returns OperacionesBooleanasDeComparacion
	 *     ExpresionOperacionesBooleanas returns OperacionesBooleanasDeComparacion
	 *     OperacionesBooleanasDeComparacion returns OperacionesBooleanasDeComparacion
	 *
	 * Constraint:
	 *     ((x='POXI' | x='AGUA') izq=Expresion (y='POL' | y='RRAS') der=Expresion)
	 */
	protected void sequence_OperacionesBooleanasDeComparacion(ISerializationContext context, OperacionesBooleanasDeComparacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns OperadoresLogicosBooleanos
	 *     ExpresionBooleana returns OperadoresLogicosBooleanos
	 *     ExpresionOperacionesBooleanas returns OperadoresLogicosBooleanos
	 *     OperadoresLogicosBooleanos returns OperadoresLogicosBooleanos
	 *
	 * Constraint:
	 *     ((x='PEPE' | x='NAR' | x='XO') izq=Expresion (y='PANDA' | y='ANJA' | y='R') der=Expresion)
	 */
	protected void sequence_OperadoresLogicosBooleanos(ISerializationContext context, OperadoresLogicosBooleanos semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Programa returns Programa
	 *
	 * Constraint:
	 *     (name=ID ej=Ejecucion)
	 */
	protected void sequence_Programa(ISerializationContext context, Programa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.PROGRAMA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.PROGRAMA__NAME));
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.PROGRAMA__EJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.PROGRAMA__EJ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramaAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProgramaAccess().getEjEjecucionParserRuleCall_2_0(), semanticObject.getEj());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Resta
	 *     ExpresionDecimal returns Resta
	 *     ExpresionAritmetica returns Resta
	 *     Resta returns Resta
	 *
	 * Constraint:
	 *     op=Operacion
	 */
	protected void sequence_Resta(ISerializationContext context, Resta semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRestaAccess().getOpOperacionParserRuleCall_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Suma
	 *     ExpresionDecimal returns Suma
	 *     ExpresionAritmetica returns Suma
	 *     Suma returns Suma
	 *
	 * Constraint:
	 *     op=Operacion
	 */
	protected void sequence_Suma(ISerializationContext context, Suma semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PolePackage.Literals.EXPRESION_ARITMETICA__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumaAccess().getOpOperacionParserRuleCall_1_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns Switch
	 *     Switch returns Switch
	 *
	 * Constraint:
	 *     (var=LlamadoVariable case+=CaseSwitch+)
	 */
	protected void sequence_Switch(ISerializationContext context, Switch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruccion returns While
	 *     While returns While
	 *
	 * Constraint:
	 *     (name=ID expr=Expresion instr+=Instruccion*)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}