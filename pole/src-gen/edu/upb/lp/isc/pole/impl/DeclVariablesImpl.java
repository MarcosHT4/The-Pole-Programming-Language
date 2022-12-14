/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.pole.impl;

import edu.upb.lp.isc.pole.DeclVariables;
import edu.upb.lp.isc.pole.Expresion;
import edu.upb.lp.isc.pole.PolePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.pole.impl.DeclVariablesImpl#getTipoDeDato <em>Tipo De Dato</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.impl.DeclVariablesImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.pole.impl.DeclVariablesImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclVariablesImpl extends InstruccionImpl implements DeclVariables
{
  /**
   * The default value of the '{@link #getTipoDeDato() <em>Tipo De Dato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoDeDato()
   * @generated
   * @ordered
   */
  protected static final String TIPO_DE_DATO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipoDeDato() <em>Tipo De Dato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoDeDato()
   * @generated
   * @ordered
   */
  protected String tipoDeDato = TIPO_DE_DATO_EDEFAULT;

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
   * The cached value of the '{@link #getValor() <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected Expresion valor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclVariablesImpl()
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
    return PolePackage.Literals.DECL_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipoDeDato()
  {
    return tipoDeDato;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipoDeDato(String newTipoDeDato)
  {
    String oldTipoDeDato = tipoDeDato;
    tipoDeDato = newTipoDeDato;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.DECL_VARIABLES__TIPO_DE_DATO, oldTipoDeDato, tipoDeDato));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.DECL_VARIABLES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expresion getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValor(Expresion newValor, NotificationChain msgs)
  {
    Expresion oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PolePackage.DECL_VARIABLES__VALOR, oldValor, newValor);
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
  public void setValor(Expresion newValor)
  {
    if (newValor != valor)
    {
      NotificationChain msgs = null;
      if (valor != null)
        msgs = ((InternalEObject)valor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PolePackage.DECL_VARIABLES__VALOR, null, msgs);
      if (newValor != null)
        msgs = ((InternalEObject)newValor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PolePackage.DECL_VARIABLES__VALOR, null, msgs);
      msgs = basicSetValor(newValor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolePackage.DECL_VARIABLES__VALOR, newValor, newValor));
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
      case PolePackage.DECL_VARIABLES__VALOR:
        return basicSetValor(null, msgs);
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
      case PolePackage.DECL_VARIABLES__TIPO_DE_DATO:
        return getTipoDeDato();
      case PolePackage.DECL_VARIABLES__NAME:
        return getName();
      case PolePackage.DECL_VARIABLES__VALOR:
        return getValor();
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
      case PolePackage.DECL_VARIABLES__TIPO_DE_DATO:
        setTipoDeDato((String)newValue);
        return;
      case PolePackage.DECL_VARIABLES__NAME:
        setName((String)newValue);
        return;
      case PolePackage.DECL_VARIABLES__VALOR:
        setValor((Expresion)newValue);
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
      case PolePackage.DECL_VARIABLES__TIPO_DE_DATO:
        setTipoDeDato(TIPO_DE_DATO_EDEFAULT);
        return;
      case PolePackage.DECL_VARIABLES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PolePackage.DECL_VARIABLES__VALOR:
        setValor((Expresion)null);
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
      case PolePackage.DECL_VARIABLES__TIPO_DE_DATO:
        return TIPO_DE_DATO_EDEFAULT == null ? tipoDeDato != null : !TIPO_DE_DATO_EDEFAULT.equals(tipoDeDato);
      case PolePackage.DECL_VARIABLES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PolePackage.DECL_VARIABLES__VALOR:
        return valor != null;
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
    result.append(" (tipoDeDato: ");
    result.append(tipoDeDato);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeclVariablesImpl
