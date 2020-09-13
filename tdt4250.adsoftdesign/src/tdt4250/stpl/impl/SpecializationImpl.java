/**
 */
package tdt4250.stpl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.stpl.Specialization;
import tdt4250.stpl.StartOfStudy;
import tdt4250.stpl.StplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.impl.SpecializationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SpecializationImpl#getStudySpecializations <em>Study Specializations</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SpecializationImpl#getSubspecialization <em>Subspecialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudySpecializations() <em>Study Specializations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudySpecializations()
	 * @generated
	 * @ordered
	 */
	protected StartOfStudy studySpecializations;

	/**
	 * The cached value of the '{@link #getSubspecialization() <em>Subspecialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubspecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> subspecialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StplPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StplPackage.SPECIALIZATION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfStudy getStudySpecializations() {
		return studySpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudySpecializations(StartOfStudy newStudySpecializations, NotificationChain msgs) {
		StartOfStudy oldStudySpecializations = studySpecializations;
		studySpecializations = newStudySpecializations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS, oldStudySpecializations, newStudySpecializations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudySpecializations(StartOfStudy newStudySpecializations) {
		if (newStudySpecializations != studySpecializations) {
			NotificationChain msgs = null;
			if (studySpecializations != null)
				msgs = ((InternalEObject)studySpecializations).eInverseRemove(this, StplPackage.START_OF_STUDY__PROGRAM, StartOfStudy.class, msgs);
			if (newStudySpecializations != null)
				msgs = ((InternalEObject)newStudySpecializations).eInverseAdd(this, StplPackage.START_OF_STUDY__PROGRAM, StartOfStudy.class, msgs);
			msgs = basicSetStudySpecializations(newStudySpecializations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS, newStudySpecializations, newStudySpecializations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSubspecialization() {
		if (subspecialization == null) {
			subspecialization = new EObjectResolvingEList<Specialization>(Specialization.class, this, StplPackage.SPECIALIZATION__SUBSPECIALIZATION);
		}
		return subspecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				if (studySpecializations != null)
					msgs = ((InternalEObject)studySpecializations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS, null, msgs);
				return basicSetStudySpecializations((StartOfStudy)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				return basicSetStudySpecializations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__DIRECTION:
				return getDirection();
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				return getStudySpecializations();
			case StplPackage.SPECIALIZATION__SUBSPECIALIZATION:
				return getSubspecialization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__DIRECTION:
				setDirection((String)newValue);
				return;
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				setStudySpecializations((StartOfStudy)newValue);
				return;
			case StplPackage.SPECIALIZATION__SUBSPECIALIZATION:
				getSubspecialization().clear();
				getSubspecialization().addAll((Collection<? extends Specialization>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				setStudySpecializations((StartOfStudy)null);
				return;
			case StplPackage.SPECIALIZATION__SUBSPECIALIZATION:
				getSubspecialization().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StplPackage.SPECIALIZATION__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case StplPackage.SPECIALIZATION__STUDY_SPECIALIZATIONS:
				return studySpecializations != null;
			case StplPackage.SPECIALIZATION__SUBSPECIALIZATION:
				return subspecialization != null && !subspecialization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
