/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.Funciones#getTipoDeDato <em>Tipo De Dato</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.Funciones#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.Funciones#getParam <em>Param</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.Funciones#getInstr <em>Instr</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.Funciones#getE <em>E</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getFunciones()
 * @model
 * @generated
 */
public interface Funciones extends Instruccion
{
  /**
   * Returns the value of the '<em><b>Tipo De Dato</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo De Dato</em>' attribute.
   * @see #setTipoDeDato(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getFunciones_TipoDeDato()
   * @model
   * @generated
   */
  String getTipoDeDato();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.Funciones#getTipoDeDato <em>Tipo De Dato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo De Dato</em>' attribute.
   * @see #getTipoDeDato()
   * @generated
   */
  void setTipoDeDato(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getFunciones_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.Funciones#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.pole.DeclVariables}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see edu.upb.lp.isc.pole.PolePackage#getFunciones_Param()
   * @model containment="true"
   * @generated
   */
  EList<DeclVariables> getParam();

  /**
   * Returns the value of the '<em><b>Instr</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.pole.Instruccion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instr</em>' containment reference list.
   * @see edu.upb.lp.isc.pole.PolePackage#getFunciones_Instr()
   * @model containment="true"
   * @generated
   */
  EList<Instruccion> getInstr();

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getFunciones_E()
   * @model containment="true"
   * @generated
   */
  Expresion getE();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.Funciones#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Expresion value);

} // Funciones
