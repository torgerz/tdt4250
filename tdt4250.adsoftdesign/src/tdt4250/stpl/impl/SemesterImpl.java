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
import org.eclipse.emf.ecore.util.EcoreUtil;

import tdt4250.stpl.Course;
import tdt4250.stpl.Semester;
import tdt4250.stpl.StartOfStudy;
import tdt4250.stpl.StplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SemesterImpl#getTeachingSemester <em>Teaching Semester</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SemesterImpl#getElectives <em>Electives</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SemesterImpl#getMandatories <em>Mandatories</em>}</li>
 *   <li>{@link tdt4250.stpl.impl.SemesterImpl#getStudySpecialization <em>Study Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeachingSemester() <em>Teaching Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachingSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String TEACHING_SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeachingSemester() <em>Teaching Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachingSemester()
	 * @generated
	 * @ordered
	 */
	protected String teachingSemester = TEACHING_SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectives() <em>Electives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electives;

	/**
	 * The cached value of the '{@link #getMandatories() <em>Mandatories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatories()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StplPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StplPackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeachingSemester() {
		return teachingSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeachingSemester(String newTeachingSemester) {
		String oldTeachingSemester = teachingSemester;
		teachingSemester = newTeachingSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StplPackage.SEMESTER__TEACHING_SEMESTER, oldTeachingSemester, teachingSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getElectives() {
		if (electives == null) {
			electives = new EObjectResolvingEList<Course>(Course.class, this, StplPackage.SEMESTER__ELECTIVES);
		}
		return electives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getMandatories() {
		if (mandatories == null) {
			mandatories = new EObjectResolvingEList<Course>(Course.class, this, StplPackage.SEMESTER__MANDATORIES);
		}
		return mandatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfStudy getStudySpecialization() {
		if (eContainerFeatureID() != StplPackage.SEMESTER__STUDY_SPECIALIZATION) return null;
		return (StartOfStudy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudySpecialization(StartOfStudy newStudySpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudySpecialization, StplPackage.SEMESTER__STUDY_SPECIALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudySpecialization(StartOfStudy newStudySpecialization) {
		if (newStudySpecialization != eInternalContainer() || (eContainerFeatureID() != StplPackage.SEMESTER__STUDY_SPECIALIZATION && newStudySpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newStudySpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudySpecialization != null)
				msgs = ((InternalEObject)newStudySpecialization).eInverseAdd(this, StplPackage.START_OF_STUDY__SEMESTERS, StartOfStudy.class, msgs);
			msgs = basicSetStudySpecialization(newStudySpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StplPackage.SEMESTER__STUDY_SPECIALIZATION, newStudySpecialization, newStudySpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudySpecialization((StartOfStudy)otherEnd, msgs);
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
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				return basicSetStudySpecialization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				return eInternalContainer().eInverseRemove(this, StplPackage.START_OF_STUDY__SEMESTERS, StartOfStudy.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StplPackage.SEMESTER__YEAR:
				return getYear();
			case StplPackage.SEMESTER__TEACHING_SEMESTER:
				return getTeachingSemester();
			case StplPackage.SEMESTER__ELECTIVES:
				return getElectives();
			case StplPackage.SEMESTER__MANDATORIES:
				return getMandatories();
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				return getStudySpecialization();
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
			case StplPackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case StplPackage.SEMESTER__TEACHING_SEMESTER:
				setTeachingSemester((String)newValue);
				return;
			case StplPackage.SEMESTER__ELECTIVES:
				getElectives().clear();
				getElectives().addAll((Collection<? extends Course>)newValue);
				return;
			case StplPackage.SEMESTER__MANDATORIES:
				getMandatories().clear();
				getMandatories().addAll((Collection<? extends Course>)newValue);
				return;
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				setStudySpecialization((StartOfStudy)newValue);
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
			case StplPackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StplPackage.SEMESTER__TEACHING_SEMESTER:
				setTeachingSemester(TEACHING_SEMESTER_EDEFAULT);
				return;
			case StplPackage.SEMESTER__ELECTIVES:
				getElectives().clear();
				return;
			case StplPackage.SEMESTER__MANDATORIES:
				getMandatories().clear();
				return;
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				setStudySpecialization((StartOfStudy)null);
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
			case StplPackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case StplPackage.SEMESTER__TEACHING_SEMESTER:
				return TEACHING_SEMESTER_EDEFAULT == null ? teachingSemester != null : !TEACHING_SEMESTER_EDEFAULT.equals(teachingSemester);
			case StplPackage.SEMESTER__ELECTIVES:
				return electives != null && !electives.isEmpty();
			case StplPackage.SEMESTER__MANDATORIES:
				return mandatories != null && !mandatories.isEmpty();
			case StplPackage.SEMESTER__STUDY_SPECIALIZATION:
				return getStudySpecialization() != null;
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
		result.append(" (year: ");
		result.append(year);
		result.append(", teachingSemester: ");
		result.append(teachingSemester);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
