/**
 */
package tdt4250.stpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.stpl.Semester#getTeachingSemester <em>Teaching Semester</em>}</li>
 *   <li>{@link tdt4250.stpl.Semester#getElectives <em>Electives</em>}</li>
 *   <li>{@link tdt4250.stpl.Semester#getMandatories <em>Mandatories</em>}</li>
 *   <li>{@link tdt4250.stpl.Semester#getStudySpecialization <em>Study Specialization</em>}</li>
 * </ul>
 *
 * @see tdt4250.stpl.StplPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minimumOneCourse'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.stpl.StplPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Teaching Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teaching Semester</em>' attribute.
	 * @see #setTeachingSemester(String)
	 * @see tdt4250.stpl.StplPackage#getSemester_TeachingSemester()
	 * @model
	 * @generated
	 */
	String getTeachingSemester();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.Semester#getTeachingSemester <em>Teaching Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teaching Semester</em>' attribute.
	 * @see #getTeachingSemester()
	 * @generated
	 */
	void setTeachingSemester(String value);

	/**
	 * Returns the value of the '<em><b>Electives</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.stpl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electives</em>' reference list.
	 * @see tdt4250.stpl.StplPackage#getSemester_Electives()
	 * @model
	 * @generated
	 */
	EList<Course> getElectives();

	/**
	 * Returns the value of the '<em><b>Mandatories</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.stpl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatories</em>' reference list.
	 * @see tdt4250.stpl.StplPackage#getSemester_Mandatories()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatories();

	/**
	 * Returns the value of the '<em><b>Study Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.stpl.StartOfStudy#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Specialization</em>' container reference.
	 * @see #setStudySpecialization(StartOfStudy)
	 * @see tdt4250.stpl.StplPackage#getSemester_StudySpecialization()
	 * @see tdt4250.stpl.StartOfStudy#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	StartOfStudy getStudySpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.stpl.Semester#getStudySpecialization <em>Study Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Specialization</em>' container reference.
	 * @see #getStudySpecialization()
	 * @generated
	 */
	void setStudySpecialization(StartOfStudy value);

} // Semester
