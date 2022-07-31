/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejecucion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.Ejecucion#getInstr <em>Instr</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.pole.PolePackage#getEjecucion()
 * @model
 * @generated
 */
public interface Ejecucion extends EObject
{
  /**
   * Returns the value of the '<em><b>Instr</b></em>' containment reference list.
   * The list contents are of type {@link edu.upb.lp.isc.pole.Instruccion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instr</em>' containment reference list.
   * @see edu.upb.lp.isc.pole.PolePackage#getEjecucion_Instr()
   * @model containment="true"
   * @generated
   */
  EList<Instruccion> getInstr();

} // Ejecucion