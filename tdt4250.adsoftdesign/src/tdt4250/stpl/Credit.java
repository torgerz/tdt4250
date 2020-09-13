/**
 */
package tdt4250.stpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Credit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.stpl.StplPackage#getCredit()
 * @model
 * @generated
 */
public enum Credit implements Enumerator {
	/**
	 * The '<em><b>FIVEPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVEPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	FIVEPOINTS(0, "FIVEPOINTS", "5"),

	/**
	 * The '<em><b>SEVENHALFPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENHALFPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	SEVENHALFPOINTS(1, "SEVENHALFPOINTS", "7.5"),

	/**
	 * The '<em><b>TENPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	TENPOINTS(2, "TENPOINTS", "10"),

	/**
	 * The '<em><b>FIFTEENPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTEENPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	FIFTEENPOINTS(3, "FIFTEENPOINTS", "15"),

	/**
	 * The '<em><b>TWENTYPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTYPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	TWENTYPOINTS(4, "TWENTYPOINTS", "20"),

	/**
	 * The '<em><b>THIRTYPOINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTYPOINTS_VALUE
	 * @generated
	 * @ordered
	 */
	THIRTYPOINTS(5, "THIRTYPOINTS", "30");

	/**
	 * The '<em><b>FIVEPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVEPOINTS
	 * @model literal="5"
	 * @generated
	 * @ordered
	 */
	public static final int FIVEPOINTS_VALUE = 0;

	/**
	 * The '<em><b>SEVENHALFPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENHALFPOINTS
	 * @model literal="7.5"
	 * @generated
	 * @ordered
	 */
	public static final int SEVENHALFPOINTS_VALUE = 1;

	/**
	 * The '<em><b>TENPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENPOINTS
	 * @model literal="10"
	 * @generated
	 * @ordered
	 */
	public static final int TENPOINTS_VALUE = 2;

	/**
	 * The '<em><b>FIFTEENPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTEENPOINTS
	 * @model literal="15"
	 * @generated
	 * @ordered
	 */
	public static final int FIFTEENPOINTS_VALUE = 3;

	/**
	 * The '<em><b>TWENTYPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTYPOINTS
	 * @model literal="20"
	 * @generated
	 * @ordered
	 */
	public static final int TWENTYPOINTS_VALUE = 4;

	/**
	 * The '<em><b>THIRTYPOINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTYPOINTS
	 * @model literal="30"
	 * @generated
	 * @ordered
	 */
	public static final int THIRTYPOINTS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Credit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Credit[] VALUES_ARRAY =
		new Credit[] {
			FIVEPOINTS,
			SEVENHALFPOINTS,
			TENPOINTS,
			FIFTEENPOINTS,
			TWENTYPOINTS,
			THIRTYPOINTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Credit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Credit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Credit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Credit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Credit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Credit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Credit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Credit get(int value) {
		switch (value) {
			case FIVEPOINTS_VALUE: return FIVEPOINTS;
			case SEVENHALFPOINTS_VALUE: return SEVENHALFPOINTS;
			case TENPOINTS_VALUE: return TENPOINTS;
			case FIFTEENPOINTS_VALUE: return FIFTEENPOINTS;
			case TWENTYPOINTS_VALUE: return TWENTYPOINTS;
			case THIRTYPOINTS_VALUE: return THIRTYPOINTS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Credit(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Credit
