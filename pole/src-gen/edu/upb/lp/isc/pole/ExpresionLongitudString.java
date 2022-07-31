/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Longitud String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.ExpresionLongitudString#getLlamado <em>Llamado</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getExpresionLongitudString()
 * @model
 * @generated
 */
public interface ExpresionLongitudString extends ExpresionDecimal
{
  /**
   * Returns the value of the '<em><b>Llamado</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Llamado</em>' containment reference.
   * @see #setLlamado(Expresion)
   * @see edu.upb.lp.isc.pole.PolePackage#getExpresionLongitudString_Llamado()
   * @model containment="true"
   * @generated
   */
  Expresion getLlamado();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.ExpresionLongitudString#getLlamado <em>Llamado</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Llamado</em>' containment reference.
   * @see #getLlamado()
   * @generated
   */
  void setLlamado(Expresion value);

} // ExpresionLongitudString