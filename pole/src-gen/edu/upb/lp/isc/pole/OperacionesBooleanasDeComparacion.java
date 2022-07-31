/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operaciones Booleanas De Comparacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getX <em>X</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getIzq <em>Izq</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getY <em>Y</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getOperacionesBooleanasDeComparacion()
 * @model
 * @generated
 */
public interface OperacionesBooleanasDeComparacion extends ExpresionOperacionesBooleanas
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getOperacionesBooleanasDeComparacion_X()
   * @model
   * @generated
   */
  String getX();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(String value);

  /**
   * Returns the value of the '<em><b>Izq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Izq</em>' containment reference.
   * @see #setIzq(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getOperacionesBooleanasDeComparacion_Izq()
   * @model containment="true"
   * @generated
   */
  Expresion getIzq();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getIzq <em>Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Izq</em>' containment reference.
   * @see #getIzq()
   * @generated
   */
  void setIzq(Expresion value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getOperacionesBooleanasDeComparacion_Y()
   * @model
   * @generated
   */
  String getY();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(String value);

  /**
   * Returns the value of the '<em><b>Der</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Der</em>' containment reference.
   * @see #setDer(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getOperacionesBooleanasDeComparacion_Der()
   * @model containment="true"
   * @generated
   */
  Expresion getDer();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.OperacionesBooleanasDeComparacion#getDer <em>Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Der</em>' containment reference.
   * @see #getDer()
   * @generated
   */
  void setDer(Expresion value);

} // OperacionesBooleanasDeComparacion