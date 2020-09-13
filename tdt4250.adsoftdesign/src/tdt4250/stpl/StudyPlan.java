/**
 */
package tdt4250.stpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.stpl.StudyPlan#getDirections <em>Directions</em>}</li>
 *   <li>{@link tdt4250.stpl.StudyPlan#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.stpl.StplPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Directions</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.stpl.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' containment reference list.
	 * @see tdt4250.stpl.StplPackage#getStudyPlan_Directions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getDirections();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.stpl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.stpl.StplPackage#getStudyPlan_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // StudyPlan
