/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.Programa#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.Programa#getEj <em>Ej</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.upb.lp.isc.pole.PolePackage#getPrograma_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.Programa#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ej</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ej</em>' containment reference.
   * @see #setEj(Ejecucion)
   * @see edu.upb.lp.isc.pole.PolePackage#getPrograma_Ej()
   * @model containment="true"
   * @generated
   */
  Ejecucion getEj();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.pole.Programa#getEj <em>Ej</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ej</em>' containment reference.
   * @see #getEj()
   * @generated
   */
  void setEj(Ejecucion value);

} // Programa