/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole.impl;

import edu.upb.lp.isc.pole.Expresion;
import edu.upb.lp.isc.pole.OpComp;
import edu.upb.lp.isc.pole.PolePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.impl.OpCompImpl#getIzq <em>Izq</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.impl.OpCompImpl#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpCompImpl extends MinimalEObjectImpl.Container implements OpComp
{
  /**
   * The cached value of the '{@link #getIzq() <em>Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzq()
   * @generated
   * @ordered
   */
  protected Expresion izq;

  /**
   * The cached value of the '{@link #getDer() <em>Der</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDer()
   * @generated
   * @ordered
   */
  protected Expresion der;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpCompImpl()
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
    return PolePackage.Literals.OP_COMP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getIzq()
  {
    return izq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIzq(Expresion newIzq, NotificationChain msgs)
  {
    Expresion oldIzq = izq;
    izq = newIzq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.OP_COMP__IZQ, oldIzq, newIzq);
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
  public void setIzq(Expresion newIzq)
  {
    if (newIzq != izq)
    {
      NotificationChain msgs = null;
      if (izq != null)
        msgs = ((InternalEObject)izq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.OP_COMP__IZQ, null, msgs);
      if (newIzq != null)
        msgs = ((InternalEObject)newIzq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.OP_COMP__IZQ, null, msgs);
      msgs = basicSetIzq(newIzq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.OP_COMP__IZQ, newIzq, newIzq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getDer()
  {
    return der;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDer(Expresion newDer, NotificationChain msgs)
  {
    Expresion oldDer = der;
    der = newDer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.OP_COMP__DER, oldDer, newDer);
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
  public void setDer(Expresion newDer)
  {
    if (newDer != der)
    {
      NotificationChain msgs = null;
      if (der != null)
        msgs = ((InternalEObject)der).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.OP_COMP__DER, null, msgs);
      if (newDer != null)
        msgs = ((InternalEObject)newDer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.OP_COMP__DER, null, msgs);
      msgs = basicSetDer(newDer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.OP_COMP__DER, newDer, newDer));
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
      case PolePackage.OP_COMP__IZQ:
        return basicSetIzq(null, msgs);
      case PolePackage.OP_COMP__DER:
        return basicSetDer(null, msgs);
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
      case PolePackage.OP_COMP__IZQ:
        return getIzq();
      case PolePackage.OP_COMP__DER:
        return getDer();
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
      case PolePackage.OP_COMP__IZQ:
        setIzq((Expresion)newValue);
        return;
      case PolePackage.OP_COMP__DER:
        setDer((Expresion)newValue);
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
      case PolePackage.OP_COMP__IZQ:
        setIzq((Expresion)null);
        return;
      case PolePackage.OP_COMP__DER:
        setDer((Expresion)null);
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
      case PolePackage.OP_COMP__IZQ:
        return izq != null;
      case PolePackage.OP_COMP__DER:
        return der != null;
    }
    return super.eIsSet(featureID);
  }

} //OpCompImpl
