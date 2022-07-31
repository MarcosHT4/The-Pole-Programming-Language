/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.DeclVariables#getTipoDeDato <em>Tipo De Dato</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.DeclVariables#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.DeclVariables#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getDeclVariables()
 * @model
 * @generated
 */
public interface DeclVariables extends Instruccion
{
  /**
   * Returns the value of the '<em><b>Tipo De Dato</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo De Dato</em>' attribute.
   * @see #setTipoDeDato(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getDeclVariables_TipoDeDato()
   * @model
   * @generated
   */
  String getTipoDeDato();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.DeclVariables#getTipoDeDato <em>Tipo De Dato</em>}' attribute.
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
   * @see edu.upb.lp.isc.pole.PolePackage#getDeclVariables_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.DeclVariables#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' containment reference.
   * @see #setValor(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getDeclVariables_Valor()
   * @model containment="true"
   * @generated
   */
  Expresion getValor();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.DeclVariables#getValor <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' containment reference.
   * @see #getValor()
   * @generated
   */
  void setValor(Expresion value);

} // DeclVariables
