/**
 */
package tdt4250.stpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Of Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.StartOfStudy#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.stpl.StartOfStudy#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.stpl.StartOfStudy#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see tdt4250.stpl.StplPackage#getStartOfStudy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minSemesters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL minSemesters='self.semesters-&gt;size() &gt;= 4'"
 * @generated
 */
public interface StartOfStudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.stpl.StplPackage#getStartOfStudy_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.StartOfStudy#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.stpl.Semester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.stpl.Semester#getStudySpecialization <em>Study Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.stpl.StplPackage#getStartOfStudy_Semesters()
	 * @see tdt4250.stpl.Semester#getStudySpecialization
	 * @model opposite="studySpecialization" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.stpl.Specialization#getStudySpecializations <em>Study Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Specialization)
	 * @see tdt4250.stpl.StplPackage#getStartOfStudy_Program()
	 * @see tdt4250.stpl.Specialization#getStudySpecializations
	 * @model opposite="studySpecializations" transient="false"
	 * @generated
	 */
	Specialization getProgram();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.StartOfStudy#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Specialization value);

} // StartOfStudy
