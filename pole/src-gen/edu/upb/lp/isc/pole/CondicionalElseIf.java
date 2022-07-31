/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condicional Else If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.CondicionalElseIf#getExprELIF <em>Expr ELIF</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.CondicionalElseIf#getInstrELIF <em>Instr ELIF</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getCondicionalElseIf()
 * @model
 * @generated
 */
public interface CondicionalElseIf extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr ELIF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr ELIF</em>' containment reference.
   * @see #setExprELIF(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getCondicionalElseIf_ExprELIF()
   * @model containment="true"
   * @generated
   */
  Expresion getExprELIF();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.CondicionalElseIf#getExprELIF <em>Expr ELIF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr ELIF</em>' containment reference.
   * @see #getExprELIF()
   * @generated
   */
  void setExprELIF(Expresion value);

  /**
   * Returns the value of the '<em><b>Instr ELIF</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.pole.Instruccion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instr ELIF</em>' containment reference list.
   * @see edu.upb.lp.isc.pole.PolePackage#getCondicionalElseIf_InstrELIF()
   * @model containment="true"
   * @generated
   */
  EList<Instruccion> getInstrELIF();

} // CondicionalElseIf