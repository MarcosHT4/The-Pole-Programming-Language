/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Concatenacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.ExpresionConcatenacion#getPrimero <em>Primero</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.ExpresionConcatenacion#getSegundo <em>Segundo</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getExpresionConcatenacion()
 * @model
 * @generated
 */
public interface ExpresionConcatenacion extends ExpresionString
{
  /**
   * Returns the value of the '<em><b>Primero</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primero</em>' containment reference.
   * @see #setPrimero(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getExpresionConcatenacion_Primero()
   * @model containment="true"
   * @generated
   */
  Expresion getPrimero();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.ExpresionConcatenacion#getPrimero <em>Primero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primero</em>' containment reference.
   * @see #getPrimero()
   * @generated
   */
  void setPrimero(Expresion value);

  /**
   * Returns the value of the '<em><b>Segundo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segundo</em>' containment reference.
   * @see #setSegundo(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getExpresionConcatenacion_Segundo()
   * @model containment="true"
   * @generated
   */
  Expresion getSegundo();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.ExpresionConcatenacion#getSegundo <em>Segundo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Segundo</em>' containment reference.
   * @see #getSegundo()
   * @generated
   */
  void setSegundo(Expresion value);

} // ExpresionConcatenacion
