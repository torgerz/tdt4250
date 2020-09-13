/**
 */
package tdt4250.stpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.Specialization#getDirection <em>Direction</em>}</li>
 *   <li>{@link tdt4250.stpl.Specialization#getStudySpecializations <em>Study Specializations</em>}</li>
 *   <li>{@link tdt4250.stpl.Specialization#getSubspecialization <em>Subspecialization</em>}</li>
 * </ul>
 *
 * @see tdt4250.stpl.StplPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see tdt4250.stpl.StplPackage#getSpecialization_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.Specialization#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Study Specializations</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.stpl.StartOfStudy#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Specializations</em>' containment reference.
	 * @see #setStudySpecializations(StartOfStudy)
	 * @see tdt4250.stpl.StplPackage#getSpecialization_StudySpecializations()
	 * @see tdt4250.stpl.StartOfStudy#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	StartOfStudy getStudySpecializations();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.Specialization#getStudySpecializations <em>Study Specializations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Specializations</em>' containment reference.
	 * @see #getStudySpecializations()
	 * @generated
	 */
	void setStudySpecializations(StartOfStudy value);

	/**
	 * Returns the value of the '<em><b>Subspecialization</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.stpl.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subspecialization</em>' reference list.
	 * @see tdt4250.stpl.StplPackage#getSpecialization_Subspecialization()
	 * @model
	 * @generated
	 */
	EList<Specialization> getSubspecialization();

} // Specialization
