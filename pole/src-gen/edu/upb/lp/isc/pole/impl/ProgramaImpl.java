/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole.impl;

import edu.upb.lp.isc.pole.Ejecucion;
import edu.upb.lp.isc.pole.PolePackage;
import edu.upb.lp.isc.pole.Programa;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.impl.ProgramaImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.impl.ProgramaImpl#getEj <em>Ej</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramaImpl extends MinimalEObjectImpl.Container implements Programa
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEj() <em>Ej</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEj()
   * @generated
   * @ordered
   */
  protected Ejecucion ej;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PolePackage.Literals.PROGRAMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.PROGRAMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ejecucion getEj()
  {
    return ej;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEj(Ejecucion newEj, NotificationChain msgs)
  {
    Ejecucion oldEj = ej;
    ej = newEj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.PROGRAMA__EJ, oldEj, newEj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEj(Ejecucion newEj)
  {
    if (newEj != ej)
    {
      NotificationChain msgs = null;
      if (ej != null)
        msgs = ((InternalEObject)ej).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.PROGRAMA__EJ, null, msgs);
      if (newEj != null)
        msgs = ((InternalEObject)newEj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.PROGRAMA__EJ, null, msgs);
      msgs = basicSetEj(newEj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.PROGRAMA__EJ, newEj, newEj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PolePackage.PROGRAMA__EJ:
        return basicSetEj(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PolePackage.PROGRAMA__NAME:
        return getName();
      case PolePackage.PROGRAMA__EJ:
        return getEj();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PolePackage.PROGRAMA__NAME:
        setName((String)newValue);
        return;
      case PolePackage.PROGRAMA__EJ:
        setEj((Ejecucion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PolePackage.PROGRAMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PolePackage.PROGRAMA__EJ:
        setEj((Ejecucion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PolePackage.PROGRAMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PolePackage.PROGRAMA__EJ:
        return ej != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProgramaImpl