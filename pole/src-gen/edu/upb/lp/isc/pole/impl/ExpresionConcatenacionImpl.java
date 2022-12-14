/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole.impl;

import edu.upb.lp.isc.pole.Expresion;
import edu.upb.lp.isc.pole.ExpresionConcatenacion;
import edu.upb.lp.isc.pole.PolePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Concatenacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.impl.ExpresionConcatenacionImpl#getPrimero <em>Primero</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.impl.ExpresionConcatenacionImpl#getSegundo <em>Segundo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionConcatenacionImpl extends ExpresionStringImpl implements ExpresionConcatenacion
{
  /**
   * The cached value of the '{@link #getPrimero() <em>Primero</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimero()
   * @generated
   * @ordered
   */
  protected Expresion primero;

  /**
   * The cached value of the '{@link #getSegundo() <em>Segundo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegundo()
   * @generated
   * @ordered
   */
  protected Expresion segundo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpresionConcatenacionImpl()
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
    return PolePackage.Literals.EXPRESION_CONCATENACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getPrimero()
  {
    return primero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimero(Expresion newPrimero, NotificationChain msgs)
  {
    Expresion oldPrimero = primero;
    primero = newPrimero;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.EXPRESION_CONCATENACION__PRIMERO, oldPrimero, newPrimero);
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
  public void setPrimero(Expresion newPrimero)
  {
    if (newPrimero != primero)
    {
      NotificationChain msgs = null;
      if (primero != null)
        msgs = ((InternalEObject)primero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.EXPRESION_CONCATENACION__PRIMERO, null, msgs);
      if (newPrimero != null)
        msgs = ((InternalEObject)newPrimero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.EXPRESION_CONCATENACION__PRIMERO, null, msgs);
      msgs = basicSetPrimero(newPrimero, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.EXPRESION_CONCATENACION__PRIMERO, newPrimero, newPrimero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getSegundo()
  {
    return segundo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSegundo(Expresion newSegundo, NotificationChain msgs)
  {
    Expresion oldSegundo = segundo;
    segundo = newSegundo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.EXPRESION_CONCATENACION__SEGUNDO, oldSegundo, newSegundo);
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
  public void setSegundo(Expresion newSegundo)
  {
    if (newSegundo != segundo)
    {
      NotificationChain msgs = null;
      if (segundo != null)
        msgs = ((InternalEObject)segundo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.EXPRESION_CONCATENACION__SEGUNDO, null, msgs);
      if (newSegundo != null)
        msgs = ((InternalEObject)newSegundo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.EXPRESION_CONCATENACION__SEGUNDO, null, msgs);
      msgs = basicSetSegundo(newSegundo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.EXPRESION_CONCATENACION__SEGUNDO, newSegundo, newSegundo));
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
      case PolePackage.EXPRESION_CONCATENACION__PRIMERO:
        return basicSetPrimero(null, msgs);
      case PolePackage.EXPRESION_CONCATENACION__SEGUNDO:
        return basicSetSegundo(null, msgs);
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
      case PolePackage.EXPRESION_CONCATENACION__PRIMERO:
        return getPrimero();
      case PolePackage.EXPRESION_CONCATENACION__SEGUNDO:
        return getSegundo();
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
      case PolePackage.EXPRESION_CONCATENACION__PRIMERO:
        setPrimero((Expresion)newValue);
        return;
      case PolePackage.EXPRESION_CONCATENACION__SEGUNDO:
        setSegundo((Expresion)newValue);
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
      case PolePackage.EXPRESION_CONCATENACION__PRIMERO:
        setPrimero((Expresion)null);
        return;
      case PolePackage.EXPRESION_CONCATENACION__SEGUNDO:
        setSegundo((Expresion)null);
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
      case PolePackage.EXPRESION_CONCATENACION__PRIMERO:
        return primero != null;
      case PolePackage.EXPRESION_CONCATENACION__SEGUNDO:
        return segundo != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpresionConcatenacionImpl
